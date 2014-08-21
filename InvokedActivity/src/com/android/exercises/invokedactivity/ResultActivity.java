package com.android.exercises.invokedactivity;

import android.support.v4.app.Fragment;

public class ResultActivity extends SingleFragmentActivity {

	@Override
    public Fragment createFragment() {
        return new ResultActivityFragment();
    }

}
