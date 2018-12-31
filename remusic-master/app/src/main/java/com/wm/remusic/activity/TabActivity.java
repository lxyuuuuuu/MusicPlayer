package com.wm.remusic.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.wm.remusic.R;
import com.wm.remusic.fragment.TabPagerFragment;

/**
 * Created by wm on 2016/4/11.
 */
public class TabActivity extends BaseActivity {

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        String[] title = {"单曲"};
        TabPagerFragment fragment = TabPagerFragment.newInstance(0, title);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.tab_container, fragment);
        transaction.commitAllowingStateLoss();
    }
}
