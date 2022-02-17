package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    TextView txtLogin, txtSenha;
    EditText edtLogin, edtSenha;
    Button btnAcessar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        txtLogin = findViewById(R.id.txtLogin);
        txtSenha = findViewById(R.id.txtSenha);

        edtLogin = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);

        btnAcessar = findViewById(R.id.btnAcessar);

        btnAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String login = edtLogin.getText().toString();
                    String senha =  edtSenha.getText().toString();


                    if(login.equals("Gabriel") && senha.equals("123")){
                        alert("Login autorizado");
                    }else {
                        if (login.equals("Kauana") && senha.equals("123")) {
                            alert("Login autorizado");
                        }else {
                            if (login.equals("Jonas") && senha.equals("123")){
                                alert("Login autorizado");
                            }else {
                                alert("Login incorreto");
                            }
                        }
                    }

                }catch (Exception ex){

                }


            }
        });
    }

    private void alert(String s) {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }


}