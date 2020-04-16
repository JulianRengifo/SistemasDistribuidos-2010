package services;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import data.Persona;

public class ServerThread extends Thread {
	
	
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private Socket s;
	private int idClient;
	
	
	public ServerThread(Socket s, int idClient) throws IOException {
		
		this.s = s;
		this.idClient = idClient;
		
		ois =  new ObjectInputStream(s.getInputStream());
		oos = new  ObjectOutputStream(s.getOutputStream());
	}

	@Override
	public void run() {
		
try {
	
	System.out.println("Srver> client "+idClient+" started");
	
	Persona persona = new Persona();
	
	persona = (Persona)ois.readObject();
	
	System.out.println("Srver> client "+persona+" started");
	
	oos.writeObject("Server> Persona" + persona.getIdentificacion());
	
	s.close();
	
	System.out.println("Srver> client "+idClient+" stop");
	
	System.out.println(persona);
		
	}catch (Exception e) {
		System.out.println("Server>"+e.getMessage());
	
	}
	
	}

}

