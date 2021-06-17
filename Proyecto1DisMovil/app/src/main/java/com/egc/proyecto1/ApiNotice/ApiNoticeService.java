package com.egc.proyecto1.ApiNotice;

import com.egc.proyecto1.responseNotice.ArticleResponse;
import com.egc.proyecto1.responseSpecie.SpecieResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiNoticeService {

    @GET("everything?q=animales&from=2021-06-10&to=2021-06-10&sortBy=popularity&apiKey=2178ac01407f49eba1ee110a2d9e17c6")
    Call<ArticleResponse> obtenerListaNotices();
}
