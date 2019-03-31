package com.example.recyclerviewlogin.View;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.recyclerviewlogin.R;

public class MainActivity extends AppCompatActivity {
    public static final String PREFS_NAME = "LoginPrefs";
    private Button btnlogin;
    private EditText tvUser, tvPass;
    String SUsername, SPass;
    Context context;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    boolean savelogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogin = findViewById(R.id.btn_masuk);
        tvUser = findViewById(R.id.user);
        tvPass = findViewById(R.id.pass);
        sharedPreferences = getSharedPreferences(PREFS_NAME, 0);
        //getSharedPreferences("LOGIN", MODE_PRIVATE);
        savelogin = sharedPreferences.getBoolean("savelogin", false);
        //if (savelogin==true){
        if (sharedPreferences.getString("logged", null).toString().equals("logged")){
            //tvUser.setText(sharedPreferences.getString("username", null));
            //tvPass.setText(sharedPreferences.getString("password", null));
            Intent a = new Intent(MainActivity.this, MenuMenu.class);
            //a.("username", SUsername);
            //a.putExtra("password", SPass);
            startActivity(a);
        }
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SUsername = tvUser.getText().toString();
                SPass = tvPass.getText().toString();
                if (SUsername.equals("admin")&& SPass.equals("123")){
                    //editor.putBoolean("savelogin", true);
                    //editor.putString("username", SUsername);
                    //editor.putString("password", SPass);
                    sharedPreferences = getSharedPreferences(PREFS_NAME, 0);
                    editor = sharedPreferences.edit();
                    editor.putString("logged", "logged");
                    editor.commit();
                    Intent a = new Intent(getApplicationContext(), MenuMenu.class);
                    //a.putExtra("username", SUsername);
                    //a.putExtra("password", SPass);
                    startActivity(a);

                }
                else {
                    Toast.makeText(getApplicationContext(), "Username atau Password salah", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
