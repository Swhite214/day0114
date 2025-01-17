package abstracts;

//파일생성규칙도 동일합니다.
public interface RemoteController { //class와 동일하지만 interface로 바꿔주시면됩니다.
	abstract void disp(); //전과달리 abstract를 안써도 상관없는이유는 애초에 인터페이스란 추상메서드의 집합이기때문입니다.
	abstract void disp2();
	void disp3();
	void disp4();
	//java 8 다른메서드
	//void print(){}바디가있으면 오히려 오류가납니다 재밌죠?
	//그래서 default를써야합니다
	default void print() {} //이것도 자바 8에서만 가능합니다.
	static void print2() {}// static은 바디가 있어도 가능합니다.
	
	//필드는 사용가능한가요?
	int num=0;//인스턴스변수선언 당연히안됨 왜? 이거 추상메서드의 집합이라 객체못만듬 ㅋㅋ
	//그럼 저건 뭘까? 당연히? static이 붙는? 클래스변수겠죠 필드는 무조건 static이므로 생략가능 게다가 상수만 허용해서 final도 생략됩니다
	//즉 파이널 생략이므로 초기화값넣어줘야함
	static int num2 = 1;
	static final int num3 = 3;
	//인터페이스는 객체를 못만드니 생성자가 존재하지않아요 추상클래스는 생성자가 있던데...
}