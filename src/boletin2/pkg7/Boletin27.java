/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg7;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Boletin27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nominal, intereseanual, anos;
        System.out.println("Introduce o valor nominal");
        Scanner nominalTeclado = new Scanner(System.in);
        nominal = nominalTeclado.nextFloat();
        System.out.println("Introduce el interese anual");
        Scanner intereseanualTeclado = new Scanner(System.in);
        intereseanual = intereseanualTeclado.nextFloat();
        System.out.println("Introduce os anos");
        Scanner anosTeclado = new Scanner(System.in);
        anos = anosTeclado.nextFloat();
        float t = anos*12;
        float interes = (intereseanual/1200);
        //System.out.println("A renda mensual ten que ser: "+(nominal*(Math.pow(1+interes,t)*interes))/(Math.pow((1+interes),t)-1) );
        double total = (nominal*(Math.pow(1+interes,t)*interes))/(Math.pow((1+interes),t)-1);
        
        System.out.printf("La renta mensual seria %.2f ",total);
               
    }
    
}
