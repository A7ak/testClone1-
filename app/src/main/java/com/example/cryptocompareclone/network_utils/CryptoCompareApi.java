package com.example.cryptocompareclone.network_utils;

import com.example.cryptocompareclone.models.news.LatestNewsArticleResponsePage;
import com.example.cryptocompareclone.models.news.NewsSource;
import com.example.cryptocompareclone.models.watchlist.CurrencyResponsePage;
import com.example.cryptocompareclone.models.watchlist_detail.HourlyData.HourlyDataResponse;
import com.example.cryptocompareclone.models.watchlist_detail.per_minute_data.PerMinuteData;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CryptoCompareApi {
    static final String  BASE_URL = "https://min-api.cryptocompare.com/data/";
    static final String API_KEY_MS ="afef7b074811144d95a8351681d930c254420e7267df1b03f4c371a625906de7";

    @GET("v2/news/?lang=EN&page=pageNo&api_key="+ API_KEY_MS)
    Flowable<LatestNewsArticleResponsePage> getLatestNewsArticlePage(@Query("pageNo") int pageNo);

    @GET("news/feeds")
    Flowable<List<NewsSource>> getNewsSources();

    @GET("top/totalvolfull?limit=20&tsym=USD&api_key="+API_KEY_MS)
    Flowable<CurrencyResponsePage> getCurrency();


    @GET("v2/histohour?fsym={coin}&tsym=USD&limit={hours}")
    Single<HourlyDataResponse> getHourlyData(@Path("coin") String coinName, @Path("hours") int hours);

    @GET("v2/histominute?fsym={coin}&tsym=GBP&limit=60&tryConversion=false")
    Single<PerMinuteData> getDataPerMinute(@Path("coin")String coinName);

}
