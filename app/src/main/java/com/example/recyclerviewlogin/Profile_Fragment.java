package com.example.recyclerviewlogin;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Profile_Fragment extends Fragment {
    List<TempatModel> tempatModels = new ArrayList<>();
    TempatAdapter adapter;

    public Profile_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        return view;
    }

   /* @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        adapter = new TempatAdapter(getContext(), tempatModels);
        recyclerView.setAdapter(adapter);
        TempatPresenter data = new TempatPresenter(this,getContext());
        data.setData();
    }

    @Override
    public void onSuccess(List<TempatModel> tempatModels) {
        this.tempatModels.clear();
        this.tempatModels.addAll(tempatModels);
        this.adapter.notifyDataSetChanged();
    }*/
}
