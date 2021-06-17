package com.egc.proyecto1.ApiSpecies;

import com.egc.proyecto1.responseSpecie.DescriptionResponse;
import com.egc.proyecto1.responseSpecie.MediaResponse;
import com.egc.proyecto1.responseSpecie.SpecieResponse;
import com.egc.proyecto1.responseSpecie.ChildrenResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiSpeciesService {
    @GET("species")
    Call<SpecieResponse> obtenerListaSpecies();

    @GET("species/{int}")
    Call<SpecieResponse> obtenerSpecie(@Path("int") int id);

    @GET("species/{int}/name")
    Call<SpecieResponse> obtenerNombre(@Path("int") int id);

    @GET("species/{int}/children")
    Call<ChildrenResponse> getChildren(@Path("int") int id);

    @GET("species/{int}/descriptions")
    Call<DescriptionResponse> getDescripcion(@Path("int") int id);

    @GET("species/{int}/media")
    Call<MediaResponse> getMedia(@Path("int") int id);
}
