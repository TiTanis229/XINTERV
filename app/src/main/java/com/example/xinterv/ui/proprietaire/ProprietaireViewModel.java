package com.example.xinterv.ui.proprietaire;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProprietaireViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ProprietaireViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}