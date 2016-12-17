package com.hanbit.memberapp.service;

import com.hanbit.memberapp.domain.MemberBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hb2000 on 2016-12-17.
 */

public class MemberServiceImpl implements  MemberService{
    @Override
    public MemberBean detail(String id) {
        MemberBean member = new MemberBean();

        return member;
    }

    @Override
    public List<MemberBean> find(String keyword) {
        List<MemberBean> list = new ArrayList<MemberBean>();
        return list;
    }

    @Override
    public void join(MemberBean param) {

    }

    @Override
    public List<MemberBean> list() {
        List<MemberBean> list = new ArrayList<MemberBean>();
        return list;
    }

    @Override
    public boolean login(MemberBean param) {
        boolean flag = false;
        return false;
    }

    @Override
    public void update(MemberBean param) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public int count() {
        int count = 0;
        return count;
    }
}
