package com.android.exercises.contextmenusample;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ContextMenuActivity extends Activity {
	TextView mColor;
	TextView mSize;
	
	final int MENU_COLOR_RED = 1;
	final int MENU_COLOR_GREEN = 2;
	final int MENU_COLOR_YELLOW = 3;

	final int MENU_SIZE_24 = 4;
	final int MENU_SIZE_27 = 5;
	final int MENU_SIZE_30 = 6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_context_menu);

		mColor = (TextView)findViewById(R.id.textViewColor);
		mSize = (TextView)findViewById(R.id.textViewSize);
		
		//mColor.setOnCreateContextMenuListener(this); equivalent to the next line
		registerForContextMenu(mColor); 
		registerForContextMenu(mSize);
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		
		switch(v.getId()){
		case R.id.textViewColor:
			menu.add(0, MENU_COLOR_RED, 0, "Red");
			menu.add(0, MENU_COLOR_GREEN, 0, "Green");
			menu.add(0, MENU_COLOR_YELLOW, 0, "Yellow");
			break;
		case R.id.textViewSize:
			menu.add(0, MENU_SIZE_24, 0, "24");
			menu.add(0, MENU_SIZE_27, 0, "27");
			menu.add(0, MENU_SIZE_30, 0, "30");
			break;
		}
		super.onCreateContextMenu(menu, v, menuInfo);
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		// menu items for mColor
		case MENU_COLOR_RED:
			mColor.setTextColor(Color.RED);
			mColor.setText("Text color = red");
			break;
		case MENU_COLOR_GREEN:
			mColor.setTextColor(Color.GREEN);
			mColor.setText("Text color = green");
			break;
		case MENU_COLOR_YELLOW:
			mColor.setTextColor(Color.YELLOW);
			mColor.setText("Text color = yellow");
			break;
			
		// menu items for mSize
		case MENU_SIZE_24:
			mSize.setTextSize(24);
			mSize.setText("Text size = 24");
			break;
		case MENU_SIZE_27:
			mSize.setTextSize(27);
			mSize.setText("Text size = 27");
			break;
		case MENU_SIZE_30:
			mSize.setTextSize(30);
			mSize.setText("Text size = 30");
			break;
		}
		return super.onContextItemSelected(item);
	}
}
