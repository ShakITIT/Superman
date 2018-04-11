package com.example.android.superman;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
/**
 * This is a Quiz app that tests your knowledge of Superman.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Up, Up and Away!",Toast.LENGTH_SHORT).show();
    }
    public void checkAnswers(View view){
        int count = 0; // count of correct answers
        // correct answers
        RadioButton q1correct = (RadioButton)findViewById(R.id.yes_radio_button);
        boolean q1 = q1correct.isChecked();
        if (q1){
            count += 1;
        }
        RadioButton q2correct = (RadioButton)findViewById(R.id.yes2_radio_button);
        boolean q2 = q2correct.isChecked();
        if (q2){
            count += 1;
        }
        RadioButton q3correct = (RadioButton)findViewById(R.id.yes3_radio_button);
        boolean q3 = q3correct.isChecked();
        if (q3){
            count += 1;
        }
        CheckBox q4correct = (CheckBox) findViewById(R.id.checkbox_Jerry);
        CheckBox q4correct_2 = (CheckBox) findViewById(R.id.checkbox_Joe);
        boolean q4_2 =  q4correct_2.isChecked();
        boolean q4 = q4correct.isChecked();
        if(q4 && q4_2) {
            count += 1;

        }

        // TextView finalMessage = (TextView) findViewById(R.id.);
        // finalMessage.setText(getString(R.string.correctMessage, Integer.toString(count)));

        Toast.makeText(getApplicationContext(),"Your Score is:" +count, Toast.LENGTH_SHORT).show();
    }
}


