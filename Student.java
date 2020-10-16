package snippet;

public class Student {
    private String name;
    private int num ;
	public Student(String name, int num) {
		this.name = name;
		if(num==1 || num ==2) {
  	     	this.num = num;
		}
		else {System.out.println("invalid input !!");}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		if(num==1 || num ==2) {
  	     	this.num = num;
		}
		else{System.out.println("invalid input !!");}
	}    
}
