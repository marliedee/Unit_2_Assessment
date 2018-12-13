package org.pursuit.unit_02_assessment;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    static String getEditText;
    static TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getEditText = getIntent().getStringExtra(MainActivity.KEY);

        tv2 = findViewById(R.id.second_textView);
        tv2.setText(MainActivity.VALUE);

    }
}
