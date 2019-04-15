package entidades;

public class programa {

    public static void main(String[] args) {

        bebida articulo1 = new bebida("Coca", 0.6, 60, 36);
        bebida articulo2 = new bebida ("Fanta", 1.5, 75, 45);
        //articulo1.setStock(20);
        System.out.println(articulo1);
        System.out.println(articulo2);
        //PEDIDO
        System.out.println("Objeto luego del pedido al proeevedor; ");
        articulo1.pedidoAlProveedor(230);
        articulo1.consultarElpedido();

    }
}
