/*1. Escribir un método que pida dos números enteros por teclado y calcule la suma de los dos
mostrando por consola la suma de los mismos.
2. Escribir un método que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
3. Escribir un método que pida una frase y la muestre toda en mayúsculas y después toda en
minúsculas. Nota: investigar los métodos toUpperCase() y toLowerCase() de la clase String.
4. Escribir un método que dada una cantidad de grados centígrados se debe mostrar su equivalente
en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
5. Escribir un método que lea un número entero por teclado y muestre por pantalla el doble, el
triple y la raíz cuadrada de ese número. Nota: investigar el método Math.sqrt().*/
package repasoa;

import java.util.Scanner;

public class GuíaA {

    /*1. Escribir un método que pida dos números enteros por teclado y calcule la suma de los dos
mostrando por consola la suma de los mismos.*/

    public static void sumaNumeros() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su primer número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese su segundo número");
        int num2 = leer.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma de sus números es: " + suma);
    }

    /*2. Escribir un método que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.*/
    public static void escribirNombre() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Tu nombre (por favor) :");
        String nombre = leer.nextLine();
        System.out.println("Perfecto, tu nombre afirmativamente es: " + nombre);
    }

    /*3. Escribir un método que pida una frase y la muestre toda en mayúsculas y después toda en
minúsculas. Nota: investigar los métodos toUpperCase() y toLowerCase() de la clase String.*/
    public static void fraseMayMin() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Su frase por favor:");
        String frase=leer.nextLine();
        System.out.println("Su frase en mayúsculas es: "+frase.toUpperCase());
        System.out.println("Su frase es minúsculas es: "+frase.toLowerCase());
    }

    /*4. Escribir un método que dada una cantidad de grados centígrados se debe mostrar su equivalente
en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
    
    public static int conversorTemp(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Cúantos grados hacen (centígrados)");
        int C=leer.nextInt();
        int F;
        return F=32 + (9 * C / 5);
    }
    
    /*5. Escribir un método que lea un número entero por teclado y muestre por pantalla el doble, el
triple y la raíz cuadrada de ese número. Nota: investigar el método Math.sqrt().*/
    
    public static void calculator (){
        Scanner leer=new Scanner(System.in);
        System.out.println("Contame, qué número querés que modifiquemos:");
        int num=leer.nextInt();
        int numDoble=num*2;
        int numTriple=num*3;
        double numRaiz=Math.sqrt(num);
        System.out.println("El doble de su número es: "+numDoble);
        System.out.println("Su triple es: "+numTriple);
        System.out.println("Y por último, su raíz cuadrada es: "+numRaiz);
    }
    
}
