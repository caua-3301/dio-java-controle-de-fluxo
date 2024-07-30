package model.entities;

import model.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void iniciarContador() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro numero");
        int numero1 = sc.nextInt();
        System.out.println("Informe o segundo numero");
        int numero2 = sc.nextInt();

        try {
            System.out.println(contar(numero1, numero2));
        } catch (ParametrosInvalidosException err) {
            System.out.println(err.getMessage());
        }
    }

   private static int contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException("O primeiro numero nao pode ser maior que o segundo");
        }
        return numero2 - numero1;
   }
}
