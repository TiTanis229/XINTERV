package com.example.xinterv.ui.proprietaire;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.xinterv.R;
import com.example.xinterv.databinding.FragmentProprietaireBinding;

public class ProprietaireFragment extends Fragment {

    private FragmentProprietaireBinding binding;

    /*public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ProprietaireViewModel proprietaireViewModel =
                new ViewModelProvider(this).get(ProprietaireViewModel.class);

        binding = FragmentProprietaireBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNotifications;
        proprietaireViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }*/

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ConstraintLayout monLayout = (ConstraintLayout) inflater.inflate(R.layout.fragment_proprietaire,container,false);
        TextView monTextView = (TextView) monLayout.findViewById(R.id.text_dashboard);
        return monLayout;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}