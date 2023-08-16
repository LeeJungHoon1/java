package day20.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client0 {

	Socket s;

	DataInputStream dis;
	DataOutputStream dos;

	public Client0() {
		// 서버의 ip,port
		try {
			s = new Socket("61.73.130.228", 6100);
			System.out.println("서버에 요청 !!");

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

	private void dataRecv() {

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					String message;
					try {
						message = dis.readUTF();
						System.out.println(message);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t.start();
	}

	private void dataSend() {
		Scanner sc = new Scanner(System.in);

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
				try {
					System.out.println("메세지작성");
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

		Client0 c = new Client0();

	}

}