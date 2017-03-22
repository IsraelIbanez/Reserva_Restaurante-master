package com.reserva;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad2 extends Activity {

	String nombre = "", fecha = "", hora = "";
	int personas = 0;
	TextView muestraDatos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.actividad2);

		muestraDatos = (TextView) findViewById(R.id.muestraDatos);

		Bundle recibe = new Bundle();
		recibe = this.getIntent().getExtras();

		nombre = recibe.getString("nombre");
		personas = recibe.getInt("personas");
		fecha = recibe.getString("fecha");
		hora = recibe.getString("hora");

		muestraDatos.setText("Reservacion a nombre de:\n" + nombre + "\n" + personas
				+ " personas\nFecha: " + fecha + "\nHora: " + hora + "\n");

	}

    public void hacerOtraReserva(View v) {
		EditText correo;
		EditText numero;
		TextView datos;
		datos = (TextView) findViewById(R.id.muestraDatos);
        Intent envia = new Intent(this, MainActivity.class);
		Bundle datosR = new Bundle ();
		correo = (EditText) findViewById(R.id.txtMail);
		numero = (EditText) findViewById(R.id.txtNumero);
		datosR.putString("correo",correo.getText().toString().trim());
		datosR.putString("numero",numero.getText().toString().trim());
		datosR.putString("nombre",nombre);
        finish();
		envia.putExtras(datosR);
        startActivity(envia);
    }

}
