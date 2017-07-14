package com.hitungluas.dankedev.hitungluas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.DuplicateFormatFlagsException;

public class MainActivity extends AppCompatActivity {
    private EditText edtPanjang, edtLebar;
    private Button btnHitung;
    private TextView txtLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        edtPanjang = (EditText) findViewById(R.id.edt_panjang);
        edtLebar = (EditText) findViewById(R.id.edt_lebar);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        txtLuas = (TextView) findViewById(R.id.txt_luas);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    //String panjang = edtPanjang.getText().toString().trim();
                    //String lebar = edtLebar.getText().toString().trim();
                    double panjang = Double.valueOf(edtPanjang.getText().toString());
                    double lebar = Double.valueOf(edtLebar.getText().toString());

                    //double p = Double.parseDouble(panjang);
                    //double l = Double.parseDouble(lebar);

                    double luas = panjang * lebar;

                    txtLuas.setText("Luas: " + luas);
                    Toast.makeText(getApplicationContext(), "Perhitungan Berhasil",
                            Toast.LENGTH_SHORT).show();
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Masukan Angka pada kolomg Panjang dan Lebar Terlebih Dahulu.",
                            Toast.LENGTH_SHORT).show();

                    //Toast.makeText(this,"Nilai yang dimasukkan tidak boleh kosong",Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
