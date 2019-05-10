package com.ambi.multiplevlc;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;

public class VideoActivity extends Activity {
    public final static String TAG = "VideoActivity";

    public final static String LOCATION = "com.compdigitec.libvlcandroidsample.VideoActivity.location";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");

        setContentView(R.layout.layout);

        String video = "rtsp://admin:Hf123456@120.209.197.71/Streaming/Channels/102";


        // add feed fragment to view
        this.showFragment(
                VideoFragment.newInstance(video),
                R.id.video_container);


        // add feed fragment to view
        this.showFragment(
                VideoFragment.newInstance(video),
                R.id.video_container1);
        // add feed fragment to view
        this.showFragment(
                VideoFragment.newInstance(video),
                R.id.video_container2);
    }


    protected void showFragment(Fragment newFragment, int container) {
        FragmentTransaction transaction = this.getFragmentManager()
                .beginTransaction();
        transaction.add(container, newFragment);
        transaction.commit();
    }


    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }


    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }


}
