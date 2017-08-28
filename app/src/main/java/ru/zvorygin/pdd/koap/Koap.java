package ru.zvorygin.pdd.koap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import ru.zvorygin.pdd.R;

public class Koap extends AppCompatActivity {
    TableLayout table;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koap);

        table = (TableLayout)findViewById(R.id.table);
        intitializeTable();
    }
    private void intitializeTable() {
        TableRow row = new TableRow(getApplicationContext());

        TextView textView = new TextView(this);
        textView.setText("8.23");
        textView.setGravity(Gravity.CENTER_HORIZONTAL);
        row.addView(textView);

        TextView textView2 = new TextView(this);
        textView2.setText("Эксплуатация гражданами автомобилей, мотоциклов или других механических ТС," +
                " у которых содержание загрязняющих веществ в выбросах либо уровень шума," +
                " производимого ими при работе, превышает нормативы," +
                " установленные государственными стандартами Российской Федерации");
        textView2.setGravity(Gravity.CENTER_HORIZONTAL);
        row.addView(textView2);

        TextView textView3 = new TextView(this);
        textView3.setText("предупреждение или штраф 500 руб.");
        textView3.setGravity(Gravity.CENTER_HORIZONTAL);
        row.addView(textView3);

        table.addView(row);
    }
}
