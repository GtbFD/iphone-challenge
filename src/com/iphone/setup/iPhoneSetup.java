package com.iphone.setup;

import com.iphone.aplicativos.Chrome;
import com.iphone.aplicativos.Discador;
import com.iphone.aplicativos.Safari;
import com.iphone.aplicativos.iPod;
import com.iphone.interfaces.NavegadorInterface;
import com.iphone.interfaces.ReprodutorMusical;
import com.iphone.interfaces.Telefone;
import com.iphone.produto.iPhone;

public class iPhoneSetup {
    public static void main(String[] args) {
        ReprodutorMusical iPod = new iPod();
        Telefone discador = new Discador();
        NavegadorInterface navegador = new Chrome();

        iPhone iphone = new iPhone("4");
        iphone.setReprodutorMusical(iPod);
        iphone.setTelefone(discador);
        iphone.setNavegador(navegador);

        iphone.ligar();
        iphone.abrirAplicativos();
    }
}
