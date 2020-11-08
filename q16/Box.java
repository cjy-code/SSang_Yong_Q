package com.test.question.q16;

public class Box {
	
	private Macaron[] list = new Macaron[10];// 마카롱 10개
	private int pass_Count =0;
	private int fail_Count =0;
	
	public void cook() {
		
		for(int i=0; i<list.length; i++) {
			Macaron m = new Macaron();
			
			m.getColor();
			m.getSize();
			m.getThickness();
			
			this.list[i] = m;
			
		}
		
		
		System.out.printf("마카롱 %d개를 만들었습니다.\n\n",list.length);
		
	}
	
	public void check() {
		

		
		for (int i = 0; i < 10; i++) {
			int color = (int) (Math.random() * 8 + 1)-1;

			Macaron m =this.list[i];
			
			if (check(m)) {
					this.pass_Count++;
			} else {
					this.fail_Count++;
			}
		}
		
		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수 : %d\n", this.pass_Count );
		System.out.printf("QC 불합격 개수 : %d\n", this.fail_Count);
		
		
		System.out.println();
		
	}//check
	public void list() {
		
		
        
        
        System.out.println("[마카롱 목록]");
		
        for (int i = 0; i < 10; i++) {
        	
        	Macaron m = this.list[i];
		

			if (m.getColor().equals("blcak") || // 검점, 크기 8이상 14이하가 아니거나,  
			   (m.getSize()<8 && m.getSize()<14) ||// 두께 3mm~18mm가 아니면 실패
			   (m.getThickness() <3 && m.getThickness() >18)){
				System.out.printf("%dcm(%s, %d,mm): 불합격\n",m.getSize(),m.getColor(),m.getThickness());
				this.pass_Count++;
			} else {
				System.out.printf("%dcm(%s, %d,mm): 합격\n",m.getSize(),m.getColor(),m.getThickness());
				this.pass_Count++;
			}	
		}
		
	    
		
		
	}//list

private boolean check(Macaron m) {
		
		//QC(크기)
		if (!(m.getSize() >= 8 && m.getSize() <= 14)) {
			return false;
		}
		
		//QC(색상)
		if (m.getColor().equals("black")) {
			return false;
		}
		
		//QC(두께)
		if (!(m.getSize() >= 3 && m.getSize() <= 18)) {
			return false;
		}
		
		return true;
	}
}
