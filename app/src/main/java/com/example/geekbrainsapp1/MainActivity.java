package com.example.geekbrainsapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputFirstNum = findViewById(R.id.inputFirstNum);
        EditText inputSecondNum = findViewById(R.id.inputSecondNum);
        Button btnCompare = findViewById(R.id.btnCompare);
        TextView result = findViewById(R.id.result);

        btnCompare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Integer FirstNum = Integer.valueOf(inputFirstNum.getText().toString());
                    Integer SecondNum = Integer.valueOf(inputSecondNum.getText().toString());

                    if (FirstNum.equals(SecondNum)) {
                        result.setText("Числа равны");
                    } else {
                        result.setText("Числа не равны");
                    }
                } catch (NumberFormatException e) {
                    result.setText("Введите число!");
                }
            }
        });


    }
}