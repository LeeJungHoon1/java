package day15.인터페이스;
public class TeacherProgram {	
	MyRunnable r;	
	public void setR(MyRunnable r) {
		this.r = r;
	}	
	public void run() {
		r.run();
	}
	public static void main(String[] args) {	 
		System.out.println("학생들이 작성한 코드를 실행시켜드립니다");
		TeacherProgram p = new TeacherProgram();

		p.setR(new LJH());
		p.run();
	}
}
