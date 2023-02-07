
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        int resultado = sumaValores(10,20,30);
        System.out.println("Resultadoo de la operacion : " + resultado);

        Coche miCoche = new Coche();
        miCoche.agregarPuerta();

        System.out.println("Número de puertas de miCoche : " + miCoche.numPuertas);


    }

    public static int sumaValores(int a, int c, int b){
        return a + b + c;
    }

}

class Coche{
    public int numPuertas = 0;

    public void agregarPuerta(){
        this.numPuertas++;
    }
}