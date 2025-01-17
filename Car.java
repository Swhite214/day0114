package inhertiance2;

public class Car {
	String model;
	String color;
	//탑-다운 방식 엔진,부품 =>자동차가 아닌 자동차에는 뭐가필요해? 엔진 부품 그럼 자동차클래스하나만들고 그후 엔진클래스등등...
	Engine engine;
}
//Car has a Engine
//구성관계(composition) == Has A 관계 //클래스안에 또다른 클래스가 존재