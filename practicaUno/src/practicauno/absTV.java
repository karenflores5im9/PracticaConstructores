package practicauno;

public abstract class absTV {
    
    public boolean signal(boolean signal){
        System.out.println("Señal: ");
        return signal;
    }
    public boolean encender(boolean encendido){
        System.out.println("¿Enciende?");
        return encendido;
    }
    public String calidadImagen(){
        System.out.println("Calidad: ");
        return "Buena";
    }
    public boolean conexionInternet(boolean conexion){
        System.out.println("Conexión: ");
        return conexion;
    }
    public String audio(String aud){
        System.out.println("Audio:");
        return aud;
    }
}
