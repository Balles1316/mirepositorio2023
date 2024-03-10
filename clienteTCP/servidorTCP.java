// Servidor TCP
import java.net.*;
import java.io.*;

public class servidorTCP {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(6789);
        Socket clientSocket = serverSocket.accept();

        BufferedReader inFromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String message = inFromClient.readLine();
        System.out.println("Mensaje recibido: " + message);

        serverSocket.close();
    }
}