package com.example.android.recyclertask;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by win8 on 7/15/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


   private  Context context;
    private List<Movie> movies;
    private DetailsListener listener;
    public RecyclerAdapter(Context context, List<Movie> movies,DetailsListener listener){
        this.context=context;
        this.movies=movies;
        this.listener=listener;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.itemlayout,parent);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.Bind(movies.get(position));
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView image;
        TextView MovieName,MovieRate;
        public ViewHolder(View itemView) {
            super(itemView);
             image=(ImageView) itemView.findViewById(R.id.ImageView);
             MovieName = (TextView) itemView.findViewById(R.id.MovieName);
            MovieRate=(TextView)itemView.findViewById(R.id.MovieRate);
        }

        @Override
        public void onClick(View v) {
            listener.ClickListenr(getLayoutPosition());
        }

        public void Bind(Movie movie){
            image.setImageResource(R.mipmap.ic_launcher);
            MovieName.setText(movie.getName());
            MovieRate.setText(movie.getRate());

        }
    }
}
