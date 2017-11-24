package com.example.prachi.adaehaandis;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.prachi.adaehaandis.R.id.container;

/**
 * Created by prachi on 22/11/17.
 */

public class menufragment extends Fragment {
    ArrayAdapter<String> adapter;
    ArrayList<String> list;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_menu_acticity,container,false);
        ListView menulist=(ListView)view.findViewById(R.id.listview);
        list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i,"item"+(i+1));
        }
        adapter=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,list);
        menulist.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        return view;
    }

    }
