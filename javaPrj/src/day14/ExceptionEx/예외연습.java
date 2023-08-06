package day14.ExceptionEx;

import java.io.IOException;
import java.util.Scanner;

public class 예외연습 {

		public int aa(int a) throws 예외연습1{
			if(a>10) {
				throw new 예외연습1();
			}
			return a;
		}
		

	}

