package day14.실습;

public class acorn {
	String name;

	public acorn() {}
	public acorn(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "acorn [name=" + name + "]";
	}
}
