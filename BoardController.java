package abstracts;

public class BoardController {
	
	private BoardService service;
	
	public void save(BoardDTO dto) {
		service.saveProcess(dto);
		
	}

	public BoardController(BoardService service) { //set
		this.service = service;
	}
}
