import java.net.*;
import java.io.*;

/*Ahaiku is a three-line poem in which the first line contains five syllables,
the second line contains seven syllables, and the third line contains five
syllables. Write a haiku server that listens to port 5575. When a client
connects to this port, the server responds with a haiku.*/
public class Listenhaiku {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int portNumber = 5575;
		System.out.println("Creating server socket on port " + portNumber);
		ServerSocket mysock = new ServerSocket(portNumber);
	while (true){
		Socket socket = mysock.accept();
		PrintWriter pout= new PrintWriter(socket.getOutputStream(),true);
		pout.println("hatsu shigure saru mo komino o hoshige nari");
		socket.close();
		
		
		/*Socket socket = serverSocket.accept();
		OutputStream os = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(os, true);
		pw.println("What's you name?");

		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String str = br.readLine();

		pw.println("Hello, " + str);
		pw.close();
		socket.close();

		System.out.println("Just said hello to:" + str);*/
	}

	}

}
