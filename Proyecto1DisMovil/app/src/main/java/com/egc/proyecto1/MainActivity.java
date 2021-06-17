package com.egc.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.egc.proyecto1.ApiNotice.ApiNoticeAdapter;
import com.egc.proyecto1.ApiSpecies.ApiSpeciesAdapter;
import com.egc.proyecto1.ModelsApiNotice.Article;
import com.egc.proyecto1.ModelsApiSpecie.ChildrenSpecie;
import com.egc.proyecto1.recyclerview.AdapterSpecie;
import com.egc.proyecto1.ModelsApiSpecie.Specie;
import com.egc.proyecto1.responseNotice.ArticleResponse;
import com.egc.proyecto1.responseSpecie.SpecieResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import androidx.core.app.ActivityOptionsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {



    private ListView listViewSpecies;
    private  ArrayList<Specie> list = new ArrayList<>();
    private Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        obtenerDatos();
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.activity_main);
        listViewSpecies = findViewById(R.id.ListSpecies);
        btnReturn = findViewById(R.id.btnReturn);
        AdapterSpecie adapter = new AdapterSpecie(this,list);
        listViewSpecies.setAdapter(adapter);
        listViewSpecies.setOnItemClickListener(this);
        btnReturn.setOnClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent intent = new Intent(this,Activity_Specie_Details.class);
        intent.putExtra("SpecieObject",list.get(position));
      startActivity(intent,ActivityOptionsCompat.makeSceneTransitionAnimation(this).toBundle());

    }

    private void obtenerDatos() {
        Call<SpecieResponse>  specieRequestCall = ApiSpeciesAdapter.getApiService().obtenerListaSpecies();

        specieRequestCall.enqueue(new Callback<SpecieResponse>() {
            @Override
            public void onResponse(Call<SpecieResponse> call, Response<SpecieResponse> response) {
                if (response.isSuccessful()){
                    SpecieResponse specieResponse = response.body();
                    ArrayList<Specie> listSpecies = specieResponse.getResult();
                    list.addAll(listSpecies);
                    llenarListvew(list);
                }

            }

            @Override
            public void onFailure(Call<SpecieResponse> call, Throwable t) {

            }
        });
    }


    public void llenarListvew(ArrayList<Specie> list){
        AdapterSpecie adapter = new AdapterSpecie(this,list);
        listViewSpecies.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnReturn){
            Intent intent = new Intent(this,IntroActivity.class);
            startActivity(intent);
        }
    }
}