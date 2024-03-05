package com.example.judas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Image2Adapter extends RecyclerView.Adapter<Image2Adapter.ImageViewHolder> {

    private Context mContext;
    private List<Integer> mImages;

    public Image2Adapter(Context context, List<Integer> images) {
        mContext = context;
        mImages = images;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item2_image, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        int imageResource = mImages.get(position);
        holder.imageView.setImageResource(imageResource);
    }

    @Override
    public int getItemCount() {
        return mImages.size();
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
