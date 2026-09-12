package eva01_7_arreglos_size;

public class EVA01_7_ARREGLOS_SIZE {

    public static void main(String[] args) {
    int[] original = new int[10];

    for (int i = 0; i < original.length; i++) { //LLENAR CON DATOS ALEATORIOS
        original[i] = (int)(Math.random()*100);
    }

    for (int i = 0; i < original.length; i++) { //IMPRIMIR
        System.out.println("[" + original[i] + "]");
    }

    int[] copia = original;
    original = new int[5];
    System.out.println(original);

    for (int i = 0; i < original.length; i++) { //IMPRIMIR EL ARREGLO MODIFICADO
        System.out.println("[" + original[i] + "]");
    }

}
}