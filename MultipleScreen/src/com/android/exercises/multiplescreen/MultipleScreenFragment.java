package com.android.exercises.multiplescreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MultipleScreenFragment extends Fragment{
	public static int HOLD_LAYOUT = 0;
	
	Button mShowWidgetButton;
	Button mLinearButton;
	Button mRelativeButton;
	Button mListViewButton;
	Button mGridViewButton;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.activity_multiple_screen,container, false);

		mShowWidgetButton = (Button)v.findViewById(R.id.showWidget_button);
		mShowWidgetButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				HOLD_LAYOUT = R.layout.screen_layout;
				Intent i = new Intent(getActivity(),LayoutChanger.class);
				startActivity(i);
			}
		});
		
		mLinearButton = (Button)v.findViewById(R.id.linear_button);
		mLinearButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				HOLD_LAYOUT = R.layout.linear_layout_view;
				Intent i = new Intent(getActivity(),LayoutChanger.class);
				startActivity(i);
			}
		});
		
		mRelativeButton = (Button)v.findViewById(R.id.relative_button);
		mRelativeButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				HOLD_LAYOUT = R.layout.relative_layout_view;
				Intent i = new Intent(getActivity(),LayoutChanger.class);
				startActivity(i);
			}
		});
		
		mListViewButton = (Button)v.findViewById(R.id.listView_button);
		mListViewButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(getActivity(),ListViewLayoutActivity.class);
				startActivity(i);
			}
		});
		
		mGridViewButton = (Button)v.findViewById(R.id.gridView_button);
		mGridViewButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				HOLD_LAYOUT = R.layout.gridview_layout;
				Intent i = new Intent(getActivity(),GridViewLayout.class);
				startActivity(i);
			}
		});
		
		return v;
	}
	
	
}
