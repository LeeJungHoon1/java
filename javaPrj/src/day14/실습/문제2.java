package day14.실습;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class 문제2 {

	public static void main(String[] args) {
//		2.  내가 좋아하는거 파일에서 읽어오기 ( 예시 : 좋아하는 과일이름 5개)
		
		try {
			ObjectOutputStream oo = new ObjectOutputStream
					(new FileOutputStream("res/like.txt"));
			oo.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
