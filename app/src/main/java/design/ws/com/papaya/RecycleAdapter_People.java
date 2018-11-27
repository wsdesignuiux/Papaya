package design.ws.com.papaya;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


/**
 * Created by Rp on 6/14/2016.
 */
public class RecycleAdapter_People extends RecyclerView.Adapter<RecycleAdapter_People.MyViewHolder> {
    Context context;

    boolean showingFirst = true;

    private List<BeanClassForPeople> moviesList;


    ImageView NormalImageView;
    Bitmap ImageBit;
    float ImageRadius = 40.0f;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title;


        public MyViewHolder(View view) {
            super(view);


            title = (TextView) view.findViewById(R.id.title);

        }

    }


    public RecycleAdapter_People(MainActivity mainActivityContacts, List<BeanClassForPeople> moviesList) {
        this.moviesList = moviesList;
        this.context = mainActivityContacts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_people_list, parent, false);


        return new MyViewHolder(itemView);


    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        BeanClassForPeople movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());


    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }


}


