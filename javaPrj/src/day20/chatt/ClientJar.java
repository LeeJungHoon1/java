package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientJar {

	Socket s;

	DataInputStream dis;
	DataOutputStream dos;

	public ClientJar() {
		// 서버의 ip,port
		try {
			s = new Socket("192.168.0.23", 6100);
//			s = new Socket("localhost",6100);

			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());

			// 보내기
			dataSend();

			// 받기
			dataRecv();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 읽기
	private void dataRecv() {
		// 쓰레드만들기, 쓰레드시작
//		
//		while(true) {
//			String message;
//		try {
//			message = dis.readUTF();
//			System.out.println(message);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		}
//		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					String message;
					try {
						message = dis.readUTF();
						System.out.println(message);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t.start();
	}

	// 쓰기
	private void dataSend() {

		Scanner sc = new Scanner(System.in);

//		while(true) {
//		try {
//			System.out.println("메세지:");
//			String message= sc.nextLine();
//			dos.writeUTF(message);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						System.out.println("메세지:");
						String message = sc.nextLine();
						dos.writeUTF(message);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t.start();

	}

	public static void main(String[] args) {

		ClientJar c = new ClientJar();

	}

}
