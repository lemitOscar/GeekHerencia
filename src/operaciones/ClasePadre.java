package operaciones;

import java.util.Scanner;

public class ClasePadre {

    protected int valor1, valor2, res;
    Scanner read = new Scanner(System.in);

    public void PedirDatos() {
        System.out.println("ingresa un numero: ");
        valor1 = read.nextInt();
        System.out.println("segundo valor: ");
        valor2 = read.nextInt();
    }

    //muestra resultado
    public void MostrarRes() {
        System.out.println(res);
    }

}
