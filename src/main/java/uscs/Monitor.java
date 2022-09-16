/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uscs;

/**
 *
 * @author vinic
 */
public class Monitor {
    private String numeroSerieMonitor;
    private String fabricante;
    private String cor;

    public String getNumeroSerieMonitor() {
        return numeroSerieMonitor;
    }

    public void setNumeroSerieMonitor(String numeroSerieMonitor) {
        this.numeroSerieMonitor = numeroSerieMonitor;
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

    public Monitor() {
    }

    public Monitor(String numeroSerieMonitor, String fabricante, String cor) {
        this.numeroSerieMonitor = numeroSerieMonitor;
        this.fabricante = fabricante;
        this.cor = cor;
    }
    
    public void ImprimeMonitor(){
        System.out.printf("Monitor:\n");
        System.out.printf("Serial Number: %s\n", numeroSerieMonitor);
        System.out.printf("Fabricante: %s\n", fabricante);
        System.out.printf("Cor: %s\n\n", cor);
    }
}
