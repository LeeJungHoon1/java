package day12.다형성예제.춤;

public class PolymorphismEx2 {

	public static void main(String[] args) {

	   Person[]  persons2 = new  Person[16];
//	   persons2[0]=  new Dance_NJ2();
//	   persons2[1]=  new Dance2(); 			   
//	   persons2[2]=  new DunDun2();
//	   persons2[3]=  new JHDance2();
//	   persons2[4]=  new juntae2();
//	   persons2[5]=  new Kimhs2();
//	   persons2[6]=   new KJY2();
//	   persons2[7]=  new PersonDance2(); 
//	   persons2[8]=  new PersonMin2();
//	   persons2[9]=  new Yejin2();
//	   persons2[10]= new LY_dance2();
//	   persons2[11]= new Singer2();
//	   persons2[12]=  new 병진2();
//	   persons2[13]=  new Samba2();
//	   persons2[14]=  new Dance_JH2();
//	   persons2[15]=   new Samba2();

	  	    
	   System.out.println( "우리 학생들이 춤을 추기 시작합니다 ") ;	   
	   for( int i=0; i< persons2.length ; i ++ ) {
		   persons2[i].dance();  // 하나의 메시지 다르게 동작하는거 다형성이라고 부른다
	   }
		

	   // 1. 오버로딩 ( 이름이 같고 매개변수가 다른것 !!!)
	   // 2. 상속관계에서 오버라이딩 (부모의 매서드 재정의)를 통한 다형성 
	   
	}

}
