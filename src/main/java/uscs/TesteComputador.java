
package uscs;

public class TesteComputador {

    public static void main(String[] args) {
        Teclado t = new Teclado("1232", "Logitech", "Preto");
        Monitor mon = new Monitor("AFB876", "Samsung", "Preto");
        Gabinete g = new Gabinete("4587HHY", "Logitech", "Preto");
        Mouse m = new Mouse("HGY6654", "Microsoft", "Preto");
        Computador cp = new Computador("76TRDE35", t, mon, g, m); 
        cp.ImprimeComputador();
    }
}
