package abstracts;

public class BoardMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardController board= new BoardController(new BoardServiceProcess());
		BoardDTO dto = new BoardDTO();
		dto.setNo(1);
		dto.setTitle("제목이네요");
		dto.setContent("내용입니다.");
		dto.setWriter("홍길동");
		
		board.save(dto);
	}

}
