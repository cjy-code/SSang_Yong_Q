package com.test.question.q16;

public class Refrigerator {
	
	private Item[] list = new Item[100];
	private int index = 0;
	
	
	public void add(Item item) {
		
		this.list[index] = item; 
		this.index++; 
		
		System.out.printf("'%s'를 냉장고에 넣었습니다.\n", item.getName());
		
	}
	
	public Item get(String name) {

		Item item = null;
		int itemIndex = -1;

		
		for (int i = 0; i < index; i++) {
			if (this.list[i].getName().equals(name)) {
				
				item = this.list[i];
				itemIndex = i;
				this.index--;
				break; 
			}
		}

		// 해당 이름의 식품을 못찾을 수도 있다. 찾았을 경우에 해당 식품이 있던 칸이 비워지므로 해당 칸 뒤에 있는 음식들을 차례대로 좌측
		// 시프트해서 빈칸을 메꾼다.
		if (item != null) {

			for (int i = itemIndex; i < index; i++) {
				this.list[i] = this.list[i + 1];
			}

		}

		return item; // 아까 찾은 식품을 돌려준다.
	}
	
	public int count() {
		
		return this.index;
	}
	
	public void listItem() {
		System.out.println();
		System.out.println();
		System.out.println("[냉장고 아이템 목록]");
		for (int i = 0; i < index; i++) {

			Item item = this.list[i];

			
			System.out.printf("%s(%s)\n", item.getName(), item.getExpiration());
		}
		
	}
	
	
	
	
	
	
	
	
}
