package com.example.xinterv.ui.vehicule;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.xinterv.R;
import com.example.xinterv.databinding.FragmentVehiculeBinding;
import com.example.xinterv.vehicule.AdapterVehicule;
import com.example.xinterv.vehicule.Vehicule;

import java.util.ArrayList;
import java.util.Date;


public class VehiculeFragment extends Fragment {

    private FragmentVehiculeBinding binding;
    private ListView lViewVehicule;
    private AdapterVehicule adapterVehicule;
    private ArrayList<Vehicule> colVehicule;


    /*public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        VehiculeViewModel vehiculeViewModel =
                new ViewModelProvider(this).get(VehiculeViewModel.class);

        binding = FragmentVehiculeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        vehiculeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }*/

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View myLayout = (View) inflater.inflate(R.layout.fragment_vehicule,container,false);

        colVehicule = new ArrayList<>();

        MiseAJourList();
        adapterVehicule = new AdapterVehicule(colVehicule,getContext());

        lViewVehicule = (ListView) myLayout.findViewById(R.id.listViewVehicule);
        lViewVehicule.setAdapter(adapterVehicule);

        return myLayout;
    }

    private void MiseAJourList() {
        colVehicule.add(new Vehicule("xx-000-xx","peugeot","208", Color.valueOf(Color.blue(22)),200,"citadine","manuelle", new Date(2020)));
        colVehicule.add(new Vehicule("bb-111-bb","citroen","208", Color.valueOf(Color.blue(22)),200,"citadine","manuelle", new Date(2020)));
        colVehicule.add(new Vehicule("cc-222-cc","volkswagen","208", Color.valueOf(Color.blue(22)),200,"citadine","manuelle", new Date(2020)));
        colVehicule.add(new Vehicule("dd-333-dd","audi","208", Color.valueOf(Color.blue(22)),200,"citadine","manuelle", new Date(2020)));
        colVehicule.add(new Vehicule("ee-444-ee","bmw","208", Color.valueOf(Color.blue(22)),200,"citadine","manuelle", new Date(2020)));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}