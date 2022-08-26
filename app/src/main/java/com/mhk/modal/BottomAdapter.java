package com.mhk.modal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BottomAdapter extends RecyclerView.Adapter<BottomAdapter.BottomViewHolder> {

    List<BottomItem> bList;
    IsClickItem isClickItem;

    public BottomAdapter(List<BottomItem> bList, IsClickItem isClickItem) {
        this.bList = bList;
        this.isClickItem = isClickItem;
    }

    @NonNull
    @Override
    public BottomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bottom, parent, false);

        return new BottomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BottomViewHolder holder, int position) {
        holder.tvText.setText(bList.get(position).getName());
        holder.ivImage.setImageResource(bList.get(position).getImage());


    }

    @Override
    public int getItemCount() {
        return bList.size();
    }

    public class BottomViewHolder extends RecyclerView.ViewHolder{

        TextView tvText;
        ImageView ivImage;

        public BottomViewHolder(@NonNull View itemView) {
            super(itemView);
            tvText = itemView.findViewById(R.id.tvText);
            ivImage = itemView.findViewById(R.id.ivImage);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });



        }
    }
}
