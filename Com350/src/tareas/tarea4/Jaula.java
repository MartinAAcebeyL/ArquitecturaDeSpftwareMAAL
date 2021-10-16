package tareas.tarea4;

public class Jaula {
    private Animal animal;
    private Float alto;
    private Float ancho;
    private Float largo;

    public Jaula(Animal animal, Float alto, Float ancho, Float largo) {
        this.animal = animal;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Float getAlto() {
        return alto;
    }

    public void setAlto(Float alto) {
        this.alto = alto;
    }

    public Float getAncho() {
        return ancho;
    }

    public void setAncho(Float ancho) {
        this.ancho = ancho;
    }

    public Float getLargo() {
        return largo;
    }

    public void setLargo(Float largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Jaula{" + "animal=" + animal.toString() + ", alto=" + alto + ", ancho=" + ancho + ", largo=" + largo + '}';
    }   
}