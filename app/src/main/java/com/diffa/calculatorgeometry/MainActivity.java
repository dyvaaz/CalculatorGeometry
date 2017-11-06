package com.diffa.calculatorgeometry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonHasil(View view) {
        Spinner bangunDatar = (Spinner) findViewById(R.id.spinnerView);
        EditText input1 = (EditText) findViewById(R.id.input_1);
        EditText input2 = (EditText) findViewById(R.id.input_2);
        TextView Areas = (TextView) findViewById(R.id.resultArea);
        TextView Perimeters = (TextView) findViewById(R.id.resultPerimeter);


        String point1 = input1.getText().toString();
        String point2 = input2.getText().toString();
        int set1=Integer.parseInt(point1);
        int set2=Integer.parseInt(point2);

        if(bangunDatar.getSelectedItem().toString().equals("Persegi")) {
            int resultArea = set1*set2;
            String resultOne = String.valueOf(resultArea);
            Areas.setText(resultOne);

            int resultPerimeter = (set1 * 2)+(set2 * 2);
            String resultTwo = String.valueOf(resultPerimeter);
            Perimeters.setText(resultTwo);
        }

        else if (bangunDatar.getSelectedItem().toString().equals("Lingkaran")){
            double pi = 3.14;
            double resultArea = pi*(set1*set1);
            String resultOne = String.valueOf(resultArea);
            Areas.setText(resultOne);

            double resultPerimeter = pi*(set2 * 2);
            String resultTwo = String.valueOf(resultPerimeter);
            Perimeters.setText(resultTwo);
        }

        else if (bangunDatar.getSelectedItem().toString().equals("Segitiga")){
            double resultArea = (set1 * set2)/ 2;
            String resultOne = String.valueOf(resultArea);
            Areas.setText(resultOne);

            double sqrt = (float) Math.sqrt((set1 * set1)+(set2 *set2));
            double resultPerimeter= set1 + set2+ sqrt;
            String resultTwo=String.valueOf(resultPerimeter);
            Perimeters.setText(resultTwo);

        }

    }
}