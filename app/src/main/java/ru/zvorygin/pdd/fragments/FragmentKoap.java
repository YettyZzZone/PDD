package ru.zvorygin.pdd.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import ru.zvorygin.pdd.R;
import ru.zvorygin.pdd.koap.Koap;
import ru.zvorygin.pdd.create_list.CreateListView;

public class FragmentKoap extends Fragment {
    ListView lView;

    Fragment fragment1 = new FragmentPDD();
    FragmentTransaction fTrans;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_koap, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lView = (ListView) view.findViewById(R.id.listViewKOAP);
        lView.setAdapter(new CreateListView().onCreateListView(getActivity()));

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i >= 0 && i <= 8) {
                    Intent intent = new Intent(getActivity().getApplicationContext(), Koap.class);
                    startActivity(intent);
                }
            }
        });
    }
}
