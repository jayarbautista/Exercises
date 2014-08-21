package com.android.exercises.invokedactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityFragment extends Fragment {
	EditText mName;
	Button mSubmit;
	private CharSequence mCb;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.activity_main, container, false);

		mName = (EditText)v.findViewById(R.id.text_name);
		mName.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				//places s on mCb
				mCb = s;
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
			}
		});

		mSubmit = (Button)v.findViewById(R.id.submit_button);
		mSubmit.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(getActivity(),ResultActivity.class);
				intent.putExtra(ResultActivityFragment.NAME_EXTRA, mCb.toString());	
				mName.setText("");
				startActivity(intent);
			}
		});
		
		return v;
	}

}
