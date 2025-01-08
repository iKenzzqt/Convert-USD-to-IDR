package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class hitung extends AppCompatActivity {

    private EditText etDollar;
    private Button btnConvert;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung);

        etDollar = findViewById(R.id.etDollar);
        btnConvert = findViewById(R.id.btnConvert);
        tvResult = findViewById(R.id.tvResult);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dollarInput = etDollar.getText().toString();

                if (dollarInput.isEmpty()) {
                    Toast.makeText(hitung.this, "Masukkan jumlah Dollar!", Toast.LENGTH_SHORT).show();
                    return;
                }

                double dollar = Double.parseDouble(dollarInput);
                double rupiah = dollar * 15000; // 1 dolar Rp.15.000
                tvResult.setText(String.format("Hasil dalam Rupiah: Rp %.2f", rupiah));
            }
        });
    }
}
