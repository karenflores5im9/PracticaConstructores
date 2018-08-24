package practicauno;

public class tv {
    
    public tv() {
 
    }
    
    private String marca;
    private int precio;
    private boolean descuento;
    private String color;
    private boolean cable;
    private int size;
    private int year;
    private boolean smart;
    private String tienda;

    public tv(String marca, int size){
        this.marca = marca;
        this.size = size;
    }
    public tv (int precio, boolean descuento){
        this.precio = precio;
        this.descuento = descuento;
    }
    public tv (String color, boolean cable){
        this.color = color;
        this.cable = cable;
    }
    public tv (boolean smart, int year){
        this.year = year;
        this.smart = smart;
    }
    public tv (String tienda){
        this.tienda = tienda;
    }

    
    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }
    
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isCable() {
        return cable;
    }

    public void setCable(boolean cable) {
        this.cable = cable;
    }


    @Override
    public String toString() {
        return "TVs. " + "Marca: " + marca + ". Tamaño: " + size + ". Color: " + color + ". Precio: " + precio + ". Descuento: " + descuento + ". Tienda: " + tienda + ". Cable: " + cable + ". Año: " + year + ". SmartTV: " + smart + ".'";
    }
}
