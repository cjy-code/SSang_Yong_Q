package com.test.question.q14;

public class Q01 {
	
	public static void main(String[] args) {
		
		Book b1 = new Book();
		
		
		info(b1);
		
		
		
		System.out.println(info(b1));
		
		
		
	}

	private static String info(Book b1) {
		
		String temp ="";
		
		b1.setTitle("잠1");  //  제목
		b1.setPrice(12420);  //  가격
		b1.setAuthor("베르나르 베르베르");  // 작가
		b1.setPage(336);
		b1.setPublisher("열린책들");
		b1.setIsbn("9788932918372");
		
		temp += "제목: "+b1.getTitle()+"\n";
		temp += temp.format("가격 : %,d원\n", b1.getPrice());
		temp += "저자: "+b1.getAuthor()+"\n";
		temp += "페이지 수: "+b1.getPage()+"\n";
		temp += "발행년도: "+b1.getPubYear()+"\n";
		temp += "ISBN: "+b1.getIsbn()+"\n";
		
		
//		System.out.printf("제목: %s\n", b1.getTitle());
//		System.out.printf("가격: %,d원\n", b1.getPrice());
//		System.out.printf("저자: %s\n", b1.getAuthor());
//		System.out.printf("페이지수: %d\n", b1.getPage());
//		System.out.printf("발행년도: %s\n", b1.getPubYear());
//		System.out.printf("ISBN : %s\n", b1.getIsbn());
//		
		
		return temp;
		
	}//main

}

class Book {
	
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2020";
	private String isbn;
	private int page;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {// 셋_제목

		boolean bl = false;
		for (int i = 0; i < title.length(); i++) {// 한,영,숫자 비교문

			int index = title.charAt(i);

			if ((index >= 48 && index <= 57) || (index >= 65 && index <= 122) || (index >= 44032 && index <= 55203)) {
				bl = true;

			} else {
				bl = false;
			}
		} // for
	
	if(!bl) {
			this.title="한, 영, 숫자만 적어주세요";
	}else {
		if(title.length() <= 5) {// 글자수 50자 이하 제한 반복문
			this.title = title;	
		}else {
			this.title="최대 50자 이내로 써주세요.";
		}
		
	}
			
	}
	
	
	public int getPrice() {//겟_가격
		return price;
	}
	
	public void setPrice(int price) {//셋_가격
		
		if (price >= 0 && price <= 1000000) {// 0이상 100만원 이하
			this.price = price;
		} else {
			System.out.println("범위값 밖입니다.");
		}
	}
	public String getAuthor() {//겟_작가
		return author;
	}
	
	public void setAuthor(String author) {// 갯_출판사
		this.author = author;
	}
	
	public void setPublisher(String publisher) {// 출판사 쓰기 전용
		
		this.publisher = publisher;
		
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {// 셋_페이지
		if(page >=1) {
		this.page = page;
		}else {
			System.out.println("한페이지 이상 적어 주세요");
		}
	}
	
	public String getPubYear() { //읽기 전용) 겟_발행년도
		return pubYear;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
