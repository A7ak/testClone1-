package com.example.cryptocompareclone.ui.watchlist;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.cryptocompareclone.MainActivity;
import com.example.cryptocompareclone.R;
import com.example.cryptocompareclone.models.watchlist.Datum;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class WatchlistDetailActivity extends AppCompatActivity {
    private LineChart mChart;


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watchlist_detail);

        String BASE_URL_FOR_COIN_IMAGE = "https://www.cryptocompare.com";

        if (getIntent() != null) {
            Datum datum = getIntent().getParcelableExtra("datum");
            Log.d("tag", "datum: " + datum.getCoinInfo().getImageUrl());
            ImageView backArrow = findViewById(R.id.back_arrow);
            ImageView currencyIcon = findViewById(R.id.detail_symbol);
            TextView currencyPrice = findViewById(R.id.currency_price);
            TextView percentageIndicator = findViewById(R.id.percentage_indicator);
            TextView marketCap = findViewById(R.id.market_cap);
            TextView totalVolume24h = findViewById(R.id.total_volume_24h);
            TextView directVolume24h = findViewById(R.id.direct_volume_24h);
            TextView directVolume24H$ = findViewById(R.id.direct_volume_24h_currency);
            TextView open24h = findViewById(R.id.open_24h_currency);
            TextView lowHigh24h = findViewById(R.id.low_high_24h);
            Picasso.get().load(BASE_URL_FOR_COIN_IMAGE + datum.getCoinInfo().getImageUrl()
                    + "?width=175")
                    .into(currencyIcon);

            currencyPrice.setText(datum.getDISPLAY().getUSD().getPRICE());
            percentageIndicator.setText(datum.getDISPLAY().getUSD().getCHANGEPCT24HOUR());
            marketCap.setText(datum.getDISPLAY().getUSD().getMKTCAP());
            totalVolume24h.setText(datum.getDISPLAY().getUSD().getTOTALVOLUME24H());
            directVolume24h.setText(datum.getDISPLAY().getUSD().getVOLUMEHOUR());
            directVolume24H$.setText(datum.getDISPLAY().getUSD().getVOLUME24HOURTO());
            open24h.setText(datum.getDISPLAY().getUSD().getOPEN24HOUR());
            lowHigh24h.setText(datum.getDISPLAY().getUSD().getLOW24HOUR() + " / "
                    + datum.getDISPLAY().getUSD().getHIGH24HOUR());

            backArrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(WatchlistDetailActivity.this
                            , MainActivity.class);
                    startActivity(intent);
                }
            });


        }
        mChart = findViewById(R.id.chart);
        mChart.setTouchEnabled(true);
        mChart.setPinchZoom(true);
        MyMarkerView mv = new MyMarkerView(getApplicationContext(), R.layout.custom_marker_view);
        mv.setChartView(mChart);
        mChart.setMarker(mv);
        mChart.getAxisLeft().setDrawGridLines(false);
        mChart.getXAxis().setDrawGridLines(false);
        mChart.getAxisRight().setDrawGridLines(false);
        XAxis xAxis = mChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        mChart.getAxisRight().setEnabled(false);
        YAxis leftAxis = mChart.getAxisLeft();
        setData();

        float maxValue = mChart.getYMax();
        LimitLine upperLimit = new LimitLine(maxValue, "limit");
        upperLimit.setLineColor(getColor(R.color.graph_max_limit));
        upperLimit.setLineWidth(1f);
        upperLimit.setTextColor(Color.BLACK);
        upperLimit.setTextSize(12f);
        leftAxis.addLimitLine(upperLimit);


        //  renderData();
    }

    public void renderData() {
/*
        LimitLine llXAxis = new LimitLine(10f, "Index 10");
        llXAxis.setLineWidth(4f);
        llXAxis.enableDashedLine(10f, 10f, 0f);
        llXAxis.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_BOTTOM);
        llXAxis.setTextSize(10f);

        XAxis xAxis = mChart.getXAxis();
        xAxis.enableGridDashedLine(10f, 10f, 0f);
        xAxis.setAxisMaximum(10f);
        xAxis.setAxisMinimum(0f);
        xAxis.setDrawLimitLinesBehindData(true);

        LimitLine ll1 = new LimitLine(215f, "Maximum Limit");
        ll1.setLineWidth(4f);
        ll1.enableDashedLine(10f, 10f, 0f);
        ll1.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_TOP);
        ll1.setTextSize(10f);

        LimitLine ll2 = new LimitLine(70f, "Minimum Limit");
        ll2.setLineWidth(4f);
        ll2.enableDashedLine(10f, 10f, 0f);
        ll2.setLabelPosition(LimitLine.LimitLabelPosition.RIGHT_BOTTOM);
        ll2.setTextSize(10f);

        YAxis leftAxis = mChart.getAxisLeft();
        leftAxis.removeAllLimitLines();
        leftAxis.addLimitLine(ll1);
        leftAxis.addLimitLine(ll2);
        leftAxis.setAxisMaximum(350f);
        leftAxis.setAxisMinimum(0f);
        leftAxis.enableGridDashedLine(10f, 10f, 0f);
        leftAxis.setDrawZeroLine(false);
        leftAxis.setDrawLimitLinesBehindData(false);

        mChart.getAxisRight().setEnabled(false);
        setData();
  */
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void setData() {

        ArrayList<Entry> values = new ArrayList<>();

        values.add(new Entry(1, 50));
        values.add(new Entry(2, 100));
        values.add(new Entry(3, 80));
        values.add(new Entry(4, 120));
        values.add(new Entry(5, 110));
        values.add(new Entry(7, 150));
        values.add(new Entry(8, 250));
        values.add(new Entry(9, 190));
        values.add(new Entry(25, 160));
        values.add(new Entry(27, 10));
        values.add(new Entry(28, 50));
        values.add(new Entry(29, 90));
        LineDataSet set1;

        if (mChart.getData() != null &&
                mChart.getData().getDataSetCount() > 0) {
            set1 = (LineDataSet) mChart.getData().getDataSetByIndex(0);
            set1.setValues(values);
            mChart.getData().notifyDataChanged();
            mChart.notifyDataSetChanged();
        } else {
            Log.d("tag", "setData: " + "else part execute");
            set1 = new LineDataSet(values, "Sample Data");
            set1.setDrawIcons(false);
            //set1.enableDashedLine(10f, 5f, 0f);
            // set1.enableDashedHighlightLine(10f, 5f, 0f);
            set1.setColor(getColor(R.color.graph_border_color));
            set1.setCircleColor(Color.DKGRAY);
            set1.setLineWidth(1.25f);
            set1.setCircleRadius(3f);
            set1.setDrawCircleHole(false);
            set1.setValueTextSize(9f);
            set1.setDrawFilled(true);
            //   set1.setFormLineWidth(1f);
            //    set1.setFormLineDashEffect(new DashPathEffect(new float[]{10f, 5f}, 0f));
            //    set1.setFormSize(15.f);

            if (Utils.getSDKInt() >= 18) {
                Drawable drawable = ContextCompat.getDrawable(this,
                        R.drawable.graph_background);
                set1.setFillDrawable(drawable);
            } else {
                set1.setFillColor(Color.DKGRAY);
            }
            ArrayList<ILineDataSet> dataSets = new ArrayList<>();
            dataSets.add(set1);
            LineData data = new LineData(dataSets);
            mChart.setData(data);
        }
    }
}
