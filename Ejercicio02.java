package Semana02;
import java.util.Scanner; 
public class Ejercicio02 {

    public static void main(String[] args) { 
        float num1, num2;
        num1 = leeNumero();
        num2 = leeNumero();
        suma(num1, num2);
    }
    static float leeNumero (){ 
        Scanner teclado = new Scanner(System.in); 
        float num; 
        System.out.print("Ingrese un número: "); 
        num = Float.parseFloat(teclado.next()); 
        return num;
    }
    static void suma(float num1, float num2){
        float suma; 
        suma = num1+num2;
        System.out.println("La suma es: " + suma);
    }
}
