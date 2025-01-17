package abstracts;

public interface BoardService {
	//게시글 인터페이스임
	//이건 글쓰기 기능: 게시글 내용을 DB에 저장
	public void saveProcess(BoardDTO dto); //이거 상속하시면 반드시 오버라이드해서 구현하셔야합니다
	//탑 다운 개발방식 = 일단 선언해 그리고 만들어
	
	//모두 읽어오기
	//1개만 읽어오기
	//수정하기
	//삭제하기
	//객체 생성은 클래스만 가능해요 추상,인터는 안돼요

}
