package com.example.cryptocompareclone.ui.watchlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocompareclone.R;
import com.example.cryptocompareclone.models.watchlist.CurrencyResponsePage;
import com.example.cryptocompareclone.models.watchlist.Datum;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class WatchlistAdapter extends RecyclerView.Adapter<WatchlistAdapter.CoinViewHolder> {

    public static final String BASE_URL_FOR_COIN_IMAGE = "https://www.cryptocompare.com";
    private WatchlistAdapterInterface watchlistAdapterInterface;
    private List<Datum> mDatum = new ArrayList<>();

    public WatchlistAdapter(WatchlistAdapterInterface watchlistAdapterInterface) {
        this.watchlistAdapterInterface = watchlistAdapterInterface;
    }

    interface WatchlistAdapterInterface {
        void goToCoinDetail(Datum datum);
    }

    @NonNull
    @Override
    public CoinViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.coininfo,
                parent, false);
        return new CoinViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoinViewHolder holder, final int position) {
        Picasso.get().load(BASE_URL_FOR_COIN_IMAGE + mDatum.get(position).getCoinInfo().getImageUrl() + "?width=120")
                .into(holder.mCoinImage);
        holder.tvCoinSerialNo.setText("" + (position + 1));
        holder.mCoinFullName.setText("" + mDatum.get(position).getCoinInfo().getFullName());
        holder.mCoinShortName.setText("" + mDatum.get(position).getCoinInfo().getName());
        String getTotalVolume = "" + Math.round(mDatum.get(position).getRAW().getUSD()
                .getTOTALVOLUME24HTO() / 10000F);
        getTotalVolume = getTotalVolume.substring(0, getTotalVolume.length() - 2) + "." +
                getTotalVolume.substring(getTotalVolume.length() - 2, getTotalVolume.length());
        holder.mCoinVolume.setText(mDatum.get(position).getDISPLAY().getUSD().getTOSYMBOL()
                + " " + getTotalVolume + " M");

        String getCurrentPrice = "" + mDatum.get(position).getRAW().getUSD().getPRICE();

        holder.mParentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                watchlistAdapterInterface.goToCoinDetail(mDatum.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {

        if (mDatum != null) {
            return mDatum.size();
        }
        return 0;
    }

    public void setCoinData(List<Datum> mDatum) {
        this.mDatum = mDatum;
        this.notifyDataSetChanged();
    }

    public void clearData() {
        mDatum.clear();
    }


    class CoinViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout mParentLayout;
        TextView tvCoinSerialNo;
        ImageView mCoinImage;
        TextView mCoinFullName;
        TextView mCoinShortName;
        TextView mCoinVolume;
        ImageView mCoinGrowthStatus;
        TextView mCoinCurrentPrice;

        public CoinViewHolder(@NonNull View itemView) {
            super(itemView);
            mParentLayout = itemView.findViewById(R.id.parent_layout_coininfo);
            tvCoinSerialNo = itemView.findViewById(R.id.coin_serial_no);
            mCoinImage = itemView.findViewById(R.id.coin_image);
            mCoinFullName = itemView.findViewById(R.id.coin_name);
            mCoinShortName = itemView.findViewById(R.id.coin_short_name);
            mCoinVolume = itemView.findViewById(R.id.tv_coin_volume);
            mCoinGrowthStatus = itemView.findViewById(R.id.imv_currency_status_indicator);
            mCoinCurrentPrice = itemView.findViewById(R.id.tv_currency_current_price);

            mCoinImage = itemView.findViewById(R.id.coin_image);

        }
    }
}
