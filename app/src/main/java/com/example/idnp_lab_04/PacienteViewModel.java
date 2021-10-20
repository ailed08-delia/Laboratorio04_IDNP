package com.example.idnp_lab_04;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PacienteViewModel extends ViewModel {
    private MutableLiveData<String> respuesta;

    public PacienteViewModel(){
        respuesta = new MutableLiveData<>();
    }
    public LiveData<String> getRespuesta(){
        return respuesta;
    }
    public void registro(){
        respuesta.setValue(PacienteUseCase.registro());
    }
}
