/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uscs;

/**
 *
 * @author vinic
 */
public class Gabinete {
    private String numeroSerieGabinete;
    private String fabricante;
    private String cor;

    public String getNumeroSerieGabinete() {
        return numeroSerieGabinete;
    }

    public void setNumeroSerieGabinete(String numeroSerieGabinete) {
        this.numeroSerieGabinete = numeroSerieGabinete;
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

    public Gabinete() {
    }

    public Gabinete(String numeroSerieGabinete, String fabricante, String cor) {
        this.numeroSerieGabinete = numeroSerieGabinete;
        this.fabricante = fabricante;
        this.cor = cor;
    }
    
    public void ImprimeGabinete(){
        System.out.printf("Gabinete:\n");
        System.out.printf("Serial Number: %s\n", numeroSerieGabinete);
        System.out.printf("Fabricante: %s\n", fabricante);
        System.out.printf("Cor: %s\n\n", cor);
    }
}
