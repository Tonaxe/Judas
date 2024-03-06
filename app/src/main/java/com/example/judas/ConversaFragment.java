package com.example.judas;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ConversaFragment extends Fragment {

    private int originalWidth;
    private int originalHeight;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_conversa, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Obtener referencia a la imagen
        ImageView imageSmall = view.findViewById(R.id.imageSmall);

        // Guardar el tamaño original de la imagen
        originalWidth = imageSmall.getLayoutParams().width;
        originalHeight = imageSmall.getLayoutParams().height;

        // Agregar el listener para detectar el toque largo en la imagen
        imageSmall.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // Cambiar el tamaño de la imagen cuando se presiona
                        ViewGroup.LayoutParams layoutParams = imageSmall.getLayoutParams();
                        layoutParams.width = getResources().getDimensionPixelSize(R.dimen._100pxv);
                        layoutParams.height = getResources().getDimensionPixelSize(R.dimen._80pxv);
                        imageSmall.setLayoutParams(layoutParams);
                        break;
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL:
                        // Restaurar el tamaño original de la imagen cuando se deja de presionar
                        ViewGroup.LayoutParams originalLayoutParams = imageSmall.getLayoutParams();
                        originalLayoutParams.width = originalWidth;
                        originalLayoutParams.height = originalHeight;
                        imageSmall.setLayoutParams(originalLayoutParams);
                        break;
                }
                return true;
            }
        });

        // Obtener referencia a la imagen
        View imageArrowleft = view.findViewById(R.id.imageArrowleft);

        // Configurar el clic de la imagen para navegar al fragmento LogRegInicioFragment
        imageArrowleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener NavController desde el Fragment
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

                // Navegar al fragmento LogRegInicioFragment utilizando la acción definida en nav_graph.xml
                navController.navigate(R.id.action_conversaFragment_to_amigosFragment);
            }
        });
    }
}
