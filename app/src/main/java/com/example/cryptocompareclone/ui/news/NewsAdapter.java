package com.example.cryptocompareclone.ui.news;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptocompareclone.R;
import com.example.cryptocompareclone.models.news.News;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    private List<News> listOfNewsArticles = new ArrayList<>();
    private NewsInterface newsInterface;

    public NewsAdapter(NewsInterface newsInterface) {
        this.newsInterface = newsInterface;
    }

    public interface NewsInterface {
        void goToNewsPage(String newsUrl);
    }

    public void setAdapterData(List<News> listOfNewsArticles) {
        this.listOfNewsArticles = listOfNewsArticles;
        this.notifyDataSetChanged();
    }

    public void clearAdapter() {
        listOfNewsArticles.clear();

    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news, parent, false);

        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, final int position) {

        Picasso.get().load(listOfNewsArticles.get(position).getImageurl())
                .into(holder.imvNewsArticlePoster);
        holder.tvNewsSourceName.setText(listOfNewsArticles.get(position).getSource());
        holder.tvNewsPublishTime.setText(" " + listOfNewsArticles.get(position).getPublishedOn());
        holder.tvNewsTitle.setText(listOfNewsArticles.get(position).getTitle());
        String[] arrayNewsCategories = listOfNewsArticles.get(position).getCategories().split("\\|");
        String categories = "";
        for (String item : arrayNewsCategories) {
            categories += item + "  ";

        }
        holder.tvNewsCategories.setText(categories);
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newsInterface.goToNewsPage(listOfNewsArticles.get(position).getUrl());
            }
        });
    }

    @Override
    public int getItemCount() {
        return listOfNewsArticles.size();
    }

    class NewsViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout parentLayout;
        ImageView imvNewsArticlePoster;
        TextView tvNewsSourceName;
        TextView tvNewsPublishTime;
        TextView tvNewsTitle;
        TextView tvNewsCategories;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            parentLayout = itemView.findViewById(R.id.parent_layout_news);
            imvNewsArticlePoster = itemView.findViewById(R.id.imv_news_article_poster);
            tvNewsSourceName = itemView.findViewById(R.id.tv_news_source);
            tvNewsPublishTime = itemView.findViewById(R.id.tv_news_publishing_time);
            tvNewsTitle = itemView.findViewById(R.id.tv_news_title);
            tvNewsCategories = itemView.findViewById(R.id.tv_news_categories);
        }
    }
}
