package com.example.siddhiparekh11.mvp;

import com.example.siddhiparekh11.data.Repository;

import java.util.ArrayList;

/**
 * Created by siddhiparekh11 on 3/16/18.
 */

public class Presenter implements Contract.ActivityPresenter {

    Contract.ActivityView view;
    Repository repository;

    @Override
    public void start() {
        loaddata();
        getdata();

    }
    public Presenter(Contract.ActivityView v)
    {

        view=v;
        view.setPresenter(this);
        repository = Repository.getInstance();
    }

    @Override
    public void loaddata() {

        repository.loaddata();
    }

    @Override
    public void getdata() {
        view.binddata(repository.getdata());
    }
}
