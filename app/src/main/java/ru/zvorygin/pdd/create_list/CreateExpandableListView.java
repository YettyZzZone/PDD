package ru.zvorygin.pdd.create_list;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.SimpleExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import ru.zvorygin.pdd.R;

public class CreateExpandableListView extends AppCompatActivity {
    // коллекция для групп
    ArrayList<Map<String, String>> groupData;

    // коллекция для элементов одной группы
    ArrayList<Map<String, String>> childDataItem;

    // общая коллекция для коллекций элементов
    ArrayList<ArrayList<Map<String, String>>> childData;

    // список атрибутов группы или элемента
    Map<String, String> map;

    public SimpleExpandableListAdapter onCreateExpandableListView(Context context){
        // создаем коллекцию элементов названий групп
        groupData = new ArrayList<Map<String,String>>();
        String[] group = context.getResources().getStringArray(R.array.groups);
        for (String g :
                group) {
            map = new HashMap<String, String>();
            map.put("groupName", g);//Название группы
            groupData.add(map);
        }

        // список атрибутов групп для чтения
        String groupFrom[] = new String[] {"groupName"};
        // список ID view-элементов, в которые будет помещены атрибуты групп
        int groupTo[] = new int[] {android.R.id.text1};

        // создаем коллекцию для коллекций элементов
        childData = new ArrayList<ArrayList<Map<String, String>>>();

        // создаем коллекцию элементов для первой группы
        childDataItem = new ArrayList<Map<String, String>>();
        String[] group1 = context.getResources().getStringArray(R.array.group1);
        for (String g1 :
                group1) {
            map = new HashMap<String, String>();
            map.put("itemName", g1);
            childDataItem.add(map);
        }
        childData.add(childDataItem);

        //Создаем коллекцию элементов для второй группы
        childDataItem = new ArrayList<Map<String, String>>();
        String[] group2 = context.getResources().getStringArray(R.array.group2);
        for (String g2 :
                group2) {
            map = new HashMap<String, String>();
            map.put("itemName", g2);
            childDataItem.add(map);
        }
        childData.add(childDataItem);

        //Создаем коллекцию элементов для третьей группы
        childDataItem = new ArrayList<Map<String, String>>();
        String[] group3 = context.getResources().getStringArray(R.array.group3);
        for (String g3 :
                group3) {
            map = new HashMap<String, String>();
            map.put("itemName", g3);
            childDataItem.add(map);
        }
        childData.add(childDataItem);

        //Создаем коллекцию элементов для четвертой группы
        childDataItem = new ArrayList<Map<String, String>>();
        String[] group4 = context.getResources().getStringArray(R.array.group4);
        for (String g4 :
                group4) {
            map = new HashMap<String, String>();
            map.put("itemName", g4);
            childDataItem.add(map);
        }
        childData.add(childDataItem);

        // список атрибутов групп для чтения
        String itemFrom[] = new String[] {"itemName"};
        // список ID view-элементов, в которые будет помещены атрибуты групп
        int itemTo[] = new int[] {android.R.id.text1};

        SimpleExpandableListAdapter simpleExpandableListAdapter = new SimpleExpandableListAdapter(
                context,
                groupData,
                android.R.layout.simple_expandable_list_item_1,
                groupFrom,
                groupTo,
                childData,
                android.R.layout.simple_expandable_list_item_1,
                itemFrom,
                itemTo
        );
        return simpleExpandableListAdapter;
    }

}
