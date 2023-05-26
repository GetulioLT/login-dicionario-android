package com.example.login_dicionario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class Main extends AppCompatActivity {
    EditText main_login, main_senha;
    CheckBox main_mostrar_senha;
    TextView main_criar_conta;

    static Map<String, Integer> user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarComponentes();

    }

    private void iniciarComponentes() {
        main_login = findViewById(R.id.main_login);
        main_senha = findViewById(R.id.main_senha);
        main_mostrar_senha = findViewById(R.id.main_mostrar_senha);
        main_criar_conta = findViewById(R.id.main_criar_conta);

        main_senha.setInputType(129);

        if (user == null){
            user = new HashMap<>();
        }
    }

    public void mostrar_senha(View v){
        if (main_mostrar_senha.isChecked()){
            main_senha.setInputType(1);
        }
        else{
            main_senha.setInputType(129);
        }
    }

    public void login(View v){
        if (main_login.getText().toString().equals("") ||
                main_senha.getText().toString().equals("")){
            Toast.makeText(Main.this, "informações faltando",
                    Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(Main.this, "Login Relizado com sucesso",
                    Toast.LENGTH_SHORT).show();

            //Intent intent = new Intent(Main.this, Create.class);
            //startActivity(intent);
        }
    }

    public void create_conta(View v){
        Intent intent = new Intent(Main.this, Create.class);
        startActivity(intent);
    }
}