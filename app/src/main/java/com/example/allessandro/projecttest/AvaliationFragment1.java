package com.example.allessandro.projecttest;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

public class AvaliationFragment1 extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  WebView webView = (WebView) findViewById(R.id.webView1);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.test_edit_text, container, false);

        return rootView;
    }

    public static AvaliationFragment1 newInstance(String param1, String param2) {
        AvaliationFragment1 fragment = new AvaliationFragment1();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    public void avancarFragment(View v) {


        Fragment fragmentPt = null;

        AvaliationFragment2 avaliationFragment2 = AvaliationFragment2.newInstance("","");
        fragmentPt = avaliationFragment2;

        FragmentManager fragmentManagedPt = getFragmentManager();
        fragmentManagedPt.beginTransaction()
                .replace(R.id.frame_container, fragmentPt).commit();

    }
}
