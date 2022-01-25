import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author martin1
 */
public class Fachada {

    private List<Individual> individuales = new ArrayList<Individual>();
    private List<Combos> combos = new ArrayList<Combos>();
    private Venta venta = null;
    Scanner input = new Scanner(System.in);
    
    public void agregarIndividual(int opcion, double precio) {
        Individual individual = null;
        
        switch (opcion) {
            case 1:
                individual = new Individual("Pipocas Pequeñas", precio);
                break;
            case 2:
                individual = new Individual("Pipocas Medianas", precio);
                break;
            case 3:
                individual = new Individual("Pipocas Grandes", precio);
                break;
            case 4:
                individual = new Individual("Soda Pequeña", precio);
                break;
            case 5:
                individual = new Individual("Soda Mediana", precio);
                break;
            case 6:
                individual = new Individual("Soda Grande", precio);
                break;
        }
        individuales.add(individual);
    }
    
    public void agregarCombo(String nombre, int pipoca, int cantPipoca, int soda, int cantSoda, double descuento) {
        Combos combo = new Combos(nombre, descuento);
        if (pipoca != 0) {
            for (int i = 0; i < cantPipoca; i++) {
                System.out.println(individuales.get(pipoca - 1).nombre);
                combo.agregar_producto(individuales.get(pipoca - 1));
            }
        }
        if (soda != 0) {
            for (int i = 0; i < cantSoda; i++) {
                System.out.println(individuales.get(soda - 1).nombre);
                combo.agregar_producto(individuales.get(soda - 1));
            }
        }
        if (pipoca != 0 || soda != 0) {
            combos.add(combo);
        }
    }
    
    public void consultarIndividual() {
        int i = 1;
        for (Individual individual : individuales) {
            System.out.println(i + " Nombre: " + individual.getNombre() + " precio: " + individual.precio);
            i++;
        }
    }
    
    public void mostrarPipocas() {
        int i = 1;
        for (Individual individual : individuales) {
            if (individual.getNombre().equals("Pipocas Pequeñas") || individual.getNombre().equals("Pipocas Medianas") || individual.getNombre().equals("Pipocas Grandes")) {
                System.out.println(i + ": " + individual.getNombre());
            }
            i++;
        }
    }
    
    public void mostrarSoda() {
        int i = 1;
        for (Individual individual : individuales) {
            if (individual.getNombre().equals("Soda Pequeña") || individual.getNombre().equals("Soda Mediana") || individual.getNombre().equals("Soda Grande")) {
                System.out.println(i + ": " + individual.getNombre());
            }
            i++;
        }
    }
    
    public void consultarCombo() {
        System.out.println("Productos de Combo:");
        NumberFormat formater = new DecimalFormat("###,##0.00");
        int i = 1;
        for (Object prod : combos) {
            Abstractos p = (Abstractos) prod;
            System.out.println(i + " " + p.getNombre() + " " + formater.format(p.getPrecio()));
            i++;
        }
    }
    
    public void vender() {
        boolean salir = true;
        do {
            int i = 1;
            System.out.println("Productors Simples:");
            consultarIndividual();
            consultarCombo();
            System.out.println("Producto simple a comprar [0: ninguno]:");
            int ind = input.nextInt();
            System.out.println("Producto combo a comprar [0: ninguno]:");
            int com = input.nextInt();
            venta = new Venta(4, "Venta" + String.valueOf(i));
            if(ind != 0){
                venta.addProducto(individuales.get(ind-1));
            }
            if(com != 0){
                venta.addProducto(combos.get(com-1));
            }
            System.out.println("Quiere seguir comprando: [N/S]");
            char sal = input.next().charAt(0);
            if (sal == 'S') {
                salir = false;
            }
        } while (salir);
        
    }
}