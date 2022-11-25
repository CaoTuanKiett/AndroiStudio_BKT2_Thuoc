package com.example.androistudio_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends AppCompatActivity {
    TextView userName , email ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        userName = findViewById(R.id.textView8);
        email = findViewById(R.id.textView9);
        UserModel user = (UserModel) getIntent().getSerializableExtra("userData");
        userName.setText(user.getName());
        email.setText(user.getEmail());
    }

    public void handleLogout (View view){
        finish();
    }

    public void navigateListView(View view){
        Toast.makeText(this, "Runn", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent();
        intent.setClass(Profile.this , List.class);
        startActivity(intent);
    }
}