package com.example.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class InviteFriend extends Activity implements OnClickListener{

	Button button;
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.invite_friend);
		button = (Button) findViewById(R.id.bInvite2);
		button.setOnClickListener(this);
		
	}
	
	@Override
	public void onClick(View e) {
		//Mit freund verbinden, ergänzen!!!!!!
		
		//
		startActivity(new Intent(this, Spiel.class));
	}

}
