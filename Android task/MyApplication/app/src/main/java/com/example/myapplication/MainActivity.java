package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button add,sub,mul,div;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        tv=findViewById(R.id.tv);
        add.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       int f,s,a;
                                       f=Integer.parseInt(et1.getText().toString());
                                       s=Integer.parseInt(et2.getText().toString());
                                       a=f+s;
                                       tv.setText("Result="+a);
                                   }
                               });

                sub.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {
                                               int f,s,a;
                                               f=Integer.parseInt(et1.getText().toString());
                                               s=Integer.parseInt(et2.getText().toString());
                                               a=f-s;
                                               tv.setText("Result="+a);
                                           }
                                       });

                        mul.setOnClickListener(new View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View view) {
                                                       int f,s,a;
                                                       f=Integer.parseInt(et1.getText().toString());
                                                       s=Integer.parseInt(et2.getText().toString());
                                                       a=f*s;
                                                       tv.setText("Result="+a);
                                                   }
                                               });

                                div.setOnClickListener(new View.OnClickListener() {
                                                           @Override
                                                           public void onClick(View view) {
                                                               int f,s,a;
                                                               f=Integer.parseInt(et1.getText().toString());
                                                               s=Integer.parseInt(et2.getText().toString());
                                                               a=f/s;
                                                               tv.setText("Result="+a);
                                                           }
                                                       });

                ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                    return insets;
                });
    }
}