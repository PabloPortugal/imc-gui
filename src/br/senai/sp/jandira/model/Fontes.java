package br.senai.sp.jandira.model;

import java.awt.*;

public class Fontes {

     public Font criaFonteParaTitulo(){
         Font CriarfonteTitulo = new Font("Segoe UI", Font.BOLD, 20);
         return CriarfonteTitulo;
     }

     public Font criarFonteSubtitulo(){
         Font myFontResultado = new Font("Segoi UI", Font.ITALIC, 20);
         return myFontResultado;
     }
}
