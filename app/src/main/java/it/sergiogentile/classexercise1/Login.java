package it.sergiogentile.classexercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.rengwuxian.materialedittext.MaterialEditText;


public class Login extends AppCompatActivity {

    MaterialEditText edtMail, edtPassword;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtMail = (MaterialEditText)findViewById(R.id.edtMail);
        edtPassword = (MaterialEditText)findViewById(R.id.edtPass);
        btn = (Button)findViewById(R.id.btnLog);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Check with firebase
                if(edtMail.getText().toString().equals("sergio.gentile94@gmail.com") && edtPassword.getText().toString().equals("25Aprile1994")){
                    Toast.makeText(Login.this, "Login successfully", Toast.LENGTH_SHORT).show();
                    Intent signIn = new Intent(Login.this, MainActivity.class);
                    startActivity(signIn);
                }
                else{
                    Toast.makeText(Login.this, "Login failed", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
