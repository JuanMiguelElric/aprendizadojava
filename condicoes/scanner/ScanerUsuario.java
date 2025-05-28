package condicoes.scanner;

import java.util.Scanner;

public class ScanerUsuario {
    public static void main(String[] args) {

        /* aqui eu vou trabalhar com o Scanner é o mesmo utilizado em python*/

        Scanner CaixadeTexto = new Scanner(System.in);

        System.out.printf("Escreva aqui o nome do ninja");
        CaixadeTexto.nextLine();

        CaixadeTexto.close();
        // para armazenar a string eu coloco a caixa de texto dentro de uma variável

    }
}
