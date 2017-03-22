package com.reserva;


import android.annotation.TargetApi;
import android.app.Activity;

import android.content.ContentResolver;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A login screen that offers login via email/password.
 */
public class LogIn2 extends Activity {

    EditText usr;
    EditText psw;
    TextView notificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in2);
        usr = (EditText) findViewById(R.id.txtUsr);
        psw = (EditText) findViewById(R.id.txtPsw);
        notificacion = (TextView) findViewById(R.id.lblNotificacion);
    }


    public void ingresar(View v){
        if((usr.getText().toString().equals("Israel")) && (psw.getText().toString().equals("12345"))){
            Intent entrar = new Intent(this,MainActivity.class);
            finish();
            startActivity(entrar);
        }else{
            if((usr.getText().toString().equals(""))|| (psw.getText().toString().equals(""))){
                notificacion.setText("Llena los campos");
            }
            else{
                notificacion.setText("Usuario o contraseña inválidos");
            }
        }
    }
}

