package day14.ioEx;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {
	public static void main(String[] args) {
		
		// 입출력스트림
		// 읿력스트림 ( 데이터가 들어오는길(입역전용 메모리버퍼))
		// 출력스트림 (데이터가 나가는 길 (출력전용 메모리버퍼))
		
		// 기반스트림(실제로 데이타를 읽고 쓰고 하느 기능)
		// 보조스트림(부가기능)
		
		// 바이트스트림
		try {
			int su = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 보조스트림이 필요
		
		

	}
}
