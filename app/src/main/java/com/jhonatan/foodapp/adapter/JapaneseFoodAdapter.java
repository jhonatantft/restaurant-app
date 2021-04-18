package com.jhonatan.foodapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jhonatan.foodapp.R;
import com.jhonatan.foodapp.model.JapaneseFood;

import java.util.List;

public class JapaneseFoodAdapter extends RecyclerView.Adapter<JapaneseFoodAdapter.JapaneseFoodViewHolder> {

    Context context;
    List<JapaneseFood> japaneseFoodList;

    public JapaneseFoodAdapter(Context context, List<JapaneseFood> japaneseFoodList) {
        this.context = context;
        this.japaneseFoodList = japaneseFoodList;
    }

    @NonNull
    @Override
    public JapaneseFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        view = LayoutInflater.from(context).inflate(R.layout.japanese_food_row_item, parent, false);

        return new JapaneseFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(JapaneseFoodViewHolder holder, int position) {
        holder.foodImage.setImageResource(japaneseFoodList.get(position).getImageUrl());
        holder.name.setText(japaneseFoodList.get(position).getName());
        holder.price.setText(japaneseFoodList.get(position).getPrice());
        holder.rating.setText(japaneseFoodList.get(position).getRating());
        holder.restaurantDescription.setText(japaneseFoodList.get(position).getRestaurantDescription());
    }

    @Override
    public int getItemCount() {
        return japaneseFoodList.size();
    }

    public static final class JapaneseFoodViewHolder extends RecyclerView.ViewHolder {

        ImageView foodImage;
        TextView price, name, rating, restaurantDescription;

        public JapaneseFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.restaurant_image);
            price = itemView.findViewById(R.id.price);
            name = itemView.findViewById(R.id.name);
            rating = itemView.findViewById(R.id.rating);
            restaurantDescription = itemView.findViewById(R.id.restaurant_description);

        }
    }
}
