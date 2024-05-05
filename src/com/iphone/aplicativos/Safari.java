package com.iphone.aplicativos;

public class Safari extends Navegador{
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página através do Safari");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador Safari");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador Safari");
    }
}
