package com.example.android.moviequeryapp;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.moviequeryapp.models.MovieModel;

import java.util.List;

public class SingleViewAdapter extends BaseAdapter {
    private static final String TAG = SingleViewAdapter.class.getSimpleName();
    private Context mContext;
    private List<MovieModel> movieModelList;
    private int resource;
    private LayoutInflater inflater;

    public SingleViewAdapter(Context c, int gridViewId, List<MovieModel> results) {
        mContext = c;
        resource = gridViewId;
        movieModelList = results;
        inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Log.d(TAG, " : PassedBy#Subhojit -> SingleViewAdapter - CONSTRUCTOR CALLED");
    }

    public int getCount() {
        Log.d(TAG, " : PassedBy#Subhojit -> getCount - CALLED");

        return 0;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d(TAG, " : PassedBy#Subhojit -> getView - START");

        View gridView;
        if (convertView == null) {
            gridView = new View(mContext);
            gridView = inflater
                    .inflate(R.layout.custom_single_grid_view, null);

            TextView movieTitle = gridView.findViewById(R.id.gridItem_movieTitle);
            movieTitle.setText(movieModelList.get(position).getTitle());
            //Set image based on selected movie title
            ImageView movieImage = gridView.findViewById(R.id.gridItem_moviePoster);
            movieImage.setImageResource(R.drawable.exorcist);


        } else {
            gridView = convertView;
        }


        return gridView;
    }
        /*ImageView imageView;
        if (convertView == null) {
            Log.d(TAG, " : PassedBy#Subhojit -> getView - IF");

            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            Log.d(TAG, " : PassedBy#Subhojit -> getView - ELSE");
            imageView = (ImageView) convertView;
        }

        //imageView.setImageResource(mThumbIds[position]);
        imageView.setImageResource(R.drawable.exorcist);
        return imageView;*/

   /*private Context mContext;
   // private BackgroundTask_AsyncTask.AsyncResponse asyncResponse;

    private List<MovieModel> movieModelList;
    private int resource;
    private LayoutInflater inflater;



    public SingleViewAdapter(Context context, int resource, List<MovieModel> movieModelList ) {
        this.mContext = context;
        this.resource = resource;
        this.movieModelList = movieModelList;
    }

    @Override
    public int getCount() {
        return movieModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;
        if(convertView == null){
            gridView = new View(mContext);
            gridView = inflater
                    .inflate(R.layout.custom_single_grid_view, null);

            TextView movieTitle = gridView.findViewById(R.id.gridItem_movieTitle);
            movieTitle.setText(movieModelList.get(position).getTitle());
            //Set image based on selected movie title
            ImageView movieImage = gridView.findViewById(R.id.gridItem_moviePoster);
            movieImage.setImageResource(Integer.parseInt(movieModelList.get(position).getPoster_path()));


        }else{
            gridView = convertView;
        }


        return gridView;
    }*/
}
