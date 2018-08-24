package practicauno;

public class PracticaUno {

    public static void main(String[] args) {
        
        tv telUno = new tv ();
        telUno.setMarca("LG");
        telUno.setSize(50);
        tv telDos = new tv(15000, true);
        tv telTres = new tv("Negro", true);
        tv telCuatro = new tv(true, 2018);
        tv telCinco = new tv("Liverpool");
        
        System.out.println("TELEVISIONES: "); 
        System.out.println(telUno);
        System.out.println(telDos);
        System.out.println(telTres);
        System.out.println(telCuatro);
        System.out.println(telCinco);

    }
}
