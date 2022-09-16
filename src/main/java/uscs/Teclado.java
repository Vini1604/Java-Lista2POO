/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uscs;

/**
 *
 * @author vinic
 */
public class Teclado {
    private String numeroSerieTeclado;
    private String fabricante;
    private String cor;

    public String getNumeroSerieTeclado() {
        return numeroSerieTeclado;
    }

    public void setNumeroSerieTeclado(String numeroSerieTeclado) {
        this.numeroSerieTeclado = numeroSerieTeclado;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Teclado() {
    }

    public Teclado(String numeroSerieTeclado, String fabricante, String cor) {
        this.numeroSerieTeclado = numeroSerieTeclado;
        this.fabricante = fabricante;
        this.cor = cor;
    }
    
    public void ImprimeTeclado(){
        System.out.printf("Teclado:\n");
        System.out.printf("Serial Number: %s\n", numeroSerieTeclado);
        System.out.printf("Fabricante: %s\n", fabricante);
        System.out.printf("Cor: %s\n\n", cor);
    }
}
