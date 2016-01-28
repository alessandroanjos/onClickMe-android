package com.example.allessandro.projecttest;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class TelaInicialActivity extends Activity {

    Fragment fragment = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        Button btnFragment = (Button) findViewById(R.id.btn_abrir_fragment);

        btnFragment.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               AvaliationFragment1 avaliationFragment1 = AvaliationFragment1.newInstance("", "");
               fragment = avaliationFragment1;
               FragmentManager fragmentManager = getFragmentManager();
               fragmentManager.beginTransaction()
                       .replace(R.id.frame_container, fragment).commit();
           }
       });
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
