package com.hanbit.memberapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hanbit.memberapp.R;
import com.hanbit.memberapp.domain.MemberBean;
import com.hanbit.memberapp.service.MemberService;
import com.hanbit.memberapp.service.MemberServiceImpl;

import java.util.List;

public class ListActivity extends AppCompatActivity implements View.OnClickListener{
    Button btDetail;
    MemberService service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        btDetail = (Button) findViewById(R.id.btDetail);
        service = new MemberServiceImpl(getApplicationContext());
        List<MemberBean> list = service.list();
        btDetail.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(ListActivity.this, DetailActivity.class));
    }
}
