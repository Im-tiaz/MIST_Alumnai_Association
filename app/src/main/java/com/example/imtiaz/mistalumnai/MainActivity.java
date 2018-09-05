package com.example.imtiaz.mistalumnai;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    //private FirebaseAuth mAuth;
    //private ProgressDialog progressDialog;
    //private String email, password;
    //EditText etname, etpass;
    Button logButton,bCreate;

    /*public MainActivity(FirebaseAuth mAuth, ProgressDialog progressDialog) {
        this.mAuth = mAuth;
        this.progressDialog = progressDialog;
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bCreate=findViewById(R.id.createbtn);
        /*logButton = findViewById(R.id.loginbtn);
        etname = findViewById(R.id.username);
        etpass = findViewById(R.id.password);*/

        bCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(i);
            }
        });

        /*logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });*/


    }

    /*void signIn() {

        email = etname.getText().toString().trim();
        password = etpass.getText().toString().trim();
        progressDialog.setMessage("Please wait! ! !");
        progressDialog.show();
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    FirebaseUser user = mAuth.getCurrentUser();
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Authontication Failed", Toast.LENGTH_SHORT).show();
                }
                progressDialog.dismiss();
            }
        });


    }*/
}
