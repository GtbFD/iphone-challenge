package com.iphone.aplicativos;

import com.iphone.interfaces.NavegadorInterface;

public abstract class Navegador implements NavegadorInterface {
    private String modelo;
    private String desenvolvedor;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(String desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }
}
