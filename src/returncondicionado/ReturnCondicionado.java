/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returncondicionado;

/**
 *
 * @author Walter Galdamez
 */
public class ReturnCondicionado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int resultado = sumar(0,0);
        System.out.println("El resultado es: "+ resultado );

        }
        //el metodo puede devolver 0 o puede devolver la suma de a + b
        //Este es un metodo con return condicionado de esta forma el compilador no dara error
        public static int sumar(int a, int b){
            if(a==0 && b==0){
                System.out.println("ingrese numeros distintos de 0");
                return 0;
            }
            return a+b;
        }
}
