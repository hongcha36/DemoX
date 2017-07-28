package com.example.demo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.demo.R;

import java.util.List;

/**
 * Created by Administrator on 2017/7/28.
 */

public class MainRecyAdapter extends RecyclerView.Adapter<MainRecyAdapter.MainRecyholder> {

    private Context mContext;
    private List<String> titleList;

    public MainRecyAdapter(Context mContext, List<String> titleList) {
        this.mContext = mContext;
        this.titleList = titleList;
    }

    @Override
    public MainRecyholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_main_title , null);
        MainRecyholder holder = new MainRecyholder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(MainRecyholder holder, int position) {
        holder.contentTv.setText(titleList.get(position));
    }

    @Override
    public int getItemCount() {
        return titleList == null ? 0 : titleList.size();
    }




    class MainRecyholder extends RecyclerView.ViewHolder{
        TextView contentTv;


        public MainRecyholder(View itemView) {

            super(itemView);
            contentTv = (TextView) itemView.findViewById(R.id.tv_title);

        }


    }

}
