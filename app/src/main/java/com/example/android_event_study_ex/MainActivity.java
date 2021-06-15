package com.example.android_event_study_ex;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.edittextView);
        View view = findViewById(R.id.View);
        View view2 = findViewById(R.id.View2);

        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int a = event.getAction();

                float x = event.getX();
                float y = event.getY();

                if(a == MotionEvent.ACTION_DOWN){
                    editText.append(x + "," + y);
                    Toast.makeText(getBaseContext(),editText.getText().toString(), Toast.LENGTH_LONG).show();
                }
                else if(a == MotionEvent.ACTION_MOVE){
                    editText.append(x + "," + y);
                }
                return false;
            }
        });
    }

    @Override
    protected void onSaveInstanceState( Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putAll(outState);
    }

}