package day20.thread;

public class 풀스택Ex {
	// 풀스택이란? 매서드 수행에 필요한 메모리가 제공되는 공간
	// 스택 : 먼저 들어온것이 나중에 나가는 구조
	// 매서드가 호출되면 호출스택에 메모리 할당 종료되면 해체됨

	void 매서드1() {
		매서드2();
		System.out.println("매서드1 call");
	}

	private void 매서드2() {
		System.out.println("매서드2 call");
	}

	public static void main(String[] args) {
		풀스택Ex p = new 풀스택Ex();
		p.매서드1();
		System.out.println("main bye");
	}

}
