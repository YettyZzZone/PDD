package ru.zvorygin.pdd.create_list;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import ru.zvorygin.pdd.R;

public class CreateListView extends AppCompatActivity {
    public ArrayAdapter<String> onCreateListView (Context context) {
        String[] list = context.getResources().getStringArray(R.array.koap);
        return new ArrayAdapter<String>(context,
                android.R.layout.simple_list_item_1, list);
    }
}
