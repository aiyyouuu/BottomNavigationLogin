package com.example.recyclerviewlogin;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TempatAdapter extends RecyclerView.Adapter<TempatAdapter.ViewHolder> {
    Context context;
    List<TempatModel> tempatModels = new ArrayList<>();
    public TempatAdapter(Context context, List<TempatModel> tempatModels) {
        this.context = context;
        this.tempatModels = tempatModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_view, viewGroup, false); // menghubungkan ke layout
        ViewHolder holder = new ViewHolder(view); // deklarasi class ViewHolder di baris 46
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.tvNama.setText(tempatModels.get(i).getNamaTempat());
        viewHolder.ivFoto.setImageResource(tempatModels.get(i).getFotoTempat());
        viewHolder.overview.setText(tempatModels.get(i).getOverview());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // ketika recycler di click
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailTempatActivity.class);
                intent.putExtra("name", tempatModels.get(i).getNamaTempat());
                intent.putExtra("gambar", tempatModels.get(i).getFotoTempat());
                intent.putExtra("overview", tempatModels.get(i).getOverview());
                context.startActivity(intent);
                Toast.makeText(context, tempatModels.get(i).getNamaTempat(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return tempatModels.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvNama;
        TextView overview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFoto = itemView.findViewById(R.id.pic);
            tvNama = itemView.findViewById(R.id.tv1);
            overview = itemView.findViewById(R.id.tv_overview);
        }
    }
}
