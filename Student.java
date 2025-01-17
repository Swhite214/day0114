package inhertiance2;

public class Student extends Person{
	int stdNo;
	String schoole;
	//부모의 기본생성자가 존재하지않는경우
	//자식 생성자에서 super()를 반드시 첫줄에 명시해야함
	//만약 매개변수가 두개 라면? 그냥 필요한건 호출하시면됩니다.
	//단 만약 기본생성자가 존재한다면 생략가능
	public Student() {
		 super("adf");//기본생성자라면 생략가능해요~
	}
	void display() {
		System.out.println(stdNo);
		System.out.println(schoole);
		System.out.println(name);
		System.out.println(age);
	}
	@Override
	void print() {
		
		System.out.print("Fake");
	}
	
	
}
