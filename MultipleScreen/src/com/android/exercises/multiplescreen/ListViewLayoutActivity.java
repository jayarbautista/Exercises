package com.android.exercises.multiplescreen;

import android.support.v4.app.Fragment;

public class ListViewLayoutActivity extends SingleFragmentActivity {

	@Override
	public Fragment createFragment() {
		return new ListViewLayoutFragment();
	}

}
