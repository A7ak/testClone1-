package com.example.cryptocompareclone.ui.portfolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocompareclone.R;
import com.example.cryptocompareclone.models.watchlist.Datum;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.CurrencyViewHolder> {
    private String[] currencyUnitList;

    public CurrencyAdapter(String[] currencyUnitList) {
        this.currencyUnitList = currencyUnitList;
    }

    @NonNull
    @Override
    public CurrencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.coininfo,
                parent, false);
        return new CurrencyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyViewHolder holder, final int position) {
        holder.currencyUnit.setText(currencyUnitList[position]);
    }

    @Override
    public int getItemCount() {

        if (currencyUnitList != null) {
            return currencyUnitList.length;
        }
        return 0;
    }


    class CurrencyViewHolder extends RecyclerView.ViewHolder {

        TextView currencyUnit;

        public CurrencyViewHolder(@NonNull View itemView) {
            super(itemView);
            currencyUnit = itemView.findViewById(R.id.currency_unit);
        }
    }
}
