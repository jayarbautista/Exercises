package com.android.exercises.invokedactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ResultActivityFragment extends Fragment {
	public static final String NAME_EXTRA = "ResultActivityFragment";
	private String mNameString;

	TextView mResult;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mNameString = (String)getActivity().getIntent().getSerializableExtra(NAME_EXTRA);
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.activity_result, container , false);
		
		mResult = (TextView)v.findViewById(R.id.text_result);
		mResult.setText("Hello " + mNameString + ". Welcome to Android.");
		
		return v;
	}


	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
	}

}
