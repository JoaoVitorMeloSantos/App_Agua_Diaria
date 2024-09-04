package com.joao.water;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CopoAdapter extends RecyclerView.Adapter<CopoAdapter.CopoViewHolder> {

    private List<Copo> copos;
    private Context context;
    private OnCopoClickListener listener;

    public interface OnCopoClickListener {
        void onCopoClick(int position);
    }

    public CopoAdapter(Context context, List<Copo> copos, OnCopoClickListener listener) {
        this.context = context;
        this.copos = copos;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CopoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.copo_item, parent, false);
        return new CopoViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull CopoViewHolder holder, int position) {
        Copo copo = copos.get(position);
        holder.copoTextView.setText("150 ml");

        // Configura a imagem do copo (cheio ou vazio)
        if (copo.isCheio()) {
            holder.copoImageView.setImageResource(R.drawable.watercup); // Defina a imagem colorida
        } else {
            holder.copoImageView.setImageResource(R.drawable.watercup2); // Defina a imagem cinza
        }
    }

    @Override
    public int getItemCount() {
        return copos.size();
    }

    public static class CopoViewHolder extends RecyclerView.ViewHolder {

        ImageView copoImageView;
        TextView copoTextView;

        public CopoViewHolder(@NonNull View itemView, final OnCopoClickListener listener) {
            super(itemView);
            copoImageView = itemView.findViewById(R.id.imageView);
            copoTextView = itemView.findViewById(R.id.textView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onCopoClick(position);
                        }
                    }
                }
            });
        }
    }
}

