package entidades;

public class bebida {

    private String nombre;
    private double litros;
    private double precio;
    private int stock;
    private int pedidoAlProeevedor;

    public bebida(String nombre, double litros, double precio, int stock) {
        this.nombre = nombre;
        this.litros = litros;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "bebida{" + "nombre=" + nombre + ", litros=" + litros + ", precio=" + precio + ", stock=" + stock + ", pedidoAlProeevedor=" + pedidoAlProeevedor + '}';
    }

    

    void pedidoAlProveedor(int parametrosPedidoAlProeevedor) {
        System.out.println("Cantidad a pedir: " + parametrosPedidoAlProeevedor);
        this.pedidoAlProeevedor = parametrosPedidoAlProeevedor;
    }

    void consultarElpedido() {
        System.out.println("El pedido del producto " + nombre + " es: " + pedidoAlProeevedor);
    }

}
