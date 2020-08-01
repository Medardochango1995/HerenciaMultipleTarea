/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorotto;
// Autor: Medardo Rene Chango Caguana

interface MotorDOHC {
public default void Cilindrada() {
System.out.println("Motor 3.0 DISTRIBUCION DOHC");
   }
}
interface MotorOHV {

    public default void Cilindrada() {
System.out.println("Motor 1.6 DISTRIBUCION OHV");
   }
}
public class MotorOtto implements MotorDOHC,MotorOHV {
/*@Override
public void Cilindrada() {
//se puede elegir la implementación de una interfaz
//por ejemplo, escogemos que sea motorDOHC
MotorDOHC.super.Cilindrada();
}*/
@Override

public void Cilindrada() {
//se puede elegir la implementación de una interfaz
//por ejemplo, escogemos que sea VehiculoGasolina
MotorOHV.super.Cilindrada();
}
public static void main(String[] args) {
    System.out.println("  ***UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE*** ");
    System.out.println("             ***PROGRAMACION*** ");
    System.out.println("\033[34m-Autor: Medardo Chango");
    System.out.println("****************************************************");
    System.out.println("\033[31mHERENCIA MULTIPLE"); 
    System.out.println("");
MotorOtto motor = new MotorOtto();
motor.Cilindrada();
}
}

