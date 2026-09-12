package eva01_8_arraysobjects;

public class EVA01_8_ARRAYSOBJECTS {

    public static void main(String[] args) {
         Ejemplo[] arreglo = null;
        arreglo = new Ejemplo[2];
        System.out.println("Arreglo = "+ arreglo);
        System.out.println("Arreglo[0] = "+ arreglo[0]);
        System.out.println("Arreglo[1] = "+ arreglo[1]);
        arreglo[0] = new Ejemplo();
        arreglo[1] = new Ejemplo();
        System.out.println("Arreglo[0] = " + arreglo[0]);
        System.out.println("Arreglo[1] = " + arreglo[1]);
        
    }
    }
class Ejemplo{
        int i = 5;
}
