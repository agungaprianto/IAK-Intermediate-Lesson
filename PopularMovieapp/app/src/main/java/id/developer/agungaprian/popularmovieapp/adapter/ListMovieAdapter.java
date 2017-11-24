package id.developer.agungaprian.popularmovieapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.developer.agungaprian.popularmovieapp.R;
import id.developer.agungaprian.popularmovieapp.model.MovieModel;

/**
 * Created by agungaprian on 18/11/17.
 */

public class ListMovieAdapter extends RecyclerView.Adapter<ListMovieAdapter.ViewHolder> {
    Context context;
    MovieModel[] data;

    public void setMovieAdapter(MovieModel[] data){
        this.data = data;
    }

    @Override
    public ListMovieAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(context)
                .inflate(R.layout.poster_movie, parent,false );

        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(ListMovieAdapter.ViewHolder holder, int position) {
        Picasso.with(context)
                .load(data[position].getPosterPath())
                .placeholder(R.drawable.placeholder_image)
                .error(R.drawable.eror_image)
                .into(holder.poster);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //add id to bindView Annotation
        @BindView(R.id.image_poster)
        ImageView poster;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(context, itemView);
        }
    }
}
