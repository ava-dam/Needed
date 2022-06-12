package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchTaskActivity(View view) {
        Intent intent = new Intent(this,TaskActivity.class);
        startActivity(intent);
    }

    public void launchNoteActivity(View view) {
        Intent intent = new Intent(this,NoteActivity.class);
        startActivity(intent);
    }

    public void launchCalendarActivity(View view) {
        Intent intent = new Intent(this,CalendarActivity.class);
        startActivity(intent);
    }
}