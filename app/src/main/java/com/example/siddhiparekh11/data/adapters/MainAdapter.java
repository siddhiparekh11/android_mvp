package com.example.siddhiparekh11.data.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.siddhiparekh11.mvp.R;

import java.util.ArrayList;

/**
 * Created by siddhiparekh11 on 3/18/18.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {


    ArrayList<String> fullnames;
    public MainAdapter(ArrayList<String> fullnames)
    {
          this.fullnames = new ArrayList<String>();
          this.fullnames=fullnames;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main_cardview, parent, false);
        return new MainAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        holder.cardviewtxt.setText(fullnames.get(position));


    }

    @Override
    public int getItemCount() {
        return fullnames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView cardviewtxt;
        public ViewHolder(View itemView) {
            super(itemView);
            cardviewtxt=(TextView)itemView.findViewById(R.id.txtcardview);
        }
    }
}
