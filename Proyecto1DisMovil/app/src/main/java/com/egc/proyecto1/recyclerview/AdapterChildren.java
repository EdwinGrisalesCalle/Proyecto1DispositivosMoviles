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
import com.egc.proyecto1.ModelsApiSpecie.ChildrenSpecie;
import com.egc.proyecto1.R;
import com.egc.proyecto1.responseSpecie.MediaResponse;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AdapterChildren extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<ChildrenSpecie> childrenSpecies;

    public AdapterChildren(Activity activity, ArrayList<ChildrenSpecie> childrenSpecies) {
        this.activity = activity;
        this.childrenSpecies = childrenSpecies;
    }
    MediaResponse responseMedia;

    @Override
    public int getCount() {
        return childrenSpecies.size();
    }

    @Override
    public Object getItem(int position) {
        return childrenSpecies.get(position);
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
            v = inf.inflate(R.layout.item_children,null);
        }
        ChildrenSpecie specieElement = childrenSpecies.get(position);

        // urlImg = obtenerImagen(specieElement.sourceTaxonKey);

        TextView taxonId = v.findViewById(R.id.taxonId);
        taxonId.setText(String.valueOf(specieElement.getTaxonID()));

        TextView kingdom = v.findViewById(R.id.kingdom);
        kingdom.setText(specieElement.getKingdom());

        TextView phylum = v.findViewById(R.id.phylum);
        phylum.setText(specieElement.phylum);

        TextView status = v.findViewById(R.id.txtStatus);
        status.setText(specieElement.taxonomicStatus);

        TextView Descendents = v.findViewById(R.id.txtDescends);
        Descendents.setText(String.valueOf(specieElement.numDescendants));

        ImageView photo = v.findViewById(R.id.imageViewChildren);
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
