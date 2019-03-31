package com.example.recyclerviewlogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailTempatActivity extends AppCompatActivity {
    TextView tvName,tvOverview;
    ImageView ivMarvel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvName = findViewById(R.id.tv1);
        tvOverview = findViewById(R.id.tv_overview);
        ivMarvel = findViewById(R.id.pic);

        String name = getIntent().getStringExtra("name");
        String overview = getIntent().getStringExtra("overview");
        int gambar = getIntent().getIntExtra("gambar",0);

        tvName.setText(name);
        tvOverview.setText(overview);
        ivMarvel.setImageResource(gambar);
    }
}
