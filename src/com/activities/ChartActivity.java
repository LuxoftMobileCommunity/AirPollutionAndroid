package com.activities;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.projekt_android.R;
import com.objects.Station;

public class ChartActivity extends Activity{

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}
	@Override
	public void onResume(){
		super.onResume();
		setContentView(R.layout.chart_activity);		
/*na kazdy view:   setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			//widok 4
		}
	});
*/	
		
	}	

}

