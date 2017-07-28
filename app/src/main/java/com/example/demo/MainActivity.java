package com.example.demo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.demo.adapter.MainRecyAdapter;
import com.example.demo.utils.DataUtil;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyleView)
    RecyclerView mRecyclerView;

    private Context mContext;
    private List<String> titleList;
    private MainRecyAdapter mAdapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mContext = this;

        initView();

    }

    /**
     *
     */
    private void initView() {
        titleList = DataUtil.getMainTitle();
        mAdapter = new MainRecyAdapter(mContext , titleList);

        mRecyclerView.setLayoutManager(new GridLayoutManager(mContext , 5));
        mRecyclerView.setAdapter(mAdapter);





    }


}
