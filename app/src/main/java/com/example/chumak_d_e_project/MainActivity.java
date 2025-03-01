package com.example.chumak_d_e_project;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Программный способ
        Button programmaticButton = findViewById(R.id.button_programmatic);
        programmaticButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        // Кнопка для передачи данных
        Button sendDataButton = findViewById(R.id.buttonSendData);
        sendDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Получаем данные из полей ввода
                EditText nameText = findViewById(R.id.editTextName);
                EditText groupText = findViewById(R.id.editTextGroup);
                EditText ageText = findViewById(R.id.editTextAge);
                EditText gradeText = findViewById(R.id.editTextGrade);

                // Преобразуем данные в нужный формат
                String name = nameText.getText().toString();
                String group = groupText.getText().toString();
                int age = Integer.parseInt(ageText.getText().toString());
                int grade = Integer.parseInt(gradeText.getText().toString());

                // Создаем Intent для перехода на SecondActivity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                // Передаем данные через Intent
                intent.putExtra("name", name);
                intent.putExtra("group", group);
                intent.putExtra("age", age);
                intent.putExtra("grade", grade);

                // Запускаем SecondActivity
                startActivity(intent);
            }
        });
        Log.d(TAG, "onCreate called");
    }

    // Декларатнивный способ
    public void onDeclarativeButtonClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy called");
    }
}