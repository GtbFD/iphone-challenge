package com.iphone.aplicativos;

import com.iphone.interfaces.Telefone;

public class Discador implements Telefone {
    @Override
    public void ligar() {
        System.out.println("Ligando para um contato...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação recebida...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo mensagens deixadas por ligações não atendidas no correio de voz.");
    }
}
