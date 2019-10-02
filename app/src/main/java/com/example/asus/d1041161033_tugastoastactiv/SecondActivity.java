package com.example.asus.d1041161033_tugastoastactiv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity  extends AppCompatActivity {

    private int mCount = 33;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mShowCount = findViewById(R.id.show_count);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_nama);
        textView.setText("Hallo " + message);
    }

    public void countUp(View view) {
        mCount++ ;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void countDown(View view) {
        mCount-- ;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

}
