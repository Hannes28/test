package com.example.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Spiel extends Activity implements OnClickListener{

	Button b1, b2, b3, b4;
	TextView tv1, tv2;
	int punkte = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spiel);
		b1 = (Button) findViewById(R.id.bA);
		b2 = (Button) findViewById(R.id.bB);
		b3 = (Button) findViewById(R.id.bC);
		b4 = (Button) findViewById(R.id.bD);
		tv1 = (TextView) findViewById(R.id.runde); //in spiel.xml android:id="@+id/runde" für textView1 und android:text="@strings/rundenNr"
		tv2 = (TextView) findViewById(R.id.tfrage);
		
		for (int i = 1; i <= 10; i++){
			frageLaden();
			tv1.setText(" " + i + "/10");
			b1.setOnClickListener(this);
			b2.setOnClickListener(this);
			b3.setOnClickListener(this);
			b4.setOnClickListener(this);
		}	
		//
		startActivity(new Intent(this,Ende.class));
	}

	@Override
	public void onClick(View e) {
		
		if (e == b1){
			antwort();
		}
		
		if (e == b2){
			antwort();
		}
		
		if (e == b3){
			antwort();
		}
		
		if (e == b4){
			antwort();
		}
	} 
	
	private void frageLaden(){
		//Frage aus der DB laden, ergänzen!!!!!
		tv2.setText("");
	}
	
	private void antwort(){
		//Antwort vergleichen, ergänzen!!!!
		if (true){
			punkte += 1;
		} 
	}
}
