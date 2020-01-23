package com.example.cryptocompareclone.ui.watchlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocompareclone.R;

import java.util.ArrayList;
import java.util.List;

public class CurrencyListAdaptor extends RecyclerView.Adapter<CurrencyListAdaptor.ViewHolder> {
    private List<String> currencyList = new ArrayList<>();
    private List<String> currencyAbbreviation = new ArrayList<>();


    public CurrencyListAdaptor(List<String> currencyList, List<String> currencyAbbreviation) {
        this.currencyList = currencyList;
        this.currencyAbbreviation = currencyAbbreviation;
    }

    @NonNull
    @Override
    public CurrencyListAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater
                .inflate(R.layout.currency_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyListAdaptor.ViewHolder holder, int position) {
        holder.currencyName.setText(currencyList.get(position));
        holder.currencyAbbreviation.setText(currencyAbbreviation.get(position));
    }

    @Override
    public int getItemCount() {
        return currencyList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView currencyName;
        TextView currencyAbbreviation;
        ImageView selected;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            currencyName = itemView.findViewById(R.id.currency_name);
            currencyAbbreviation = itemView.findViewById(R.id.currency_abbreviation);
            selected = itemView.findViewById(R.id.selected);
        }
    }
}
