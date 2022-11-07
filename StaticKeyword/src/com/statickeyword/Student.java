package com.statickeyword;

class Student {
	int rollno;
	String name;
	static String college ="SIET";
	Student(int r,String n){
		rollno = r;
		name = n;
	}
	static void change() {
		college = "SIET";
	}
	void display (){
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String[] args) {
		Student s1 = new Student(111,"Joshni");
	    Student s2 = new Student(222,"Jyothi");
	    change();
	    s1.display();
	    s2.display();
	}
}
