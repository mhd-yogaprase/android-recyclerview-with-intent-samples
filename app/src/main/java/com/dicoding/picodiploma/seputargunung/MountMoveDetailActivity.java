package com.dicoding.picodiploma.seputargunung;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class MountMoveDetailActivity extends AppCompatActivity {
    public static final String EXTRA_LINK = "extra_link";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_TRACK = "extra_track";

    ImageView imgPhoto;
    TextView tvName, tvDetail, tvTrack;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String link = getIntent().getStringExtra(EXTRA_LINK);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        String track = getIntent().getStringExtra(EXTRA_TRACK);
        setContentView(R.layout.item_detail_mount);

        imgPhoto = findViewById(R.id.img_item_photo);
        tvName = findViewById(R.id.tv_item_name);
        tvDetail = findViewById(R.id.tv_item_detail);
        tvTrack = findViewById(R.id.tv_item_track);


        Glide.with(this)
                .load(link)

                .into(imgPhoto);
        tvName.setText(name);
        tvDetail.setText(detail);
        tvTrack.setText(track);

        Toast.makeText(this, "Informasi Gunung " + name, Toast.LENGTH_SHORT).show();
    }
}
