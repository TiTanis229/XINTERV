package com.example.xinterv.ui.vehicule;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
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

    AlertDialog.Builder dialogBuilder;
    AlertDialog dialog;


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
        lViewVehicule.setOnItemClickListener(new ClickItemList());

        return myLayout;
    }

    private class ClickItemList implements android.widget.AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            menuDialog(i,view);
        }
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.top_add_button,menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    private void menuDialog(int position, View v){

        dialogBuilder = new AlertDialog.Builder(getContext());
        final View popupView = getLayoutInflater().inflate(R.layout.popup_detail_vehicule,null);


        Button btnOK = popupView.findViewById(R.id.buttonOK);
        btnOK.setOnClickListener(view -> dialog.dismiss());

        TextView textViewImma, textViewMarq, textViewMode, textViewCoul, textViewPuis, textViewCate, textViewBoit, textViewAnne;
        textViewImma = popupView.findViewById(R.id.editTextViewImmatriculation);
        textViewImma.setText(colVehicule.get(position).getImmatrulation());
        textViewMarq = popupView.findViewById(R.id.editTextViewMarque);
        textViewMarq.setText(colVehicule.get(position).getMarque());
        textViewMode = popupView.findViewById(R.id.editTextViewModele);
        textViewMode.setText(colVehicule.get(position).getModèle());
        textViewCoul = popupView.findViewById(R.id.editTextViewCouleur);
        textViewCoul.setText(colVehicule.get(position).getCouleur());
        textViewPuis = popupView.findViewById(R.id.editTextViewPuissance);
        textViewPuis.setText(""+colVehicule.get(position).getPuissance());
        textViewCate = popupView.findViewById(R.id.spinnerCategorie);
        textViewCate.setText(colVehicule.get(position).getCategorie());
        textViewBoit = popupView.findViewById(R.id.spinnerBoite);
        textViewBoit.setText(colVehicule.get(position).getBoite());
        textViewAnne = popupView.findViewById(R.id.editTextViewAnnee);
        textViewAnne.setText(colVehicule.get(position).getAnnee().toString());

        dialogBuilder.setView(popupView);
        dialog = dialogBuilder.create();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    private void menuAddVehicule(){

        dialogBuilder = new AlertDialog.Builder(getContext());
        final View popupView = getLayoutInflater().inflate(R.layout.popup_saisie_vehicule,null);

        Button btnOK = popupView.findViewById(R.id.buttonOK);
        btnOK.setOnClickListener(view -> dialog.dismiss());

        EditText edtImma, edtMarq, edtMode, edtCoul, edtPuis, edtCate, edtBoit, edtAnne;
        edtImma = popupView.findViewById(R.id.editTextViewImmatriculation);
        edtImma.getText().toString();
        edtMarq = popupView.findViewById(R.id.editTextViewMarque);
        edtMarq.getText().toString();
        edtMode = popupView.findViewById(R.id.editTextViewModele);
        edtMode.getText().toString();
        edtCoul = popupView.findViewById(R.id.editTextViewCouleur);
        edtCoul.getText().toString();
        edtPuis = popupView.findViewById(R.id.editTextViewPuissance);
        edtPuis.getText().toString();
        edtCate = popupView.findViewById(R.id.spinnerCategorie);
        edtCate.getText().toString();
        edtBoit = popupView.findViewById(R.id.spinnerBoite);
        edtBoit.getText().toString();
        edtAnne = popupView.findViewById(R.id.editTextViewAnnee);
        edtAnne.getText().toString();

        dialogBuilder.setView(popupView);
        dialog = dialogBuilder.create();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }

    private void MiseAJourList() {
        colVehicule.add(new Vehicule("xx-000-xx","Peugeot","208", "Noire",200,"citadine","manuelle", new Date(2020)));
        colVehicule.add(new Vehicule("bb-111-bb","Citroen","C3", "Noire",200,"citadine","manuelle", new Date(2020)));
        colVehicule.add(new Vehicule("cc-222-cc","Volkswagen","Polo", "Noire",200,"citadine","automatique", new Date(2020)));
        colVehicule.add(new Vehicule("dd-333-dd","Audi","A1", "Noire",200,"citadine","manuelle", new Date(2020)));
        colVehicule.add(new Vehicule("ee-444-ee","BMW","Série 1", "Noire",200,"citadine","manuelle", new Date(2020)));
        colVehicule.add(new Vehicule("bb-111-bb","Skoda","octavia", "Noire",200,"citadine","manuelle", new Date(2020)));
        colVehicule.add(new Vehicule("cc-222-cc","Volkswagen","Passat", "Noire",200,"Berline","manuelle", new Date(2015)));
        colVehicule.add(new Vehicule("dd-333-dd","Maserati","Gracale", "Noire",200,"SUV","automatique", new Date(2020)));
        colVehicule.add(new Vehicule("ee-444-ee","Ferrari","GTO", "Noire",200,"Supercar","automatique", new Date(2020)));
        colVehicule.add(new Vehicule("bb-111-bb","DS","DS3", "Noire",200,"citadine","manuelle", new Date(2020)));
        colVehicule.add(new Vehicule("cc-222-cc","Hyundai","i20", "Noire",200,"citadine","manuelle", new Date(2018)));
        colVehicule.add(new Vehicule("dd-333-dd","audi","208", "Noire",200,"citadine","manuelle", new Date(2020)));

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}