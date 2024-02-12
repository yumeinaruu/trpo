package task8.serverAlphaVersion;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler implements Runnable{
    private Server server;
    private Socket socket = null;
    private PrintWriter printWriter;
    private Scanner scanner;
    private static int clientCount = 0;

    public ClientHandler(Socket socket, Server server) {
        try{
            clientCount++;
            this.server=server;
            this.socket = socket;
            this.scanner = new Scanner(socket.getInputStream());
            this.printWriter = new PrintWriter(socket.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void closeConnection(){
        server.removeClient(this);
        clientCount--;
        server.sendMessageToAllClients(clientCount+"");
    }

    public void sendMessage(String message){
        printWriter.println(message);
        printWriter.flush();
    }

    @Override
    public void run() {
        try {
            while (true){
                server.sendMessageToAllClients("NEW CLIENT!!");
                server.sendMessageToAllClients(clientCount+"");

                break;
            }

            while (true){
                String clientMessage = scanner.nextLine();
                if(clientMessage.equals("close server")){
                    break;
                }

                System.out.println(clientMessage);//для сервера
                server.sendMessageToAllClients(clientMessage);//для пользователей
                break;
            }

            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
