package com.example.judas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AmigosFragment extends Fragment {
    private RecyclerView recyclerView;
    private ChatAdapter chatAdapter;
    private List<Chat> chatList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_amigos, container, false);

        recyclerView = view.findViewById(R.id.recyclerAmigos);
        chatList = new ArrayList<>();

        // Agregar chats de ejemplo con imágenes correspondientes
        chatList.add(new Chat("Chat 1", "Último mensaje de Chat 1", "12:00 PM", R.drawable.chatuno));
        chatList.add(new Chat("Chat 2", "Último mensaje de Chat 2", "1:30 PM", R.drawable.chatdos));
        chatList.add(new Chat("Chat 3", "Último mensaje de Chat 3", "3:45 PM", R.drawable.chattres));
        chatList.add(new Chat("Chat 3", "Último mensaje de Chat 3", "3:45 PM", R.drawable.chattres));
        chatList.add(new Chat("Chat 3", "Último mensaje de Chat 3", "3:45 PM", R.drawable.chattres));
        chatList.add(new Chat("Chat 3", "Último mensaje de Chat 3", "3:45 PM", R.drawable.chattres));
        chatList.add(new Chat("Chat 3", "Último mensaje de Chat 3", "3:45 PM", R.drawable.chattres));
        chatList.add(new Chat("Chat 3", "Último mensaje de Chat 3", "3:45 PM", R.drawable.chattres));
        chatList.add(new Chat("Chat 3", "Último mensaje de Chat 3", "3:45 PM", R.drawable.chattres));
        chatList.add(new Chat("Chat 3", "Último mensaje de Chat 3", "3:45 PM", R.drawable.chattres));
        chatList.add(new Chat("Chat 3", "Último mensaje de Chat 3", "3:45 PM", R.drawable.chattres));
        chatList.add(new Chat("Chat 3", "Último mensaje de Chat 3", "3:45 PM", R.drawable.chattres));
        chatList.add(new Chat("Chat 3", "Último mensaje de Chat 3", "3:45 PM", R.drawable.chattres));
        chatList.add(new Chat("Chat 3", "Último mensaje de Chat 3", "3:45 PM", R.drawable.chattres));
        chatList.add(new Chat("Chat 3", "Último mensaje de Chat 3", "3:45 PM", R.drawable.chattres));

        chatAdapter = new ChatAdapter(chatList);
        recyclerView.setAdapter(chatAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }
}
