package com.example.piepser;


import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainPageIntent extends Activity implements OnClickListener{

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_page);
		
		Button btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if(v.getId() == R.id.button1){
			Intent i = new Intent(this, GroupViewIntent.class);
			startActivity(i);
		}
		
	}
	
}
