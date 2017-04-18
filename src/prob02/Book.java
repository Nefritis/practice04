package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode =1;
	
	public Book(){
		
	}
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}
	
	public void rent(int number){
		if(number ==1){		
			System.out.println(this.title+"이(가) 대여 됐습니다.");
			this.stateCode = 0;
		}else{
			System.out.println("대여중");
			System.out.println(this.title+"이(가) 대여 됐습니다.");
		}
	}
	
	public void print(){
		if(this.stateCode==1){
			System.out.println("책 제목 : " + this.title + " 작가 : " + this.author + " 대여 유무 : " + "재고 있음" ) ;
		}else{
			System.out.println("책 제목 : " + this.title + " 작가 : " + this.author + " 대여 유무 : " + "대여 중" ) ;

		}
	
	}
	
	
}
