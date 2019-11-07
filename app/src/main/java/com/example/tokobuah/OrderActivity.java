package com.example.tokobuah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private String caraPembayaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent = getIntent();

        String namaBuah = intent.getStringExtra("NAMA_BUAH");
        TextView namaBuahView = findViewById(R.id.nama_buah);
        namaBuahView.setText(namaBuah);

        String hargaBuah = intent.getStringExtra("HARGA_BUAH");
        TextView hargaBuahView = findViewById(R.id.harga_buah);
        hargaBuahView.setText(hargaBuah);

        Spinner spinner = findViewById(R.id.label_spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.label_arrays, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }

    public void pilihTransfer(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.transfer:
                if (checked) caraPembayaran = "Transfer";
                    break;
            case R.id.cod:
                if (checked) caraPembayaran = "Cash On Delivery";
                    break;
            default:
                break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        String spinnerLabel = adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void prosesPembelian(View view) {
        Intent intent = getIntent();
        String namaBuah = intent.getStringExtra("NAMA_BUAH");
        String hargaBuah = intent.getStringExtra("HARGA_BUAH");

        Spinner spinner = (Spinner) findViewById(R.id.label_spinner);
        String jumlah = spinner.getSelectedItem().toString();

        int totalJumlah = Integer.parseInt(jumlah) * Integer.parseInt(hargaBuah);

        TextView hasilPesanan = findViewById(R.id.hasil_pesanan);

        hasilPesanan.setText("Pesanan untuk buah sedang diproses \n--Detail  pemesanan-- \npilihan buah anggur: " + namaBuah +"\ntotal Harga: Rp." + Integer.toString(totalJumlah) + "\nmetode pembayaran: " + caraPembayaran );

    }
}
