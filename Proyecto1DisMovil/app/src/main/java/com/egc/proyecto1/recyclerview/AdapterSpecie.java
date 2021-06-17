package com.egc.proyecto1.recyclerview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.egc.proyecto1.ApiSpecies.ApiSpeciesAdapter;
import com.egc.proyecto1.ModelsApiSpecie.Specie;
import com.egc.proyecto1.R;
import com.egc.proyecto1.responseSpecie.MediaResponse;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AdapterSpecie extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Specie> species;



    public AdapterSpecie(Activity activity, ArrayList<Specie> species) {
        this.activity = activity;
        this.species = species;
    }
    MediaResponse responseMedia;
    @Override
    public int getCount() {
        return species.size();
    }

    @Override
    public Object getItem(int position) {
        return species.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View v = convertView;
        if (convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.item_specie,null);
        }
        Specie specieElement = species.get(position);

       // urlImg = obtenerImagen(specieElement.sourceTaxonKey);

        TextView specieTaxon = v.findViewById(R.id.idTaxon);
        specieTaxon.setText(String.valueOf(specieElement.getTaxonID()));

        TextView specieName = v.findViewById(R.id.specieName);
        specieName.setText(specieElement.getKingdom());

        TextView specieScientificName = v.findViewById(R.id.scientificName);
        specieScientificName.setText(specieElement.getScientificName());


        ImageView photo = v.findViewById(R.id.imageSpecie);
        obtenerImagen(specieElement.key,photo);

        return v;
    }

    private void obtenerImagen(int taxonKey,ImageView img) {
        final String TAG = "SPECIEDEX";
        Call<MediaResponse> mediaCall = ApiSpeciesAdapter.getApiService().getMedia(taxonKey);
        // String urlImg;
        mediaCall.enqueue(new Callback<MediaResponse>() {
            @Override
            public void onResponse(Call<MediaResponse> call, Response<MediaResponse> response) {
                responseMedia = response.body();
                if (responseMedia.getResults().size() != 0){
                    Picasso.with(activity).load(responseMedia.getResults().get(0).identifier)
                            .error(R.drawable.cc).into(img);
                }else{
                    Picasso.with(activity).load(R.drawable.cc).into(img);
                }
            }

            @Override
            public void onFailure(Call<MediaResponse> call, Throwable t) {

            }
        });
    }

}
