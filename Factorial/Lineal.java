package Factorial;

import java.util.Scanner;
import java.math.BigInteger;
public class Lineal {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un número para saber su factorial lineal: ");
    int n = sc.nextInt();
    long tiempoInicio = System.nanoTime();
    System.out.println("El factorial lineal de " + n + " es: " + factorialLineal(n));
    long tiempoFinal = System.nanoTime();
    long tiempoTotal = tiempoFinal - tiempoInicio;
    System.out.println("Tiempo de ejecución: " + (tiempoTotal/1000000000.0) + " segundos");
    }

public static BigInteger factorialLineal(int n){
    if(n < 0){
        System.out.println("Número inválido");
        return null;
    }
        BigInteger factLineal = BigInteger.ONE;
    for(int i=1; i<=n; i++){
        factLineal = factLineal.multiply(BigInteger.valueOf(i));
    }
    return factLineal;
    
}
}
