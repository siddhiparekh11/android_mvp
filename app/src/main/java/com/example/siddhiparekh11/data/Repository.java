package com.example.siddhiparekh11.data;

import com.example.siddhiparekh11.data.localdatasource.LocalDataSource;
import com.example.siddhiparekh11.data.remote.RemoteDataSource;

import java.util.ArrayList;

/**
 * Created by siddhiparekh11 on 3/18/18.
 */

//singleton class
//synchronization between localdatasource and remotedatasource ... in case there is no data in the localdatasource/cache it will load data from remotedatasource
public class Repository implements DataSource {

    private static Repository repository;
    private RemoteDataSource remoteDataSource;
    private LocalDataSource localDataSource;

    private Repository()
    {
        remoteDataSource = new RemoteDataSource();
        localDataSource = new LocalDataSource();

    }

    public static Repository getInstance()
    {
        if(repository==null)
        {
            repository = new Repository();
        }
        return repository;
    }
    @Override
    public void loaddata() {
              remoteDataSource.loaddata();
              localDataSource.loaddata();
    }

    @Override
    public ArrayList<String> getdata() {
        ArrayList<String> fullnames = new ArrayList<String>();
        ArrayList<String> firstnames = localDataSource.getdata();
        ArrayList<String> lastnames = remoteDataSource.getdata();

        for (int i = 0; i < firstnames.size(); i++) {
            fullnames.add(firstnames.get(i) + " " + lastnames.get(i));
        }

        return fullnames;
    }
}
