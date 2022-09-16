/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uscs;

/**
 *
 * @author vinic
 */
public class Mouse {
    private String numeroSerieMouse;
    private String fabricante;
    private String cor;

    public String getNumeroSerieMouse() {
        return numeroSerieMouse;
    }

    public void setNumeroSerieMouse(String numeroSerieMouse) {
        this.numeroSerieMouse = numeroSerieMouse;
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

    public Mouse() {
    }

    public Mouse(String numeroSerieMouse, String fabricante, String cor) {
        this.numeroSerieMouse = numeroSerieMouse;
        this.fabricante = fabricante;
        this.cor = cor;
    }
    
    public void ImprimeMouse(){
        System.out.printf("Mouse:\n");
        System.out.printf("Serial Number: %s\n", numeroSerieMouse);
        System.out.printf("Fabricante: %s\n", fabricante);
        System.out.printf("Cor: %s\n\n", cor);
    }
}
