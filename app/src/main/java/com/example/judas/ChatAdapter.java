package com.example.judas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder> {
    private List<Chat> chatList;
    private NavController navController;

    public ChatAdapter(List<Chat> chatList, NavController navController) {
        this.chatList = chatList;
        this.navController = navController;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_chat, parent, false);
        return new ChatViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
        Chat chat = chatList.get(position);
        holder.txtName.setText(chat.getName());
        holder.txtLastMessage.setText(chat.getLastMessage());
        holder.txtTime.setText(chat.getTime());
        holder.imgChat.setImageResource(chat.getImageResource());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navegar al fragmento deseado cuando se hace clic en un elemento del RecyclerView
                navController.navigate(R.id.action_amigosFragment_to_conversaFragment);
            }
        });
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    public static class ChatViewHolder extends RecyclerView.ViewHolder {
        public TextView txtName, txtLastMessage, txtTime;
        public ImageView imgChat;

        public ChatViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtChatName);
            txtLastMessage = itemView.findViewById(R.id.txtLastMessage);
            txtTime = itemView.findViewById(R.id.txtTime);
            imgChat = itemView.findViewById(R.id.imgChat);
        }
    }
}

