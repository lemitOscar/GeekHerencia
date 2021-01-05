/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import operaciones.Chija_Resta;
import operaciones.Chija_Suma;

/**
 *
 * @author Jesslim
 */
public class ClasePrincipal {

    public static void main(String[] args) {

        Chija_Suma katesum = new Chija_Suma();
        katesum.PedirDatos();
        katesum.Sumar();
        System.out.println("el resultado es:");
        katesum.MostrarRes();
    }
}
