package com.example.judas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
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
        chatList.add(new Chat("Frank", "UIKI TENKAI", "12:00 PM", R.drawable.chatuno));
        chatList.add(new Chat("Pan1ta", "tt te paso el SISU a 5€", "01:30 PM", R.drawable.foto1));
        chatList.add(new Chat("Cuñao", "Van 2 y se cae el del medio", "12:56 AM", R.drawable.foto2));
        chatList.add(new Chat("DGD411", "ASOOOOPLA AI AB", "17:32 PM", R.drawable.foto3));
        chatList.add(new Chat("Mi tio", "LITERALMENTE MI PUTO TIO", "10:05 AM", R.drawable.foto4));
        chatList.add(new Chat("Frank", "UIKI TENKAI", "09:45 AM", R.drawable.chattres));
        chatList.add(new Chat("Pan1ta", "tt te paso el SISU a 5€", "03:45 AM", R.drawable.foto1));
        chatList.add(new Chat("Cuñao", "LITERALMENTE MI PUTO TIO", "06:45 AM", R.drawable.foto2));
        chatList.add(new Chat("DGD411", "ASOOOOPLA AI AB", "02:45 AM", R.drawable.foto3));
        chatList.add(new Chat("Mi tio", "ASOOOOPLA AI AB", "16:45 PM", R.drawable.foto4));
        chatList.add(new Chat("Cuñao", "ASOOOOPLA AI AB", "14:45 PM", R.drawable.foto2));
        chatList.add(new Chat("Chat 3", "tt te paso el SISU a 5€", "13:40 PM", R.drawable.foto3));
        chatList.add(new Chat("DGD411", "LITERALMENTE MI PUTO TIO", "13:45 PM", R.drawable.chattres));
        chatList.add(new Chat("Frank", "ASOOOOPLA AI AB", "23:45 PM", R.drawable.foto1));


        chatAdapter = new ChatAdapter(chatList, Navigation.findNavController(requireActivity(), R.id.nav_host_fragment));
        recyclerView.setAdapter(chatAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Obtener referencia al botón
        View recyclerAmigos = view.findViewById(R.id.recyclerAmigos);

        // Configurar el clic del botón para navegar al fragmento LogRegInicioFragment
        recyclerAmigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_amigosFragment_to_conversaFragment);
            }
        });
    }
}
