
package eva01_4_objetos;

public class EVA01_4_OBJETOS {
  
    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        System.out.println(prueba);
        //ELIMINAR PRUEBA
        //TERMINAR EL PROGRAMA ---> GARBAGE COLLECTOR (LIBERA MEMORIA AUTOMATICAMENTE)
        //ELIMINA "DISCRETAMENTE" EL OBJETO;
        prueba = null;
    }
}
    class Prueba{
        
}
