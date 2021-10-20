package com.example.idnp_lab_04;

import static com.example.idnp_lab_04.PrincipalActivity.MESSAGE_DNI;
import static com.example.idnp_lab_04.PrincipalActivity.MESSAGE_NOMBRE;
import static com.example.idnp_lab_04.PrincipalActivity.MESSAGE_APELLIDO;
import static com.example.idnp_lab_04.PrincipalActivity.MESSAGE_DIRECCION;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class PacienteActivity extends AppCompatActivity {

    EditText editTextDNI;
    EditText editTextNombre;
    EditText editTextApellido;
    EditText editTextDireccion;
    Button btnRegistrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paciente);

        editTextDNI = findViewById(R.id.editTextDNI);
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);
        editTextDireccion = findViewById(R.id.editTextDireccion);

        btnRegistrar = findViewById(R.id.btnRegistrar);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent();
                String DNI = editTextDNI.getText().toString();
                String nombre = editTextNombre.getText().toString();
                String apellido = editTextApellido.getText().toString();
                String direccion = editTextDireccion.getText().toString();
                mainActivity.putExtra(MESSAGE_DNI, DNI);
                mainActivity.putExtra(MESSAGE_NOMBRE, nombre);
                mainActivity.putExtra(MESSAGE_APELLIDO, apellido);
                mainActivity.putExtra(MESSAGE_DIRECCION, direccion);
                setResult(RESULT_OK, mainActivity);

                finish();
            }
        });


    }
}