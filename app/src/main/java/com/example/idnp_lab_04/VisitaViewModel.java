package com.example.idnp_lab_04;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VisitaViewModel extends ViewModel {
    private MutableLiveData<String> respuesta;

    public VisitaViewModel(){
        respuesta = new MutableLiveData<>();
    }
    public LiveData<String> getRespuesta(){
        return respuesta;
    }
    public void registro(){
        respuesta.setValue(VisitaUseCase.registro());
    }
}
