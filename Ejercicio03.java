package Semana02;
import java.util.Scanner; 
public class Ejercicio03 {
    static float num1, num2;
    public static void main(String[] args) { 
        float su;
        num1 = leeNumero();
        num2 = leeNumero();
        su=suma();
        System.out.println("La suma es: " + su);
    }
    static float leeNumero (){ 
        Scanner teclado = new Scanner(System.in); 
        float num; 
        System.out.print("Ingrese un número: "); 
        num = Float.parseFloat(teclado.next()); 
        return num;
    }
    static float suma(){
        float suma;
        suma = num1+num2;
        return suma;
    }
}
