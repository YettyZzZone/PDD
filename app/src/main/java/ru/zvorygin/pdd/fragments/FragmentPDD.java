package ru.zvorygin.pdd.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import ru.zvorygin.pdd.R;
import ru.zvorygin.pdd.pdd.PDD;
import ru.zvorygin.pdd.create_list.CreateExpandableListView;

public class FragmentPDD extends Fragment {
    ExpandableListView exlViewPDD;
    public static final String TAG = "pdd";
    public FragmentPDD() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pdd, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //Находим элемент ExLView и вызываем метод для создания списка
        exlViewPDD = (ExpandableListView) view.findViewById(R.id.exLViewPDD);
        exlViewPDD.setAdapter(new CreateExpandableListView().onCreateExpandableListView(getActivity()));

        exlViewPDD.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {
                Intent intent = new Intent(getActivity().getApplicationContext(), PDD.class);
                if (i == 0) {
                    String[] pdd = getResources().getStringArray(R.array.pdd0);
                    switch (i1) {
                        case 0:
                            intent.putExtra(TAG, pdd[0]);
                            startActivity(intent);
                            break;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            intent.putExtra(TAG, pdd[1]);
                            startActivity(intent);
                            break;
                    }
                } else if (i == 1) {
                    String[] pdd = getResources().getStringArray(R.array.pdd1);
                    switch (i1) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            intent.putExtra(TAG, pdd[0]);
                            startActivity(intent);
                            break;
                    }
                } else if (i == 2) {
                    String[] pdd = getResources().getStringArray(R.array.pdd2);
                    switch (i1) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            intent.putExtra(TAG, pdd[0]);
                            startActivity(intent);
                            break;
                    }
                } else if (i == 3) {
                    String[] pdd = getResources().getStringArray(R.array.pdd3);
                    switch (i1) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            intent.putExtra(TAG, pdd[0]);
                            startActivity(intent);
                            break;
                    }
                }
                return false;
            }
        });
    }
}
