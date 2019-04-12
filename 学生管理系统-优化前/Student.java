package com.neuedu.studentManageSystem;

public class Student {
	int id;
	String name;
	char sex;
	int age;
	String grade;
	String address;
	long telephone;
	String email;
	
	
	public Student() {
		
	}
	
	public Student(int id,String name,char sex,int age,String grade,
	String address,long telephone,String email) {
		this.id=id;
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.grade=grade;
		this.address=address;
		this.telephone=telephone;
		this.email=email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", grade=" + grade
				+ ", address=" + address + ", telephone=" + telephone + ", email=" + email + "]";
	}

}
