package abstracts;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal animal = new Animal("Tom",12); 추상클래스는 객체못만들어요~
		Animal animal = new Cat();
		animal.move();
	}

}
