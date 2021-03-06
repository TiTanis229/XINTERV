package com.example.xinterv.vehicule;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.xinterv.R;

import java.util.ArrayList;

public class AdapterVehicule extends BaseAdapter {

    private final ArrayList<Vehicule> vehiculeArrayList;
    private final LayoutInflater layoutInflater;
    ConstraintLayout itemView;

    public AdapterVehicule(ArrayList<Vehicule> vehiculeArrayList, Context context) {
        this.vehiculeArrayList = vehiculeArrayList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return vehiculeArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return vehiculeArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        //Obtenir l'ItemView
        if (convertView == null){
            //Création (Expansion) de l'ItemView à partir du fichier XML
            itemView = (ConstraintLayout) layoutInflater.inflate(R.layout.itemview_vehicule,viewGroup,false);
        }
        else {
            //Recyclage de l'ItemVieew
            itemView = (ConstraintLayout) convertView;
        }

        TextView txtImmatriculation = itemView.findViewById(R.id.editTextViewImmatriculation);
        txtImmatriculation.setText(vehiculeArrayList.get(position).getImmatrulation());

        TextView txtDetail = itemView.findViewById(R.id.textViewDetail);
        txtDetail.setText(vehiculeArrayList.get(position).getMarque() + " " + vehiculeArrayList.get(position).getModèle());

        return itemView;
    }

    public ArrayList<Vehicule> getVehiculeArrayList(){return vehiculeArrayList;}
}
