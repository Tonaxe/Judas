package com.example.judas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Image3Adapter extends RecyclerView.Adapter<Image3Adapter.Image3ViewHolder> {

    private Context mContext;
    private List<Integer> mImages;
    private OnItemClickListener mListener;

    public Image3Adapter(Context context, List<Integer> images, OnItemClickListener listener) {
        mContext = context;
        mImages = images;
        mListener = listener;
    }

    @NonNull
    @Override
    public Image3ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item3_image, parent, false);
        return new Image3ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Image3ViewHolder holder, int position) {
        int imageResource = mImages.get(position);
        holder.image3View.setImageResource(imageResource);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mListener != null) {
                    mListener.onItemClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImages.size();
    }

    public static class Image3ViewHolder extends RecyclerView.ViewHolder {
        ImageView image3View;

        public Image3ViewHolder(@NonNull View itemView) {
            super(itemView);
            image3View = itemView.findViewById(R.id.image3View);
        }
    }

    // Interfaz para manejar clics en los elementos del RecyclerView
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
}


