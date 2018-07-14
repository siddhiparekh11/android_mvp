package com.example.siddhiparekh11.data.remote;

import com.example.siddhiparekh11.data.DataSource;

import java.util.ArrayList;

/**
 * Created by siddhiparekh11 on 3/17/18.
 */

// firebase connectivity
public class RemoteDataSource implements DataSource {

    ArrayList<String>  lastNames;

    public RemoteDataSource()
    {
        lastNames = new ArrayList<String>();
    }
    @Override
    public void loaddata() {

        lastNames.add("Parekh");
        lastNames.add("Srikantesh");
        lastNames.add("Patel");
        lastNames.add("Aggrawal");
        lastNames.add("Kursheed");

    }

    @Override
    public ArrayList<String> getdata() {
        return lastNames;
    }
}
