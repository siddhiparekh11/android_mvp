package com.example.siddhiparekh11.data.localdatasource;

import com.example.siddhiparekh11.data.DataSource;

import java.util.ArrayList;

/**
 * Created by siddhiparekh11 on 3/18/18.
 */
//sqlite or cache data
public class LocalDataSource implements DataSource {

    ArrayList<String> firstnames;

    public LocalDataSource()
    {
        firstnames = new ArrayList<String>();
    }
    @Override
    public void loaddata() {

         firstnames.add("Siddhi");
         firstnames.add("Poornima");
         firstnames.add("Prachi");
         firstnames.add("Hemangini");
         firstnames.add("Suma");

    }

    @Override
    public ArrayList<String> getdata() {
        return firstnames;
    }
}
