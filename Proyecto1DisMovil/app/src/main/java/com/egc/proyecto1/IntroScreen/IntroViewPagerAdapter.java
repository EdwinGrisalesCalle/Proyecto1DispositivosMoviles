package com.egc.proyecto1.IntroScreen;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.egc.proyecto1.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class IntroViewPagerAdapter extends PagerAdapter {

   Context mContext ;
   List<ScreenItem> mListScreen;

    public IntroViewPagerAdapter(Context mContext, List<ScreenItem> mListScreen) {
        this.mContext = mContext;
        this.mListScreen = mListScreen;
    }
    Animation scaleUp;
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen = inflater.inflate(R.layout.layout_screen,null);

        ImageView imgSlide = layoutScreen.findViewById(R.id.intro_img);
        Picasso.with(mContext).load(mListScreen.get(position).getScreenImg())
                .error(R.drawable.cc).into(imgSlide);

        TextView title = layoutScreen.findViewById(R.id.intro_title);
        title.setText(mListScreen.get(position).getTitle());


        TextView description = layoutScreen.findViewById(R.id.intro_description);
        description.setMovementMethod(new ScrollingMovementMethod());

        description.setText(mListScreen.get(position).getDescription());



        Button btnUrlArticle = layoutScreen.findViewById(R.id.btnUrlArticle);
        scaleUp = AnimationUtils.loadAnimation(mContext,R.anim.scale_up);

        btnUrlArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri _link = Uri.parse(mListScreen.get(position).getUrlArticle());
                Intent intent = new Intent(Intent.ACTION_VIEW, _link);
                mContext.startActivity(intent);
            }
        });



        container.addView(layoutScreen);

        return layoutScreen;

    }

    @Override
    public int getCount() {
        return mListScreen.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
