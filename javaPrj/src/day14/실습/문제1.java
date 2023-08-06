package day14.실습;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class 문제1 {
	public static void main(String[] args) {
//		1.
//		   우리반 친구들 이름이 있는 파일 읽어오기
//		   그 중에 이름만 출력하기

		try {
			BufferedReader bf = new BufferedReader(new FileReader("res/acorn2.txt"));
			
			while(true) {
			String a = bf.readLine();
			if(a == null)break;
			System.out.println(a);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
