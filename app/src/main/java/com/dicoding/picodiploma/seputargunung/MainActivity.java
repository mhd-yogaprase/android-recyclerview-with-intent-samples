package com.dicoding.picodiploma.seputargunung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMount;
    private ArrayList<Mount> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.btn_fab_about);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutMoveActivity.class);
                startActivity(intent);
            }
        });

        rvMount = findViewById(R.id.rv_mount);
        rvMount.setHasFixedSize(true);

        list.addAll(MountData.getListData());
        showRecyclerList();
    }

    public void showRecyclerList() {
        rvMount.setLayoutManager(new LinearLayoutManager(this));
        ListMountAdapter listMountAdapter = new ListMountAdapter(list);
        rvMount.setAdapter(listMountAdapter);

        listMountAdapter.setOnItemClickCallBack(new ListMountAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(Mount data) {
                Intent moveIntent = new Intent(MainActivity.this, MountMoveDetailActivity.class);
                moveIntent.putExtra(MountMoveDetailActivity.EXTRA_LINK, data.getPhoto());
                moveIntent.putExtra(MountMoveDetailActivity.EXTRA_NAME, data.getName());
                moveIntent.putExtra(MountMoveDetailActivity.EXTRA_DETAIL, data.getDetail());
                moveIntent.putExtra(MountMoveDetailActivity.EXTRA_TRACK, data.getTrack());
                startActivity(moveIntent);
            }
        });
    }
}
