package com.example.victor.eventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button victorsButton = (Button)findViewById(R.id.victorsButton);

        victorsButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView victorsText = (TextView)findViewById(R.id.victorsText);
                        victorsText.setText("Good job Hoss!");
                    }
                }
        );

        victorsButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView victorsText = (TextView)findViewById(R.id.victorsText);
                        victorsText.setText("Holy carp, that was a long one!");
                        return false;
                    }
                }
        );
    }
}
