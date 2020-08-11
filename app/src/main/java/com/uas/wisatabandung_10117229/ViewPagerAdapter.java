package com.uas.wisatabandung_10117229;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;
/*
 * Nama : Mufti Alfarisy
 * Kelas : IF 7
 * NIM : 10117229
 * tgl pengerjaan : 7 agustus - 12 agustus 2020
 * */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList<>();

    ViewPagerAdapter(FragmentManager manager) {
        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    void addFragment(Fragment fragment) {
        mFragmentList.add(fragment);
    }

}