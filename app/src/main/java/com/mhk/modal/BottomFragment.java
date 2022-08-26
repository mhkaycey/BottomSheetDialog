package com.mhk.modal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.List;


public class BottomFragment extends BottomSheetDialogFragment {

    List<BottomItem>  mBottom ;
    RecyclerView rData;
    BottomAdapter bottomAdapter;
    LinearLayoutManager linearLayoutManager;
    IsClickItem isClickItem;

    public BottomFragment(List<BottomItem> mBottom, IsClickItem isClickItem) {
        this.mBottom = mBottom;
        this.isClickItem = isClickItem;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_bottom, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rData = view.findViewById(R.id.rvData);

        mBottom = new ArrayList<>();

        mBottom.add(new BottomItem("Hello", R.drawable.ic_launcher_foreground));
        mBottom.add(new BottomItem("Hello", R.drawable.ic_launcher_foreground));
        mBottom.add(new BottomItem("Hello", R.drawable.ic_launcher_foreground));


        linearLayoutManager = new LinearLayoutManager(getContext());
        bottomAdapter = new BottomAdapter(mBottom, new IsClickItem() {
            @Override
            public void Clicked(BottomItem bottomItem) {

            }
        });
        rData.setLayoutManager(linearLayoutManager);
        rData.setAdapter(bottomAdapter);
    }
}