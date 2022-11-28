package com.example.a2018091_restapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Toast;

import com.example.a2018091_restapi.adapter.FaskesAdapter;
import com.example.a2018091_restapi.model.FaskesList;
import com.example.a2018091_restapi.viewmodel.FaskesViewModel;

public class MainActivity extends AppCompatActivity{
    RecyclerView recylerView;
    FaskesAdapter adapter;
    FaskesViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recylerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recylerView.setLayoutManager(linearLayoutManager);
        viewModel = new FaskesViewModel();
        viewModel.getFaskesList().observe(this, new Observer<FaskesList>() {
            @Override
            public void onChanged(FaskesList faskesList) {
                if (faskesList.getData() != null) {
                    adapter = new FaskesAdapter(MainActivity.this, faskesList.getData());
                    adapter.notifyDataSetChanged();
                    recylerView.setAdapter(adapter);
                } else {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}