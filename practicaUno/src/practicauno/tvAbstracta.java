package practicauno;

public abstract class tvAbstracta {
    public abstract void calidadImagen();
}

class tvs extends absTV {
    void calidadImagen(){
        System.out.print("Calidad de la imagen: ");
    }
    public static void main(String args[]){  
    absTV tel = new tvs();  
    tel.calidadImagen();
    }  
}
