package com.julienne.labexercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView rawAve_Score;
    TextView finalGrade_Score;
    Button btn_Return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        rawAve_Score = (TextView) findViewById(R.id.RA_Score);
        finalGrade_Score = (TextView) findViewById(R.id.FinalGrade_Score);
        btn_Return = (Button) findViewById(R.id.btnBack);


        Double rawAve = getIntent().getDoubleExtra("rawAverage", 0);
        Double output = getIntent().getDoubleExtra("finalGrade", 0);



       rawAve_Score.setText(String.valueOf(rawAve));

        finalGrade_Score.setText(String.valueOf(output));
    }

    public void goBackToMain(View view){
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);


    }
}

