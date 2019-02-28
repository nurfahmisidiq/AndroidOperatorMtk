package id.sch.smktelkom_mlg.www.operatormatematika;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnTambah, btnKurang, btnKali, btnBagi;
    TextView txtAwal, txtOperator, txtHasil;
    EditText editAwal, editKedua, editHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnBagi = findViewById(R.id.btnBagi);
        btnKali = findViewById(R.id.btnKali);
        txtOperator = findViewById(R.id.txtOperator);
        txtAwal = findViewById(R.id.txtAwal);
        txtHasil = findViewById(R.id.txtHasil);
        editAwal = findViewById(R.id.editAwal);
        editKedua = findViewById(R.id.editKedua);
        editHasil = findViewById(R.id.editHasil);
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorpenjumlahan();
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorpengurangan();
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorperkalian();
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorpembagian();
            }
        });
    }

    private void operatorpenjumlahan() {
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int penjumlahan = angkaawal + angkakedua;
        editHasil.setText(penjumlahan + "");
    }

    private void operatorpengurangan() {
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int pengurangan = angkaawal - angkakedua;
        editHasil.setText(pengurangan + "");
    }

    private void operatorperkalian() {
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int perkalian = angkaawal * angkakedua;
        editHasil.setText(perkalian + "");
    }

    private void operatorpembagian() {
        double angkaawal = Double.parseDouble(editAwal.getText().toString());
        double angkakedua = Double.parseDouble(editKedua.getText().toString());
        double pembagian = angkaawal / angkakedua;
        editHasil.setText(pembagian + "");
    }
}
