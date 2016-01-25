package com.example.allessandro.projecttest;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;


public class Tab1 extends ListFragment {

	private long idSubtypeInformation;
	private TextView tvInformationName, tvInformationNameHead;

	private int languagePreferences;


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	public static final Tab1 newInstance() {
		Tab1 f = new Tab1();

		return f;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

		//daot = new DaoTouristinformation(this.getActivity());
		
		View rootView = inflater.inflate(R.layout.tab1_view, container, false);
		
		//((ActivityTabs) getActivity()).getActionBar().setTitle("FindNatal");

		
		tvInformationName = (TextView) rootView.findViewById(R.id.tvInformationName);
		tvInformationNameHead = (TextView) rootView.findViewById(R.id.InformationName);

		if(languagePreferences == 1) {
			tvInformationName.setText("Escolha o seu destino:");
			tvInformationNameHead.setText("CONHEÇA NATAL");
		}else{
			tvInformationName.setText("Choice your destiny:");
			tvInformationNameHead.setText("VISIT NATAL");
		}

		list();
		return rootView;
		
	}
	
	private void list() {

		if(languagePreferences == 1){
			idSubtypeInformation =  Long.parseLong("5659313586569216");
		}else{
			idSubtypeInformation =  Long.parseLong("6521255003947008");
		}

	}
	
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
	}

}