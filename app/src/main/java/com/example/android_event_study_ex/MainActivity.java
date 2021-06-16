package com.example.android_event_study_ex;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toast toast;
    View layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            layout = getLayoutInflater().inflate(R.layout.toast_layout,findViewById(R.id.toast_layout));
            toast = Toast.makeText(this,"토스트가 생성 되었습니다.", Toast.LENGTH_SHORT);
            toast.setView(layout);

    }

    public void button_clicked(View view) {
        toast.show();
    }
}