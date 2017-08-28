package ru.zvorygin.pdd.pdd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import ru.zvorygin.pdd.R;
import ru.zvorygin.pdd.fragments.FragmentPDD;

public class PDD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdd);

        TextView textView = (TextView)findViewById(R.id.textViewPDD);
        String s = getIntent().getStringExtra(FragmentPDD.TAG);
        textView.setText(s);
    }
}
