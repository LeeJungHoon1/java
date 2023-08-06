package java_day12.동기상속연습;

public class Notebook {
	
	String cpu;
	int ram;
	
	public Notebook() {
		this("i5", 8);
	}
	
	public Notebook(String cpu, int ram) {
		this.cpu = cpu;
		this.ram = ram;
	}

}
