package Semana02;
/**
* importar libreria de teclado
*/
import java.util.Scanner; 
/**
 * Esta clase contiene un programa para sumar dos números ingresados por el usuario.
 */
public class Ejercicio01 { 
    
    static float num1, num2; // Variables globales para almacenar los números ingresados
    
     /**
     * El método principal que inicia la ejecución del programa.
     * 
     * @param args Argumentos de línea de comandos (no utilizado en este programa)
     */
    
    public static void main(String[] args) { //método main
        // Lee dos números ingresados por el usuario
        num1 = leeNumero();
        num2 = leeNumero();
        // Realiza la suma de los números ingresados
        suma();
    }
    
    /**
     * Lee un número ingresado por el usuario desde la entrada estándar.
     * 
     * @return El número ingresado por el usuario.
     */
    
    static float leeNumero (){ 
        Scanner teclado = new Scanner(System.in); //llamar libreria de teclado
        float num; // definiendo variable num
        System.out.print("Ingrese un número: "); // imprime la descripción de la entrada
        num = Float.parseFloat(teclado.next()); // toma la entrada del usuario como texto, la convierte en un número float y luego la asigna a la variable num
        return num; // muestra la variable num 
    }
    
    /**
     * Realiza la suma de los dos números ingresados y muestra el resultado.
     */
    
    static void suma(){
        float suma; // definiendo variable suma
        suma = num1+num2; // suma las variables
        System.out.println("La suma es: " + suma); // imprime el resultrado
    }
}
