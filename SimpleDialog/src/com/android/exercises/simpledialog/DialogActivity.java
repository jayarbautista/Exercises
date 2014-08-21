package com.android.exercises.simpledialog;

import android.support.v4.app.Fragment;

public class DialogActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		return new SimpleDialogFragment();
	}
}
