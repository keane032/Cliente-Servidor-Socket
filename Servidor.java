import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by royke on 19/09/17.
 */
public class Servidor {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(6789);

        Socket cliente = serverSocket.accept();

        System.out.println("Nova conexão com o cliente " +
                cliente.getInetAddress().getHostAddress()
        ); // imprime o ip do cliente

        Scanner scanner = new Scanner(cliente.getInputStream());

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
        cliente.close();
        serverSocket.close();
    }

}
