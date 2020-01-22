package com.example.cryptocompareclone.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

import com.example.cryptocompareclone.models.news.LatestNewsArticleResponsePage;
import com.example.cryptocompareclone.models.news.NewsSource;
import com.example.cryptocompareclone.network_utils.CryptoCompareApi;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

public class NewsViewModel extends ViewModel {

    private MediatorLiveData<LatestNewsArticleResponsePage> newsArticleResponsePageMediatorLiveData
            = new MediatorLiveData<>();
    private MediatorLiveData<List<NewsSource>> newsSourceMediatorLiveData =new MediatorLiveData<>();

    private  final CryptoCompareApi cryptoCompareApi;
    private final String errorCondition="";
    @Inject
    public NewsViewModel(CryptoCompareApi cryptoCompareApi) {
     this.cryptoCompareApi = cryptoCompareApi;
    }
    public void getNewsResponseInPage(int pageNo){
        final LiveData<LatestNewsArticleResponsePage> source = LiveDataReactiveStreams.fromPublisher(
                cryptoCompareApi.getLatestNewsArticlePage(pageNo)
                        .subscribeOn(Schedulers.io()));
           newsArticleResponsePageMediatorLiveData.addSource(source, new Observer<LatestNewsArticleResponsePage>() {
               @Override
               public void onChanged(LatestNewsArticleResponsePage latestNewsArticleResponsePage) {
                   newsArticleResponsePageMediatorLiveData.setValue(latestNewsArticleResponsePage);
               }
           });

    }

    public void getNewsSourceList(){
        final LiveData<List<NewsSource>> source = LiveDataReactiveStreams.fromPublisher(
                cryptoCompareApi.getNewsSources().subscribeOn(Schedulers.io())
        );
        newsSourceMediatorLiveData.addSource(source, new Observer<List<NewsSource>>() {
            @Override
            public void onChanged(List<NewsSource> newsSources) {
                newsSourceMediatorLiveData.setValue(newsSources);
            }
        });
    }
    public LiveData<LatestNewsArticleResponsePage> observeLatestNews(){
        return newsArticleResponsePageMediatorLiveData;
    }

     public LiveData<List<NewsSource>> observNewsFeeds(){
        return newsSourceMediatorLiveData;
     }
}