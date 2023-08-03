package day12.상속;

public class 상속customer extends 상속person{
	String id;
	String pw;
	public 상속customer(String name, String age, String height, String weight, String id , String pw) {
		super(name,age,height,weight);
		this.id = id;
		this.pw = pw;
	}
	public String toString() {
		return name+age+height+weight+id+pw;
	}
}
