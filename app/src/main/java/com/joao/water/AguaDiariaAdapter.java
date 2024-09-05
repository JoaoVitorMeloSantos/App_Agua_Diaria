package com.joao.water;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AguaDiariaAdapter extends RecyclerView.Adapter<CopoViewHolder> {
    private final List<CopoViewModel> copos;
    private final OnCopoClickListener onCopoClickListener;

    public AguaDiariaAdapter(List<CopoViewModel> copos, OnCopoClickListener onCopoClickListener) {
        this.copos = copos;
        this.onCopoClickListener = onCopoClickListener;
    }

    @NonNull
    @Override
    public CopoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.cup, parent, false);
        return new CopoViewHolder(view, onCopoClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull CopoViewHolder holder, int position) {
        holder.bind(copos.get(position));
    }

    @Override
    public int getItemCount() {
        return copos.size();
    }
}





