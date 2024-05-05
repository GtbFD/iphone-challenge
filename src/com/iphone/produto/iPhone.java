package com.iphone.produto;

import com.iphone.aplicativos.Discador;
import com.iphone.interfaces.NavegadorInterface;
import com.iphone.interfaces.ReprodutorMusical;
import com.iphone.interfaces.Telefone;

public class iPhone {
    private String modelo;
    private ReprodutorMusical reprodutorMusical;
    private Telefone telefone;
    private NavegadorInterface navegador;

    public iPhone(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public NavegadorInterface getNavegador() {
        return navegador;
    }

    public void setNavegador(NavegadorInterface navegador) {
        this.navegador = navegador;
    }

    public void ligar(){
        System.out.println("Ligando iPhone " + getModelo());
    }

    public void desligar(){
        System.out.println("Desligando iPhone " + getModelo());
    }

    public void abrirAplicativos(){
        reprodutorMusical.tocar();
        telefone.ligar();
        navegador.exibirPagina();
    }
}
