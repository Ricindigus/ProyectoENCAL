package com.example.administrador.encal.activities;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrador.encal.R;

public class LoginActivity extends AppCompatActivity {
    private TextInputEditText txtUsuario;
    private TextInputEditText txtPassword;
    private Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        btnIngresar = (Button) findViewById(R.id.login_boton_ingresar);
        txtUsuario = (TextInputEditText) findViewById(R.id.login_input_usuario);
        txtPassword = (TextInputEditText) findViewById(R.id.login_input_password);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtUsuario.getText().toString().equals("adm")&& txtPassword.getText().toString().equals("123")){
                    Intent intent = new Intent(LoginActivity.this,MarcoActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginActivity.this,"Usuario o pasword incorrectsos",Toast.LENGTH_SHORT);
                    txtUsuario.setText("");
                    txtPassword.setText("");
                }
            }
        });


    }
}
