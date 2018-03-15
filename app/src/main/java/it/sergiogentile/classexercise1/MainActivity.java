package it.sergiogentile.classexercise1;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnInc, btnDec;
    TextView tvCount;
    Integer counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        btnInc = (Button)findViewById(R.id.butUp);
        btnDec = (Button)findViewById(R.id.butDown);
        tvCount = (TextView)findViewById(R.id.tvCount);

        counter = 0;

        btnInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("App:", "Up pressed");
                tvCount.setText(Integer.toString(++counter));
            }
        });

        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("App:", "Dec pressed");
                tvCount.setText(Integer.toString(--counter));
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter", counter);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("counter");
        tvCount.setText(Integer.toString(counter));
    }
}
