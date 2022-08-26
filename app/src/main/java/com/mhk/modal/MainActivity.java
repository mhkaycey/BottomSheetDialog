package com.mhk.modal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView tvClick;
    List<BottomItem> mBottom = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvClick = findViewById(R.id.tvClick);
        tvClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setClick();
            }
        });
    }

   private void setClick(){
       mBottom = new ArrayList<>();


        BottomFragment bottomFragment = new BottomFragment(mBottom, new IsClickItem() {
            @Override
            public void Clicked(BottomItem bottomItem) {

            }
        });

       bottomFragment.show(getSupportFragmentManager(), bottomFragment.getTag());

    }
}