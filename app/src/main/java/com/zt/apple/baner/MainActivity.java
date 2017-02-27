package com.zt.apple.baner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Banner banner = (Banner) findViewById(R.id.banner);
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1488802022&di=e3326642f9d455512a260d2e9c30d316&imgtype=jpg&er=1&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F17%2F25%2F97%2F01c58PICyH9_1024.jpg");
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1488802049&di=1a7d6316cc49ebf4dd9fcfa0a269fa1a&imgtype=jpg&er=1&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F17%2F52%2F15%2F25d58PIC8XD_1024.jpg");
        list.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1488802049&di=1a7d6316cc49ebf4dd9fcfa0a269fa1a&imgtype=jpg&er=1&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F17%2F52%2F15%2F25d58PIC8XD_1024.jpg");
        banner.setImages(list).setImageLoader(new GlideImageLoader()).start();
    }
}
