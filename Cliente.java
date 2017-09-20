import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by royke on 19/09/17.
 */
public class Cliente {

    public static void main(String[] args) throws IOException {

        Socket cliente = new Socket("127.0.0.1",6789);
        System.out.println("O cliente se conectou ao servidor!");

        PrintStream saida = new PrintStream(cliente.getOutputStream());
        Scanner teclado = new Scanner(System.in);
        while (teclado.hasNextLine()) {
            saida.println(teclado.nextLine());
        }
        saida.close();
        teclado.close();
        cliente.close();
    }

}
