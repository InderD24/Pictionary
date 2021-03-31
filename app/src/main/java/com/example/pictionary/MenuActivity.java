package com.example.pictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void friendsMenu_FriendsMenu(View view) {
        Intent intent = new Intent(this, DrawingBoard.class);
        startActivity(intent);
        finish();

    }

    public void aboutUs_AboutUs(View view) {
        Intent intent = new Intent(this, DrawingBoard.class);
        startActivity(intent);
        finish();
    }
}