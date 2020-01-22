package com.example.cryptocompareclone.ui.watchlist;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

import com.example.cryptocompareclone.models.news.NewsSource;
import com.example.cryptocompareclone.models.watchlist.CurrencyResponsePage;
import com.example.cryptocompareclone.network_utils.CryptoCompareApi;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.schedulers.Schedulers;

public class WatchlistViewModel extends ViewModel {

    private  final CryptoCompareApi cryptoCompareApi;
    private final MediatorLiveData<CurrencyResponsePage> currencyResponseMLiveData= new MediatorLiveData<>();
    @Inject
    public WatchlistViewModel(CryptoCompareApi cryptoCompareApi) {
        this.cryptoCompareApi = cryptoCompareApi;
        Log.d("iam","watchlistViewModel Is working...");
    }

    public void getCurrencyResponse()
    {
        final LiveData<CurrencyResponsePage> source = LiveDataReactiveStreams.fromPublisher(
                cryptoCompareApi.getCurrency().subscribeOn(Schedulers.io())
        );
        currencyResponseMLiveData.addSource(source, new Observer<CurrencyResponsePage>() {
            @Override
            public void onChanged(CurrencyResponsePage currencyResponsePage) {
                currencyResponseMLiveData.setValue(currencyResponsePage);
                Log.d("iam","observable "+currencyResponsePage.getType());
            }
        });
    }
    public LiveData<CurrencyResponsePage> observeCurrencyResponse(){
        return currencyResponseMLiveData;
    }
}