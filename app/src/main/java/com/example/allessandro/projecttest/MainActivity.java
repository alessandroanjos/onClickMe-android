package com.example.allessandro.projecttest;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends Fragment implements View.OnClickListener {

    TextView t ;

    public static final MainActivity newInstance() {
        MainActivity f = new MainActivity();
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_main, container, false);

        t = (TextView) getActivity().findViewById(R.id.click);
        t.setOnClickListener(this);

        return rootView;
    }
    public void onClick(View v) {
        //TODO: Aqui faz o inflate para voltar ao List de Algum fragment Tab

        this.getActivity().finish();
        Fragment fragmentPt = null;

        Tab1 fragPt = Tab1.newInstance();
        fragmentPt = fragPt;

        FragmentManager fragmentManagedPt = getFragmentManager();
        fragmentManagedPt.beginTransaction()
                .replace(R.id.frame_container, fragmentPt).commit();

    }
}
