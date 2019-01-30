package com.example.howtofragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.howtofragment.Fragment.DuaFragment;
import com.example.howtofragment.Fragment.EmpatFragment;
import com.example.howtofragment.Fragment.LimaFragment;
import com.example.howtofragment.Fragment.SatuFragment;
import com.example.howtofragment.Fragment.TigaFragment;

public class MainActivity extends AppCompatActivity {

    TextView tvPilih;
    Spinner spKota;
    FragmentManager fm;
    public String[] listKota = {
            "-Pilih-", "Jakarta", "Semarang", "Bandung", "Makassar"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();

        tvPilih = findViewById(R.id.tv_pilih);
        spKota = findViewById(R.id.sp_kota);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, listKota);
        spKota.setAdapter(adapter);
        spKota.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Toast.makeText(MainActivity.this, "-Pilih-", Toast.LENGTH_SHORT).show();
                        fm.beginTransaction()
                                .add(R.id.relative_container, new SatuFragment())
                                .commit();
                        break;

                    case 1:
                        Toast.makeText(MainActivity.this, "Jakarta", Toast.LENGTH_SHORT).show();
                        fm.beginTransaction()
                                .add(R.id.relative_container, new DuaFragment())
                                .commit();
                        break;

                    case 2:
                        Toast.makeText(MainActivity.this, "Semarang", Toast.LENGTH_SHORT).show();
                        fm.beginTransaction()
                                .add(R.id.relative_container, new TigaFragment())
                                .commit();
                        break;

                    case 3:
                        Toast.makeText(MainActivity.this, "Bandung", Toast.LENGTH_SHORT).show();
                        fm.beginTransaction()
                                .add(R.id.relative_container, new EmpatFragment())
                                .commit();
                        break;

                    case 4:
                        Toast.makeText(MainActivity.this, "Makassar", Toast.LENGTH_SHORT).show();
                        fm.beginTransaction()
                                .add(R.id.relative_container, new LimaFragment())
                                .commit();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
