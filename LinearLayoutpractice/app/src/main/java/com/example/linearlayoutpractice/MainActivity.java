package com.example.linearlayoutpractice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tview;
    Button button;
    RadioGroup radioGroup;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.rg);
        button=findViewById(R.id.b);
        tview=findViewById(R.id.tv);

        show();


    }
    public void show()
    {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int k=radioGroup.getCheckedRadioButtonId();
                rb=findViewById(k);
                tview.setText(rb.getText().toString());
                Toast.makeText(MainActivity.this,rb.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}