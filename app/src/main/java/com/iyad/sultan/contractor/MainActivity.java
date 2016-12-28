package com.iyad.sultan.contractor;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.iyad.sultan.contractor.View.AddWorkerActivity;
import com.iyad.sultan.contractor.View.FnContracts;
import com.iyad.sultan.contractor.View.FnContractsExpireDate;
import com.iyad.sultan.contractor.View.FnWorker;
import com.iyad.sultan.contractor.View.FnWorkerExpireDate;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    private int tabIcons[] = {R.drawable.ic_people, R.drawable.ic_contracts, R.drawable.ic_event_people, R.drawable.ic_event_contrac};
    @BindView(R.id.tabs)
    TabLayout tabLayout;
    @BindView(R.id.viewpager)
    ViewPager viewPager;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//ViewPager settings and toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setViewPager();
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();


    }

    private void setViewPager() {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new FnWorker());
        viewPagerAdapter.addFragments(new FnContracts());
        viewPagerAdapter.addFragments(new FnWorkerExpireDate());
        viewPagerAdapter.addFragments(new FnContractsExpireDate());
        viewPager.setAdapter(viewPagerAdapter);

    }

    private void setupTabIcons() {
        TextView tabWorker = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabWorker.setText(R.string.workers);
        tabWorker.setCompoundDrawablesWithIntrinsicBounds(0, tabIcons[0], 0, 0);
        tabLayout.getTabAt(0).setCustomView(tabWorker);

        TextView tabContracts = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabContracts.setText(R.string.contracts);
        tabContracts.setCompoundDrawablesWithIntrinsicBounds(0,tabIcons[1], 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabContracts);


        TextView tabWorkerExpireDate = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabWorkerExpireDate.setText(R.string.workerExpireDate);
        tabWorkerExpireDate.setCompoundDrawablesWithIntrinsicBounds(0, tabIcons[2], 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabWorkerExpireDate);

        TextView tabContractsrExpireDate = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabContractsrExpireDate.setText(R.string.ContractsExpireDate);
        tabContractsrExpireDate.setCompoundDrawablesWithIntrinsicBounds(0, tabIcons[3], 0, 0);
        tabLayout.getTabAt(3).setCustomView(tabContractsrExpireDate);
    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> FnList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return FnList.get(position);
        }

        @Override
        public int getCount() {
            return FnList.size();
        }


        void addFragments(Fragment fn) {
            FnList.add(fn);

        }
    }

    //Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.bottom_navigation_main,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        startActivity(new Intent(MainActivity.this, AddWorkerActivity.class));
        return true;
    }
}
