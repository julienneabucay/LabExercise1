package com.julienne.labexercise1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText quizOne_Score;
    EditText quizTwo_Score;
    EditText SW_Score;
    EditText LabExer_Score;
    EditText MajorExam_Score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quizOne_Score = (EditText)findViewById(R.id.quizOneScore);
        quizTwo_Score = (EditText)findViewById(R.id.quizTwoScore);
        SW_Score = (EditText)findViewById(R.id.SeatworksScore);
        LabExer_Score = (EditText)findViewById(R.id.LabExerScore);
        MajorExam_Score = (EditText)findViewById(R.id.MajorExamScore);

    }

    public void callSecondActivity(View view){
        double quiz1, quiz2, seatWork, labExer, majorExam, rawAve, output=0;


        quiz1 = Double.parseDouble(quizOne_Score.getText().toString());
        quiz2 = Double.parseDouble(quizTwo_Score.getText().toString());
        seatWork = Double.parseDouble(SW_Score.getText().toString());
        labExer = Double.parseDouble(LabExer_Score.getText().toString());
        majorExam = Double.parseDouble(MajorExam_Score.getText().toString());

        rawAve = (0.10 * quiz1) + (0.10 * quiz2) + (0.10 * seatWork) + (0.40 * labExer) + (0.30 * majorExam);


        //failed
        if (rawAve < 60 ){
            output = 5;
        }
        //3.00
        else if (rawAve == 60 || rawAve <= 65 ){
            output = 3;
        }
        //2.75
        else if  (rawAve == 66 || rawAve <= 70){
            output = 2.75;
        }
        //2.5
        else if (rawAve == 71 || rawAve <= 75){
            output = 2.50;
        }
        //2.25
        else if (rawAve == 76 || rawAve <= 80){
            output = 2.25;
        }
        //2.0
        else if (rawAve == 81 || rawAve <= 85){
            output = 2.00;
        }
        //1.75
        else if (rawAve == 86 || rawAve <= 90){
            output = 1.75;
        }
        //1.5
        else if (rawAve == 91 || rawAve <= 92){
            output = 1.50;
        }
        //1.25
        else if (rawAve == 93 || rawAve <= 94){
            output = 1.25;
        }
        //1.0
        else if (rawAve == 95 || rawAve <= 100){
            output = 1.00;
        }




        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("rawAverage", rawAve);
        intent.putExtra("finalGrade", output);


        startActivity(intent);
    }

}
