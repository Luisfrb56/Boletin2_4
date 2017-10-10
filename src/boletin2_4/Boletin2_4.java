
package boletin2_4;

import java.util.Scanner;


public class Boletin2_4 {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float num1,num2,suma,resta,cociente,producto;
        System.out.println("Teclea el primer numero :");
        num1=sc.nextFloat();
        System.out.println("Teclea el segundo numero :");
        num2=sc.nextFloat();
        suma=num1+num2;
        resta=num1-num2;
        cociente=num1/num2;
        producto=num1*num2;
        System.out.println("Suma= "+suma);
        System.out.println("Resta= "+resta);
        System.out.println("Cociente= "+cociente);
        System.out.println("Producto= "+producto);
    }
    
}
