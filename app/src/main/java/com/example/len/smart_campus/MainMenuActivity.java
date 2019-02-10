package com.example.len.smart_campus;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

public class MainMenuActivity extends FragmentActivity
        implements HomeFragment.OnFragmentInteractionListener ,
        ExploreFragment.OnFragmentInteractionListener ,
        NotificationsFragment.OnFragmentInteractionListener ,
        MineFragment.OnFragmentInteractionListener{
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    showHomeFragment();
                    return true;
                case R.id.navigation_explore:
                    mTextMessage.setText(R.string.title_explore);
                    showExploreFragment();
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    showNotificationsFragment();
                    return true;
                case R.id.navigation_mine:
                    mTextMessage.setText(R.string.title_mine);
                    showMineFragment();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        showHomeFragment();
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    //fragment之间的切换
    private HomeFragment mHomeFragment;
    private ExploreFragment mExploreFragment;
    private NotificationsFragment mNotificationsFragment;
    private MineFragment mMineFragment;

    private void showHomeFragment(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        if(mHomeFragment == null){
            mHomeFragment = new HomeFragment();
            transaction.add(R.id.fragment_container,mHomeFragment);
        }
        hideFragment(transaction);
        transaction.show(mHomeFragment);
        transaction.commit();
    }
    private void showExploreFragment(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        if(mExploreFragment == null){
            mExploreFragment = new ExploreFragment();
            transaction.add(R.id.fragment_container,mExploreFragment);
        }
        hideFragment(transaction);
        transaction.show(mExploreFragment);
        transaction.commit();
    }
    private void showNotificationsFragment(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        if(mNotificationsFragment == null){
            mNotificationsFragment = new NotificationsFragment();
            transaction.add(R.id.fragment_container,mNotificationsFragment);
        }
        hideFragment(transaction);
        transaction.show(mNotificationsFragment);
        transaction.commit();
    }
    private void showMineFragment(){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        if(mMineFragment == null){
            mMineFragment = new MineFragment();
            transaction.add(R.id.fragment_container,mMineFragment);
        }
        hideFragment(transaction);
        transaction.show(mMineFragment);
        transaction.commit();
    }
    private void hideFragment(FragmentTransaction transaction){
        if(mHomeFragment != null){
            transaction.hide(mHomeFragment);
        }
        if(mExploreFragment != null){
            transaction.hide(mExploreFragment);
        }
        if(mNotificationsFragment != null){
            transaction.hide(mNotificationsFragment);
        }
        if(mMineFragment != null){
            transaction.hide(mMineFragment);
        }
    }

}
