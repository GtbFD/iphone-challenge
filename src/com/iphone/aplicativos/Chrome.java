package com.iphone.aplicativos;

public class Chrome extends Navegador{
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página através do Chrome");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador Chrome");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador Chrome");
    }
}
