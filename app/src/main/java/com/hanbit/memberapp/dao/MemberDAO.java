package com.hanbit.memberapp.dao;

import android.content.Context;
import android.util.Log;

import com.hanbit.memberapp.domain.MemberBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hb2000 on 2016-12-17.
 */

public class MemberDAO {
    public MemberDAO(Context applicationContext) {

    }

    public MemberBean detail(String id){
        MemberBean member = new MemberBean();
        return member;
    }
    public List<MemberBean> find(String keyword){
        List<MemberBean> list = new ArrayList<MemberBean>();
        return list;
    }
    public void join(MemberBean param){}
    public List<MemberBean> list(){
        List<MemberBean> list = new ArrayList<MemberBean>();
        return list;
    }
    public boolean login(MemberBean param){
        Log.d("DAO에 넘어온 ID:",param.getId());
        boolean flag = true;
        Log.d("로그인 결과:",String.valueOf(flag));
        return flag;
    }
    public void update(MemberBean param){}
    public void delete(String id){}
    public int count(){
        int count = 0;
        return count;
    }
}
