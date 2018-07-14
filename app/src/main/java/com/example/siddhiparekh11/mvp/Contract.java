package com.example.siddhiparekh11.mvp;

import java.util.ArrayList;

/**
 * Created by siddhiparekh11 on 3/16/18.
 */

public interface Contract {

    interface ActivityView {

        void setPresenter(Presenter P);
        void binddata(ArrayList<String> data);


    }
    interface ActivityPresenter {

        void start();
        void loaddata();
        void getdata();
    }
}
