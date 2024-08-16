package com.example.ipbtestingapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private EditText etBilanganPertama;
    private EditText etBilanganKedua;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etBilanganPertama = findViewById(R.id.etBilanganPertama);
        etBilanganKedua = findViewById(R.id.etBilanganKedua);
        tvHasil = findViewById(R.id.tvHasil);

        findViewById(R.id.btnTambah).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungPenjumlahan();
            }
        });

        findViewById(R.id.btnKurang).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungPengurangan();
            }
        });

        findViewById(R.id.btnKali).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungPerkalian();
            }
        });

         findViewById(R.id.btnBagi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungPembagian();
            }
        });

        Button navigateButton = findViewById(R.id.navigate_button);
        navigateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToMainActivity();
            }
        });
    }

    private void hitungPenjumlahan() {
        double bil1 = getBilanganPertama();
        double bil2 = getBilanganKedua();
        if (bil1 != Double.NaN && bil2 != Double.NaN) {
            double hasil = bil1 + bil2;
            tvHasil.setText("Hasil: " + bil1 + " + " + bil2 + " = " + hasil);
        }
    }

    private void hitungPengurangan() {
        double bil1 = getBilanganPertama();
        double bil2 = getBilanganKedua();
        if (bil1 != Double.NaN && bil2 != Double.NaN) {
            double hasil = bil1 - bil2;
            tvHasil.setText("Hasil: " + bil1 + " - " + bil2 + " = " + hasil);
        }
    }

    private void hitungPerkalian() {
        double bil1 = getBilanganPertama();
        double bil2 = getBilanganKedua();
        if (bil1 != Double.NaN && bil2 != Double.NaN) {
            double hasil = bil1 * bil2;
            tvHasil.setText("Hasil: " + bil1 + " * " + bil2 + " = " + hasil);
        }
    }

    private void hitungPembagian() {
        double bil1 = getBilanganPertama();
        double bil2 = getBilanganKedua();
        if (bil1 != Double.NaN && bil2 != Double.NaN) {
            if (bil2 != 0) {
                double hasil = bil1 / bil2;
                tvHasil.setText("Hasil: " + bil1 + " / " + bil2 + " = " + hasil);
            } else {
                tvHasil.setText("Tidak dapat membagi dengan nol");
            }
        }
    }

    private double getBilanganPertama() {
        String bil1Str = etBilanganPertama.getText().toString();
        return !bil1Str.isEmpty() ? Double.parseDouble(bil1Str) : Double.NaN;
    }

    private double getBilanganKedua() {
        String bil2Str = etBilanganKedua.getText().toString();
        return !bil2Str.isEmpty() ? Double.parseDouble(bil2Str) : Double.NaN;
    }

    private void navigateToMainActivity() {
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }
}
