package Factorial;

import java.util.Scanner;
import java.math.BigInteger;
public class Recursivo {
    Long tiempoInicio = System.nanoTime();
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un número para saber su factorial recursivo: ");
    int n = sc.nextInt();
    long tiempoInicio = System.nanoTime();
    System.out.println("El factorial recursivo de " + n + " es: " + factorialRecursivo(n));
    long tiempoFinal = System.nanoTime();
    long tiempoTotal = tiempoFinal - tiempoInicio;
    System.out.println("Tiempo de ejecución: " + (tiempoTotal/1000000000.0) + " segundos");
    }

    public static BigInteger factorialRecursivo(int n){
    if(n == 0 || n == 1){
        return BigInteger.ONE;
    }else{
        return BigInteger.valueOf(n).multiply(factorialRecursivo(n-1));
    }

    }     
}
