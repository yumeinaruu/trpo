package task8.serverAlphaVersion;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static final int PORT = 4045;
    private ArrayList<ClientHandler> clients = new ArrayList<>();

    public Server() throws IOException {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server started! ");
            Socket clientSocket = null;
        try {
            while (true){
                clientSocket = serverSocket.accept();
                ClientHandler client = new ClientHandler(clientSocket, this);
                clients.add(client);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            clientSocket.close();
            serverSocket.close();
        }
    }

    public void sendMessageToAllClients(String message){
        for(ClientHandler entry : clients){
            entry.sendMessage(message);
        }
    }

    public void removeClient(ClientHandler clientHandler){
        clients.remove(clientHandler);
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server();
    }
}
