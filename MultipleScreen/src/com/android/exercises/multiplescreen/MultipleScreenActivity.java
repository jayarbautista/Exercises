package com.android.exercises.multiplescreen;

import android.support.v4.app.Fragment;

public class MultipleScreenActivity extends SingleFragmentActivity {

	@Override
	public Fragment createFragment() {
		return new MultipleScreenFragment();
	}
}
