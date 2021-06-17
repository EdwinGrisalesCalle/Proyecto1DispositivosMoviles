package com.egc.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.egc.proyecto1.ApiSpecies.ApiSpeciesAdapter;
import com.egc.proyecto1.ModelsApiSpecie.ChildrenSpecie;
import com.egc.proyecto1.ModelsApiSpecie.Specie;
import com.egc.proyecto1.recyclerview.AdapterChildren;
import com.egc.proyecto1.recyclerview.AdapterSpecie;
import com.egc.proyecto1.responseSpecie.ChildrenResponse;
import com.egc.proyecto1.responseSpecie.DescriptionResponse;
import com.egc.proyecto1.responseSpecie.MediaResponse;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Activity_Specie_Details extends AppCompatActivity {

    ChildrenResponse childrenResponse;
    MediaResponse responseMedia;
    DescriptionResponse descriptionResponse;
    ImageView imgContainer,imgSpecie;
    TextView textNameSpecie,specieName,textScientific,
            scientificName,textTaxonId,idTaxon,textDescription;
    ListView listViewChildren;
    private  ArrayList<ChildrenSpecie> list = new ArrayList<>();
    private static final String TAG = "object";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specie_details);

        Specie specie = (Specie) getIntent().getSerializableExtra("SpecieObject");

        imgSpecie = findViewById(R.id.imageSpecie);
        imgContainer = findViewById(R.id.container);
        listViewChildren = findViewById(R.id.listChildren);
        textNameSpecie = findViewById(R.id.textNameSpecie);
        specieName = findViewById(R.id.specieName);
        textScientific = findViewById(R.id.textScientific);
        scientificName = findViewById(R.id.scientificName);
        textTaxonId = findViewById(R.id.textTaxonId);
        idTaxon = findViewById(R.id.idTaxon);
        textDescription = findViewById(R.id.txtDescription);
        textDescription.setMovementMethod(new ScrollingMovementMethod());
        scientificName.setText(specie.getScientificName());
        specieName.setText(specie.getKingdom());
        idTaxon.setText(specie.getTaxonID());
        obtenerListChildren(specie.key);
        obtenerImagen(specie.key,imgSpecie);

    }

    public void obtenerListChildren(int key){
        Call<ChildrenResponse> call = ApiSpeciesAdapter.getApiService().getChildren(key);

        call.enqueue(new Callback<ChildrenResponse>() {
            @Override
            public void onResponse(Call<ChildrenResponse> call, Response<ChildrenResponse> response) {
                if (response.isSuccessful()){
                     childrenResponse = response.body();
                    AdapterChildren adapter = new AdapterChildren(Activity_Specie_Details.this,childrenResponse.getresults());
                    listViewChildren.setAdapter(adapter);

                    ArrayList<ChildrenSpecie> listChildren = childrenResponse.getresults();

                    for (int i =0; i < listChildren.size();i++){
                        ChildrenSpecie specie = listChildren.get(i);
                        Log.i(TAG, "Specie Hijas " + specie.getKey() +" "+ specie.getKingdom());
                    }

                }
            }

            @Override
            public void onFailure(Call<ChildrenResponse> call, Throwable t) {

            }
        });
    }

    private void obtenerImagen(int taxonKey,ImageView img) {
        Call<MediaResponse> mediaCall = ApiSpeciesAdapter.getApiService().getMedia(taxonKey);

        mediaCall.enqueue(new Callback<MediaResponse>() {
            @Override
            public void onResponse(Call<MediaResponse> call, Response<MediaResponse> response) {
                responseMedia = response.body();
                if (responseMedia.getResults().size() != 0){
                    Picasso.with(Activity_Specie_Details.this).load(responseMedia.getResults().get(0).identifier)
                            .error(R.drawable.cc).into(img);
                }else{
                    Picasso.with(Activity_Specie_Details.this).load(R.drawable.cc).into(img);
                }
                obtenerDescripcion(taxonKey);
            }

            @Override
            public void onFailure(Call<MediaResponse> call, Throwable t) {

            }
        });
    }


    public void obtenerDescripcion(int key){
        Call<DescriptionResponse> descriptionResponseCall = ApiSpeciesAdapter.getApiService().getDescripcion(key);

        descriptionResponseCall.enqueue(new Callback<DescriptionResponse>() {
            @Override
            public void onResponse(Call<DescriptionResponse> call, Response<DescriptionResponse> response) {
                if (response.isSuccessful()){
                    descriptionResponse = response.body();
                    if (descriptionResponse.getResults().size() != 0){
                        textDescription.setText(descriptionResponse.getResults().get(0).getDescription());
                    }else{
                        textDescription.setText("Recurso no encontrado");

                    }
                }
            }

            @Override
            public void onFailure(Call<DescriptionResponse> call, Throwable t) {

            }
        });

    }



}