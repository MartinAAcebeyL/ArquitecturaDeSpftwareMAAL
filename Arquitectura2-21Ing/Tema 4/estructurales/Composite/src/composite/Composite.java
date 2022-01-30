/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Carlos
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductoSimple ram4gb = new ProductoSimple("Memoria RAM 4GB", 750, "KingStone");
        ProductoSimple ram8gb = new ProductoSimple("Memoria RAM 8GB", 1000, "KingStone");
        ProductoSimple estabilizador = new ProductoSimple("Estabilizador", 750, "ikawa");

        ProductoSimple disk500gb = new ProductoSimple("Disco Duro 500GB", 1500, "ACME");
        ProductoSimple disk1tb = new ProductoSimple("Disco Duro 1TB", 2000, "ACME");

        ProductoSimple cpuAMD = new ProductoSimple("AMD phenon", 4000, "AMD");
        ProductoSimple cpuIntel = new ProductoSimple("Intel i7", 4500, "Intel");

        ProductoSimple smallCabinete = new ProductoSimple("Gabinete Pequeño", 2000, "ExCom");
        ProductoSimple bigCabinete = new ProductoSimple("Gabinete Grande", 2200, "ExCom");

        ProductoSimple monitor20inch = new ProductoSimple("Monitor 20'", 1500, "HP");
        ProductoSimple monitor30inch = new ProductoSimple("Monitor 30'", 2000, "HP");

        ProductoSimple simpleMouse = new ProductoSimple("Raton Simple", 150, "Genius");
        ProductoSimple gammerMouse = new ProductoSimple("Raton Gammer", 750, "Alien");

//Computadora para Gammer que incluye 8gb de ram,disco de 1tb, procesador Intel i7
//gabinete grande,monitor de 30' y un mouse gammer.
        ProductoCompuesto gammerPC = new ProductoCompuesto("Gammer PC");
        gammerPC.addProducto(ram8gb);
        gammerPC.addProducto(disk1tb);
        gammerPC.addProducto(cpuIntel);
        gammerPC.addProducto(bigCabinete);
        gammerPC.addProducto(monitor30inch);
        gammerPC.addProducto(gammerMouse);

//Computadora para Casa que incluye 4gb de ram,disco de 500gb, procesador AMD Phenon
//gabinete chico,monitor de 20' y un mouse simple.
        ProductoCompuesto homePC = new ProductoCompuesto("Casa PC");
        homePC.addProducto(ram4gb);//
        homePC.addProducto(disk500gb);
        homePC.addProducto(cpuAMD);
        homePC.addProducto(smallCabinete);
        homePC.addProducto(monitor20inch);
        homePC.addProducto(simpleMouse);

//Paque compuesto de dos paquetes, El paquete Gammer PC y Home PC
        ProductoCompuesto pc2x1 = new ProductoCompuesto("Paquete PC Gammer + Casa");
        pc2x1.addProducto(gammerPC);
        pc2x1.addProducto(homePC);
        pc2x1.addProducto(estabilizador);
        

        Venta gammerOrder = new Venta(1, "Juan Perez");
        gammerOrder.addProducto(gammerPC);
        gammerOrder.imprimirVenta();

        Venta homeOrder = new Venta(2, "Marcos Guerra");
        homeOrder.addProducto(homePC);
        homeOrder.imprimirVenta();

        Venta comboOrder = new Venta(3, "Paquete 2x1 en PC");
        comboOrder.addProducto(pc2x1);
        comboOrder.imprimirVenta();

        Venta customOrder = new Venta(4, "Oscar Blancarte");
        customOrder.addProducto(homePC);
        customOrder.addProducto(ram8gb);
        customOrder.addProducto(ram4gb);
        customOrder.addProducto(monitor30inch);
        customOrder.addProducto(gammerMouse);
        customOrder.imprimirVenta();
    }
    
}
