package com.example.login_dicionario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Create extends AppCompatActivity {

    EditText create_user, create_senha, create_c_senha;
    CheckBox create_mostrar_senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        iniciarComponentes();

    }

    private void iniciarComponentes() {
        create_user = findViewById(R.id.create_user);
        create_senha = findViewById(R.id.create_senha);
        create_c_senha = findViewById(R.id.create_c_senha);
        create_mostrar_senha = findViewById(R.id.create_mostrar_senha);

        create_senha.setInputType(129);
        create_c_senha.setInputType(129);
    }

    public void mostrar_senha(View v){
        if (create_mostrar_senha.isChecked()){
            create_senha.setInputType(1);
            create_c_senha.setInputType(1);
        }
        else{
            create_senha.setInputType(129);
            create_c_senha.setInputType(129);
        }
    }
}