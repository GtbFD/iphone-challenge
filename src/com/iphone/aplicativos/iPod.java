package com.iphone.aplicativos;

import com.iphone.interfaces.ReprodutorMusical;

public class iPod implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando música por meio do iPod");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música por meio do iPod");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no app do iPod");
    }
}
