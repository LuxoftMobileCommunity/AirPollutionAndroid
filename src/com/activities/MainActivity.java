package com.activities;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.projekt_android.R;
import com.objects.Station;

public class MainActivity extends Activity {

	private Button buttonWarning;
	private Button buttonFac1;
	private Button buttonFac2;
	private Button buttonFac3;
	private Button buttonStation;
	private Button buttonGPS;
	
	private List<Station>stationsList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		stationsList = new ArrayList<Station>();
		
		//TODO start service
		
	}

	@Override
	public void onResume(){
		super.onResume();
		
		setContentView(R.layout.activity_main);		
		buttonWarning = (Button)findViewById(R.id.button_WARNING);
		buttonFac1 = (Button)findViewById(R.id.button_Factor1);
		buttonFac2 = (Button)findViewById(R.id.button_Factor2);
		buttonFac3 = (Button)findViewById(R.id.button_Factor3);
		buttonStation = (Button)findViewById(R.id.button_Station_name);
		buttonGPS = (Button)findViewById(R.id.button_GPS);
		
		buttonGPS.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//TODO wybor najblizszej stacji
				Toast.makeText(MainActivity.this, "nearest station selected", Toast.LENGTH_SHORT).show();
			}
		});
		buttonStation.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				showDialog(1);
			}
		});
		buttonWarning.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intentIntro = new Intent(MainActivity.this, ChartActivity.class);
				startActivityForResult(intentIntro, 0);
			}
		});
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public Dialog onCreateDialog(int dialogID) {
		if (dialogID == 1){
		    AlertDialog.Builder builder = new AlertDialog.Builder(this);
		    CharSequence[] cs = stationsList.toArray(new CharSequence[stationsList.size()]);
		    builder.setTitle(R.string.popup_name)
		           .setItems(cs, new DialogInterface.OnClickListener() {
		               public void onClick(DialogInterface dialog, int which) {
		               // The 'which' argument contains the index position
		               // of the selected item
		            	   
		           }
		    });
		    builder.setNeutralButton(R.string.nearest_station,new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface dialog,int which) {
					//TODO wybor najblizszej stacji.
					Toast.makeText(MainActivity.this, "nearest station selected", Toast.LENGTH_SHORT).show();
				}
			});
		    return builder.create();
		}
		return null;
	}

}
