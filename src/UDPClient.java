import java.net.*;
import java.io.*;

public class UDPClient {
    public static void main(String[] args) {
        //args give message contents and server hostname
        DatagramSocket aSocket = null;
        try{
            //creating a socket
            aSocket = new DatagramSocket();

            //size
            byte [] m = args[0].getBytes();

            //Internet address
            InetAddress aHost = InetAddress.getByName(args[1]);

            //PortNumber
            int serverPort = 6789;
            DatagramPacket request = new DatagramPacket(m,m.length,aHost,serverPort);

            //socket = internetAddress + portNumber
            aSocket.send(request);

            //size of the received packet
            byte[]buffer = new byte[1000];

            //putting the reply message into the allocated buffer
            DatagramPacket reply = new DatagramPacket(buffer, buffer.length);

            //using the same created socket to receive the message
            aSocket.receive(reply);
            System.out.println("Reply:"+new String(reply.getData()));

            //incase of any errors
        }catch (SocketException e){
            System.out.println("Socket:" + e.getMessage());
        }catch (IOException e){
            System.out.println("IO: " + e.getMessage());
        }finally {if (aSocket != null) aSocket.close();}
    }
}
