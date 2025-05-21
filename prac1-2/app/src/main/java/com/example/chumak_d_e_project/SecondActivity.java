package com.example.chumak_d_e_project;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Получаем данные из Intent
        Bundle arguments = getIntent().getExtras();
        if (arguments != null) {
            String name = arguments.getString("name");
            String group = arguments.getString("group");
            int age = arguments.getInt("age");
            int grade = arguments.getInt("grade");

            // Отображаем данные
            TextView textView = findViewById(R.id.textView);
            String message = "ФИО: " + name + "\nГруппа: " + group + "\nВозраст: " + age + "\nОценка: " + grade;
            textView.setText(message);
        }
    }
}