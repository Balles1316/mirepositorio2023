
// Cliente TCP
import java.net.*;
import java.io.*;

public class clienteTCP {
    public static void main(String[] args) throws Exception {
        Socket clientSocket = new Socket("localhost", 6789);
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

        outToServer.writeBytes("Hola, servidor TCP\n");

        clientSocket.close();
    }
}