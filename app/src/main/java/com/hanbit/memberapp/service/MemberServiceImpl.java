package com.hanbit.memberapp.service;

import android.content.Context;
import android.util.Log;

import com.hanbit.memberapp.dao.MemberDAO;
import com.hanbit.memberapp.domain.MemberBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hb2000 on 2016-12-17.
 */

public class MemberServiceImpl implements  MemberService{
    MemberDAO dao;
    public MemberServiceImpl(Context applicationContext) {
        dao = new MemberDAO(applicationContext);
    }

    @Override
    public MemberBean detail(String id) {
        MemberBean member = new MemberBean();
        member = dao.detail(id);
        Log.d("서비스 detail 결과 이름:",member.getName());
        return member;
    }

    @Override
    public List<MemberBean> find(String keyword) {
        Log.d("서비스 find에 넘어온 이름:",keyword);
        List<MemberBean> list = new ArrayList<MemberBean>();
        list = dao.list();

        return list;
    }

    @Override
    public void join(MemberBean param) {
        Log.d("서비스 join에 넘어온 ID:",param.getId());
        dao.join(param);
    }

    @Override
    public List<MemberBean> list() {
        List<MemberBean> list = new ArrayList<MemberBean>();
        dao.list();
        Log.d("list 갯수:",String.valueOf(list.size()));
        return list;
    }

    @Override
    public boolean login(MemberBean param) {
        boolean flag = false;
        flag = dao.login(param);
        Log.d("로그인 결과:",String.valueOf(flag));
        return flag;
    }

    @Override
    public void update(MemberBean param) {
        Log.d("서비스로 넘어온 id:",param.getId());
        dao.update(param);

    }

    @Override
    public void delete(String id) {
        Log.d("서비스로 넘어온 id:",id);
        dao.delete(id);
    }

    @Override
    public int count() {
        int count = 0;
        count = dao.count();
        Log.d("서비스 count:",String.valueOf(count));
        return count;
    }
}
