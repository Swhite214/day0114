package abstracts;

public class Cat extends Animal{
	@Override
	public void move() {
		System.out.println("꽁꽁 얼어붙은 한강위로 "+age+"세 "+"고양이 "+name +"이 걸어갑니다." );
		
	}
	
	public Cat() {//기본생성자가 아니므로 super명시
		super("Tom",17);
	}
}
