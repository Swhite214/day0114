package abstracts;

public class BoardServiceProcess implements BoardService{
	//클래스가 인터페이스를 구현할때 쓰는 단어입니다
		//다중으로도 가능합니다
	@Override
	public void saveProcess(BoardDTO dto) {
		System.out.println("비지니스 로직을 완성하시면 됩니다.");
		System.out.println("dto를 DB 저장하시면돼요");
		System.out.println(dto);
		
	}
	
}
