package com.egc.proyecto1.ApiNotice;

import com.egc.proyecto1.ApiSpecies.ApiSpeciesService;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiNoticeAdapter {
    private static ApiNoticeService API_SERVICE_NOTICE;

    public static ApiNoticeService getApiServiceNotice(){

        HttpLoggingInterceptor looging = new HttpLoggingInterceptor();
        looging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        httpClient.addInterceptor(looging);

        String baseUrl = "https://newsapi.org/v2/";

        if (API_SERVICE_NOTICE == null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build();
            API_SERVICE_NOTICE = retrofit.create(ApiNoticeService.class);
        }

        return API_SERVICE_NOTICE;
    }
}
