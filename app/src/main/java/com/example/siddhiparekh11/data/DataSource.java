package com.example.siddhiparekh11.data;

import java.util.ArrayList;

/**
 * Created by siddhiparekh11 on 3/17/18.
 */

// all the crud methods as well as other database methods you want to implement
public interface DataSource {

    void loaddata();
    ArrayList<String> getdata();

}
