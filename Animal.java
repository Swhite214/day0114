package abstracts;

//abstract 키워드가 명시된 클래스를 추상클래스: 미완성된 클래스이므로 객체로 만들수 없습니다.
//추상클래스의 구성요소: 일반 클래스 메서드 + 추상메서드(필수는 아님)
public abstract class Animal { //추상클래스 추상클래스도 클래스의 특징을가집니다.
	String name;
	int age;
	
	void showinfo() {
		System.out.println("이름: "+ name + ", 나이: "+age);
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age =age;
	}
	//추상메서드를 허용한다.
	//추상메서드는 {}없이 헤더만 선언된 메서드 시그니처만 있어요 즉 미완성 메서드입니다.
	//선언: 모양만 잡아놓은거 정의:완전히 할당한거
	
	public abstract void move(); //이것이 추상메서드 {}이게없어요~ 반드시 자식클래스에서 완성시켜야합니다.
	//알겠는데 이거 뭐 어따써?: 추상클래스를 부모로모시고 있는 자식클래스는 부모의 추상메서드를
	//반드시 자식클래스에서 구현해야됩니다. 추상메서드로 해놓으면 공통된 기능을 좀더 선택지를 넓게 할수있음
	//animal에서 추상메서드 동물울음소리하면 cat과 dog가 자식클래스라면? 월월 미야옹 이런식으로 각기 다르게
	//구현이됩니다.
}
