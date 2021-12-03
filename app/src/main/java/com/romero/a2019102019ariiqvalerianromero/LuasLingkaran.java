package com.romero.a2019102019ariiqvalerianromero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LuasLingkaran extends AppCompatActivity {
    private EditText txtJari;
    private TextView txtHasil;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);

        txtJari = findViewById(R.id.txtJari);
        txtHasil = findViewById(R.id.txtHasil);
        btnHitung = findViewById(R.id.btnHitung);
    }

    public void hitungLuas (View view){
        int jari = Integer.parseInt(txtJari.getText().toString());
        double luas = 3.14 * jari * jari;

        txtHasil.setText(String.valueOf(luas));
    }
}