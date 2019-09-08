package com.example.midtermm07600671;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.midtermm07600671.Model.Auth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String song = intent.getStringExtra("aaa");
        Toast toast = Toast.makeText(MainActivity.this,"Welcome Promlert Lovichit",Toast.LENGTH_LONG);
        toast.show();
        Button login = findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editMail = findViewById(R.id.editText); // email
                EditText editPass = findViewById(R.id.editText2); // pass
                String inputEmail = editMail.getText().toString();
                String inputPass = editPass.getText().toString();
                Auth auth = new Auth(inputEmail,inputPass);



                boolean result = auth.check();
                if(result){
                    Toast.makeText(MainActivity.this,"Login Succes",Toast.LENGTH_SHORT).show();


                }
            }
        });
    }
}
