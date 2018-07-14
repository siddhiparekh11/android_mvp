package com.example.siddhiparekh11.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.siddhiparekh11.data.adapters.MainAdapter;

import java.util.ArrayList;


public class Activity extends AppCompatActivity implements Contract.ActivityView {

   Contract.ActivityPresenter presenter;
   RecyclerView rview;
   ArrayList<String> data1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter = new Presenter(this);
        rview=(RecyclerView)findViewById(R.id.rview1);
        rview.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void setPresenter(Presenter P) {

        presenter=P;
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.start();

       MainAdapter adapter = new MainAdapter(data1);
        rview.setAdapter(adapter);


    }

    @Override
    public void binddata(ArrayList<String> data) {

        data1=new ArrayList<String>();
        data1=data;

    }
}
