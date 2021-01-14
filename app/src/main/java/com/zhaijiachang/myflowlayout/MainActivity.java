package com.zhaijiachang.myflowlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> mStrings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        RecyclerView mRecyclerView = findViewById(R.id.recycler);
        FlowLayoutManager mFlowLayoutManager = new FlowLayoutManager();
        mRecyclerView.setLayoutManager(mFlowLayoutManager);

        mStrings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mStrings.add("这是第" + i + "个");
        }
        MyRecyclerAdapter mRecyclerAdapter = new MyRecyclerAdapter(mStrings);
        mRecyclerView.setAdapter(mRecyclerAdapter);
        //
        mStrings = new ArrayList<>();
        String[] sss = {"你不是", "真正的快乐", "你", "的笑", "只是你的保护色", "你决定",
                "不恨了", "也", "决定", "不爱了啦啦啦", "55555", "9999999999999999999999999", "哈哈哈哈哈哈"};
        for (int i = 0; i < sss.length; i++) {
            mStrings.add(sss[i]);
        }
        RecyclerView mRecyclerView2 = findViewById(R.id.recycler2);
        MyRecyclerAdapter mRecyclerAdapter2 = new MyRecyclerAdapter(mStrings);
        FlowLayoutManager mFlowLayoutManager2 = new FlowLayoutManager();
        mRecyclerView2.setLayoutManager(mFlowLayoutManager2);
        mRecyclerView2.setAdapter(mRecyclerAdapter2);
    }

}