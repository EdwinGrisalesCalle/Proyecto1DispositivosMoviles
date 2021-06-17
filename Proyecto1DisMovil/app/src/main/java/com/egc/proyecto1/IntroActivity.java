package com.egc.proyecto1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.egc.proyecto1.ApiNotice.ApiNoticeAdapter;
import com.egc.proyecto1.IntroScreen.IntroViewPagerAdapter;
import com.egc.proyecto1.IntroScreen.ScreenItem;
import com.egc.proyecto1.ModelsApiNotice.Article;
import com.egc.proyecto1.responseNotice.ArticleResponse;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class IntroActivity extends AppCompatActivity implements View.OnClickListener {

    ArticleResponse articleResponse;
    private static final String TAG = "SPECIEDEX";


    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter ;
    TabLayout tabIndicador;
    Button btnGetStarted;
    int position = 0;
    private Button btnSend;
    final List<ScreenItem> mList = new ArrayList<>();
    Animation btnAnim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        obtenerNoticias();

        btnSend = findViewById(R.id.BtnNext);
        btnGetStarted = findViewById(R.id.btn_get_started);
        btnSend.setOnClickListener(this);
        btnGetStarted.setOnClickListener(this);
        tabIndicador = findViewById(R.id.tab_indicador);
        btnAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_animation);

        // setup viewpager
        screenPager =findViewById(R.id.screen_viewpager);

        //setup tablayout with viewpager
       tabIndicador.setupWithViewPager(screenPager);



       //tablayout add change listener

        tabIndicador.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == mList.size()-1){
                    loadLastScreen();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void onClick(View v) {
        position = screenPager.getCurrentItem();

        if (position < mList.size()){

            position++;
            screenPager.setCurrentItem(position);
        }

        if (position == mList.size()-1){
            loadLastScreen();
        }

        if (v.getId() == R.id.btn_get_started){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }



    private void loadLastScreen() {
        btnSend.setVisibility(View.INVISIBLE);
        btnGetStarted.setVisibility(View.VISIBLE);
        tabIndicador.setVisibility(View.INVISIBLE);
        btnGetStarted.setAnimation(btnAnim);

    }

    public  void obtenerNoticias(){
        Call<ArticleResponse> articleResponseCall = ApiNoticeAdapter.getApiServiceNotice().obtenerListaNotices();

        articleResponseCall.enqueue(new Callback<ArticleResponse>() {
            @Override
            public void onResponse(Call<ArticleResponse> call, Response<ArticleResponse> response) {
                if (response.isSuccessful()){
                    articleResponse = response.body();

                    mList.add(new ScreenItem(articleResponse.getArticles().get(1).getTitle(),
                            articleResponse.getArticles().get(1).getDescription(),
                            articleResponse.getArticles().get(1).getUrlToImage(),
                            articleResponse.getArticles().get(1).getUrl()));

                    mList.add(new ScreenItem(articleResponse.getArticles().get(3).getTitle(),
                            articleResponse.getArticles().get(3).getDescription(),
                            articleResponse.getArticles().get(3).getUrlToImage(),
                            articleResponse.getArticles().get(3).getUrl()));

                    mList.add(new ScreenItem(articleResponse.getArticles().get(6).getTitle(),
                            articleResponse.getArticles().get(6).getDescription(),
                            articleResponse.getArticles().get(6).getUrlToImage(),
                            articleResponse.getArticles().get(6).getUrl()));

                    mList.add(new ScreenItem(articleResponse.getArticles().get(8).getTitle(),
                            articleResponse.getArticles().get(8).getDescription(),
                            articleResponse.getArticles().get(8).getUrlToImage(),
                            articleResponse.getArticles().get(8).getUrl()));


                    introViewPagerAdapter = new IntroViewPagerAdapter(IntroActivity.this,mList);
                    screenPager.setAdapter(introViewPagerAdapter);
                }
            }
            @Override
            public void onFailure(Call<ArticleResponse> call, Throwable t) {

            }
        });
    }

}


