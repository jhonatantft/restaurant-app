package com.jhonatan.foodapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jhonatan.foodapp.DetailsActivity;
import com.jhonatan.foodapp.MainActivity;
import com.jhonatan.foodapp.R;
import com.jhonatan.foodapp.model.DetailsFood;

import java.util.List;

public class DetailsFoodAdapter extends RecyclerView.Adapter<DetailsFoodAdapter.DetailsFoodViewHolder> {

    Context context;
    List<DetailsFood> detailsFoodList;

    public DetailsFoodAdapter(Context context, List<DetailsFood> detailsFoodList) {
        this.context = context;
        this.detailsFoodList = detailsFoodList;
    }

    @NonNull
    @Override
    public DetailsFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        view = LayoutInflater.from(context).inflate(R.layout.details_food_row_item, parent, false);

        return new DetailsFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DetailsFoodViewHolder holder, int position) {
        holder.foodImage.setImageResource(detailsFoodList.get(position).getImageUrl());
        holder.name.setText(detailsFoodList.get(position).getName());
        holder.price.setText(detailsFoodList.get(position).getPrice());
        holder.rating.setText(detailsFoodList.get(position).getRating());
        holder.restaurantDescription.setText(detailsFoodList.get(position).getRestaurantDescription());
    }
    public void imageClick(View view) {
        Intent i = new Intent(context, MainActivity.class);
        context.startActivity(i);
    }

    @Override
    public int getItemCount() {
        return detailsFoodList.size();
    }

    public static final class DetailsFoodViewHolder extends RecyclerView.ViewHolder {

        ImageView foodImage;
        TextView price, name, rating, restaurantDescription;

        public DetailsFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.restaurant_image);
            price = itemView.findViewById(R.id.price);
            name = itemView.findViewById(R.id.name);
            rating = itemView.findViewById(R.id.rating);
            restaurantDescription = itemView.findViewById(R.id.restaurant_description);

        }
    }
}
