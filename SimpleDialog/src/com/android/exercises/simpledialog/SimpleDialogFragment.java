package com.android.exercises.simpledialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class SimpleDialogFragment extends Fragment {
	Button mPress;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.activity_dialog, container, false);
		
		mPress = (Button) v.findViewById(R.id.press_button);
		mPress.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		        builder.setMessage(R.string.dialog_eat)
		               .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
		                   public void onClick(DialogInterface dialog, int id) {
		                       Toast.makeText(getActivity(), "Let's eat some vegetables.", Toast.LENGTH_SHORT).show();
		                   }
		               })
		               .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
		                   public void onClick(DialogInterface dialog, int id) {
		                	   Toast.makeText(getActivity(), "I'm not hungry.", Toast.LENGTH_SHORT).show();
		                   }
		               })
		               .setCancelable(false)
		               .show();
			}
		});
		
		return v;
	}
}
