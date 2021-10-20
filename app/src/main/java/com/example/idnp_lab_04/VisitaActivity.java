package com.example.idnp_lab_04;

import static com.example.idnp_lab_04.PrincipalActivity.MESSAGE_DNI;
import static com.example.idnp_lab_04.PrincipalActivity.MESSAGE_PESO;
import static com.example.idnp_lab_04.PrincipalActivity.MESSAGE_PRESION;
import static com.example.idnp_lab_04.PrincipalActivity.MESSAGE_SATURACION;
import static com.example.idnp_lab_04.PrincipalActivity.MESSAGE_TEMPERATURA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VisitaActivity extends AppCompatActivity {

    EditText editTextPeso;
    EditText editTextTemperatura;
    EditText editTextPresion;
    EditText editTextSaturacion;
    TextView textViewNombreCompleto;
    TextView textViewDocumento;
    Button btnRegistrarVisita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visita);

        editTextPeso = findViewById(R.id.editTextPeso);
        editTextTemperatura = findViewById(R.id.editTextTextTemperatura);
        editTextPresion = findViewById(R.id.editTextPresion);
        editTextSaturacion = findViewById(R.id.editTextSaturacion);
        textViewNombreCompleto = findViewById(R.id.textViewNombreCompleto);
        textViewDocumento = findViewById(R.id.textViewDocumento);
        btnRegistrarVisita = findViewById(R.id.btnRegistrarVisita);

        Bundle parametros = this.getIntent().getExtras();
        textViewNombreCompleto.setText(parametros.getString("Nombre"));
        textViewDocumento.setText(parametros.getString("DNI"));

        btnRegistrarVisita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent();
                String peso = editTextPeso.getText().toString();
                String temperatura = editTextTemperatura.getText().toString();
                String presion = editTextPresion.getText().toString();
                String saturacion = editTextSaturacion.getText().toString();
                mainActivity.putExtra(MESSAGE_DNI, textViewDocumento.getText().toString());
                mainActivity.putExtra(MESSAGE_PESO, peso);
                mainActivity.putExtra(MESSAGE_TEMPERATURA, temperatura);
                mainActivity.putExtra(MESSAGE_PRESION, presion);
                mainActivity.putExtra(MESSAGE_SATURACION, saturacion);

                setResult(RESULT_OK, mainActivity);

                finish();
            }
        });

    }
}