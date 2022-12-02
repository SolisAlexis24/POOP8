/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author tripl
 */
public class InstrumentoViento implements InstrumentoMusical{
    @Override
    public void tocar(){
        System.out.println("tocando instrumento de viento");
    }
    @Override
    public void afinar(){
        System.out.println("afinando instrumento de viento");
    }
    @Override
    public String tipoInstrumento(){
        return "Instrumento de viento";
    }
}
