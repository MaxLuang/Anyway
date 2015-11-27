package com.test.max.anyway;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;

public class MainActivity extends ActionBarActivity {
    private MapView mMapView;
    private AMap mAMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       mMapView = (MapView) findViewById(R.id.map);
        mMapView.onCreate(savedInstanceState);
        init();


    }

    private void init() {
        if(mAMap==null){

            mAMap=mMapView.getMap();
        }

    }

    @Override
    protected void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mMapView.onSaveInstanceState(outState);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMapView.onDestroy();
    }
}

