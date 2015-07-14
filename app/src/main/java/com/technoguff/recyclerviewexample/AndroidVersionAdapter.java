package com.technoguff.recyclerviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by darshanz on 7/14/15.
 */
public class AndroidVersionAdapter extends RecyclerView.Adapter<AndroidVersionAdapter.MyViewHolder>{

    ArrayList<AndroidVersion> mVersionList;

    public AndroidVersionAdapter(ArrayList<AndroidVersion> versionList) {
        mVersionList = versionList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.layout_item, viewGroup, false);

        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {

        AndroidVersion version = mVersionList.get(i);
        myViewHolder.codeName.setText(version.getCodeName());
        myViewHolder.version.setText(version.getVersion());
        myViewHolder.iconImage.setImageResource(version.getIcon());

    }

    @Override
    public int getItemCount() {
        return mVersionList.size();
    }

    //ViewHolder
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView codeName;
        TextView version;
        ImageView iconImage;

        public MyViewHolder(View itemView) {
            super(itemView);

            codeName = (TextView)itemView.findViewById(R.id.codeName);
            version = (TextView)itemView.findViewById(R.id.version);
            iconImage = (ImageView) itemView.findViewById(R.id.ivIcon);
        }
    }
}
