package com.example.hi_tech1.swipe;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by HI-TECH1 on 7/23/2016.
 */
public class SoundProfiles extends android.support.v4.app.Fragment {
    EditText ed1;
    Button b1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

//
//        FloatingActionButton fab = (FloatingActionButton)getActivity().findViewById(R.id.fab);
//        fab.show();
//        fab.setMinimumWidth(4000 );
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                android.app.FragmentManager fm ;
//                android.app.FragmentTransaction ft;
//                fm = getFragmentManager();
//                ft=fm.beginTransaction();
//                ft.replace(R.id.container1,new SoundProfileSettings()).commit();
//
//
//            }
//        });

        return inflater.inflate(R.layout.activity_sound_profiles,container,false);
    }





}
