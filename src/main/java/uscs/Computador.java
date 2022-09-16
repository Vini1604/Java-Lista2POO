/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uscs;

/**
 *
 * @author vinic
 */
public class Computador {
    private String numeroSerieComputador;
    private Teclado teclado;
    private Monitor monitor;
    private Gabinete gabinete;
    private Mouse mouse;

    public String getNumeroSerieComputador() {
        return numeroSerieComputador;
    }

    public void setNumeroSerieComputador(String numeroSerieComputador) {
        this.numeroSerieComputador = numeroSerieComputador;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Gabinete getGabinete() {
        return gabinete;
    }

    public void setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Computador() {
    }

    public Computador(String numeroSerieComputador, Teclado teclado, Monitor monitor, Gabinete gabinete, Mouse mouse) {
        this.numeroSerieComputador = numeroSerieComputador;
        this.teclado = teclado;
        this.monitor = monitor;
        this.gabinete = gabinete;
        this.mouse = mouse;
    }

    
    public void ImprimeComputador(){
        System.out.printf("Computador:\n");
        System.out.printf("Serial Number: %s\n\n", numeroSerieComputador);
        teclado.ImprimeTeclado();
        monitor.ImprimeMonitor();
        gabinete.ImprimeGabinete();
        mouse.ImprimeMouse();
    }
}
