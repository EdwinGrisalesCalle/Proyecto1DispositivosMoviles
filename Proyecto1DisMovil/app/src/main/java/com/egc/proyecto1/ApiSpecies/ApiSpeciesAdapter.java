package com.egc.proyecto1.ApiSpecies;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiSpeciesAdapter {

    private static ApiSpeciesService API_SERVICE;

    public static ApiSpeciesService getApiService(){

        HttpLoggingInterceptor looging = new HttpLoggingInterceptor();
        looging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        httpClient.addInterceptor(looging);

        String baseUrl = "https://api.gbif.org/v1/";

        if (API_SERVICE == null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build();
            API_SERVICE = retrofit.create(ApiSpeciesService.class);
        }

        return API_SERVICE;
    }
}
