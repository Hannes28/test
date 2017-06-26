package com.example.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SpielMenu extends Activity implements OnClickListener{
	Button start;
	Button invite;
	TextView anzeige;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spiel_menu);
		start = (Button) findViewById(R.id.bPlay);
		invite = (Button) findViewById(R.id.bInvite);
		anzeige = (TextView) findViewById(R.id.textView1);
		start.setOnClickListener(this);
			
	}

	@Override
	public void onClick(View e) {
		// TODO Auto-generated method stub
		if (e == start){
			startActivity(new Intent(this,Spiel.class));
		}
		
		if (e == invite){
			startActivity(new Intent(this,InviteFriend.class));
		}
	} 
}
