package com.nikhil.alertlogin;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button btndialog;
     Button l;
     EditText email;
     EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btndialog=findViewById(R.id.button2);

        btndialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder a1 = new AlertDialog.Builder(MainActivity.this);

                View v1 = getLayoutInflater().inflate(R.layout.activity_login, null);

                l = findViewById(R.id.loginbtn);
                email = findViewById(R.id.etEmail);
                pass = findViewById(R.id.etPassword);

                a1.setView(v1);
                final AlertDialog dialog = a1.create();
                dialog.show();

                l.setOnClickListener(new View.OnClickListener() {

                  @Override
                    public void onClick(View v) {

                        if(email.getText().toString().isEmpty() && pass.getText().toString().isEmpty()){
                            Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(MainActivity.this , Main2Activity.class );
                            startActivity(i);
                        }else{
                            Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                        }

                    }

                });
            }
        });
    }


    }


