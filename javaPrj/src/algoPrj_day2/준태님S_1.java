package algoPrj_day2;

public class 준태님S_1 {

	public static void main(String[] args) {
		
		//변수선언
		
		double hp =250;		//h시 인구
		double hu=0.036;	//h시 증가률
		double hup=0;		//h시 증가인구
		
		double kp =180;		//k시 인구
		double ku=0.042;	//k시 증가률
		double kup=0;		//k시 증가인구
		
		int y=1999;			//기준년
		int c=0;
		int sum; 			//출력변수
		
		while(kp<=hp) {
			hup=hp*hu;	//(250*0.036);
			hp=hup;
			
			kup=kp*ku;
			kp=kup;
			
			c=c+1;
		}
		
		sum=y+c;
		System.out.println(sum);
		
		
		

	}

}
