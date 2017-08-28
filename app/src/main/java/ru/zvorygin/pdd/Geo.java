package ru.zvorygin.pdd;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Geo extends AppCompatActivity {
    public static final String SAVED_VALUE = "Geo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);
        this.setTitle("Выбор региона");

        String[] s = getResources().getStringArray(R.array.geolocation);
        //Адаптер
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, s);
        //Для прорисовки пунктов выпадающего меню
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                SharedPreferences sPref = getPreferences(MODE_PRIVATE);
                SharedPreferences.Editor ed = sPref.edit();
                ed.putInt(SAVED_VALUE, i);
                ed.apply();
                Toast.makeText(getApplicationContext(), "Ваш регион запомнен", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
