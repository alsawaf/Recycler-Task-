package com.example.android.recyclertask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AddClick (View view){

        TextView MovieName = (TextView)findViewById(R.id.MovieNameEditText);
        TextView MovieRate = (TextView)findViewById(R.id.MovieRateEditText);
        TextView MovieDesc = (TextView)findViewById(R.id.MovieDescEditText);

        Movie NewMovie = new Movie(MovieName.getText().toString(),MovieRate.getText().toString(),MovieDesc.getText().toString());

    }
}
