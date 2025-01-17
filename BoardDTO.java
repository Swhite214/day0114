package abstracts;

public class BoardDTO {
	private long no;
	private String title;
	private String content;
	private String writer;
	private int readCount;
	//알트 쉬프트 에이 전체클릭
	//자동으로 만들어집니다 할렐루야~
	@Override
	public String toString() {
	    return "BoardDTO [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + ", readCount=" + readCount + "]";
	}
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	
	
}
