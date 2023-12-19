package com.example.robot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int i = 700; // изначальное кол-во денег
        int m = 0; // переменная для подсчета месяцев
        while (i <= 35_000){ //цикл по прибавлению монет и месяцев
            i += 1700; // прибавление суммы каждый цикл
            i = i *1+(9/1200); // умножение на % годовых
            m += 1; //прибавление 1 месяца каждый цикл
        }
        TextView resultTextView = findViewById(R.id.resultTextView); // связывание вьюшки

        resultTextView.setText("Месяцев необходимо: "+m); // вывод результата
    }
}