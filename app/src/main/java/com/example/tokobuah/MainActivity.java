package com.example.tokobuah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void manggaDetail(View view) {

        Uri webPage = Uri.parse("https://www.liputan6.com/bola/read/4090172/berbagai-manfaat-buah-mangga-salah-satunya-mengatasi-obesitas");
        Intent intent = new Intent(Intent.ACTION_VIEW, webPage);

        if(intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void manggaOrder(View view) {
        Intent intent = new Intent(MainActivity.this, OrderActivity.class);
        intent.putExtra("NAMA_BUAH", getString(R.string.mangga_title));
        intent.putExtra("HARGA_BUAH", "20000");
        startActivity(intent);
    }

    public void apelFujiOrder(View view) {
        Intent intent = new Intent(MainActivity.this, OrderActivity.class);
        intent.putExtra("NAMA_BUAH", getString(R.string.apel_fuji_title));
        intent.putExtra("HARGA_BUAH", "35000");
        startActivity(intent);
    }

    public void apelFujiDetail(View view) {

        Uri webPage = Uri.parse("https://www.pertanianku.com/lima-manfaat-apel-fuji-yang-menakjubkan/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webPage);

        if(intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void apelAnggurMerahOrder(View view) {
        Intent intent = new Intent(MainActivity.this, OrderActivity.class);
        intent.putExtra("NAMA_BUAH", getString(R.string.anggur_merah_title));
        intent.putExtra("HARGA_BUAH", "40000");
        startActivity(intent);
    }

    public void anggurMerahDetail(View view) {

        Uri webPage = Uri.parse("https://www.khasiatsehat.com/khasiat-dan-manfaat-buah-anggur-merah/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webPage);

        if(intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void anggurHitamOrder(View view) {
        Intent intent = new Intent(MainActivity.this, OrderActivity.class);
        intent.putExtra("NAMA_BUAH", getString(R.string.anggur_hitam_title));
        intent.putExtra("HARGA_BUAH", "30000");
        startActivity(intent);
    }

    public void anggurHitamDetail(View view) {

        Uri webPage = Uri.parse("https://www.ayobandung.com/read/2018/02/04/28263/10-manfaat-anggur-hitam-untuk-kesehatan");
        Intent intent = new Intent(Intent.ACTION_VIEW, webPage);

        if(intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}

