package com.neuedu.studentManageSystem;

import java.util.Arrays;
import java.util.Scanner;

public class Admin {
	String aName;
	String aPwd;
	Student student=new Student(1, "张三", '男', 23, "初级", "天津", 123456, "123@qq.com");
	Student[] stuArray= {student};
	Student[] newStuArray= new Student[0];
	public Admin(String aName,String aPwd) {
		this.aName=aName;
		this.aPwd=aPwd;
	}
	//增加部分
	
	//添加一条学生信息
	public Student[] addOneStudent(Scanner scanner) {
		System.out.println("请输入学生id:");
		int id=scanner.nextInt();
		
		System.out.println("请输入学生姓名:");
		String name=scanner.next();
		
		System.out.println("请输入学生性别:");
		char sex=scanner.next().charAt(0);
		
		System.out.println("请输入学生年龄:");
		int age=scanner.nextInt();
		
		System.out.println("请输入学生所属年级:");
		String grade=scanner.next();
		
		System.out.println("请输入学生地址:");
		String address=scanner.next();
		
		System.out.println("请输入学生联系方式:");
		long telephone=scanner.nextInt();
		
		System.out.println("请输入学生电子邮箱:");
		String email=scanner.next();
		Student student=new Student(id, name, sex, age, grade, address, telephone, email);
		stuArray=Arrays.copyOf(stuArray, stuArray.length+1);
		stuArray[stuArray.length-1]=student;
		//System.out.println(Arrays.toString(stuArray));
		return stuArray;
	}
	
	
	//查看部分
	
	//查看所有学生信息
	public void showAllStuMsg() {
		for(int i=0;i<stuArray.length;i++) {
			System.out.println("第"+(i+1)+"个学生的信息：");
			System.out.println("学生id："+stuArray[i].id);
			System.out.println("姓名："+stuArray[i].name);
			System.out.println("性别："+stuArray[i].sex);
			System.out.println("年龄："+stuArray[i].age);
			System.out.println("所属年级："+stuArray[i].grade);
			System.out.println("地址："+stuArray[i].address);
			System.out.println("联系方式："+stuArray[i].telephone);
			System.out.println("电子邮箱："+stuArray[i].email);
		}
	}
	//根据ID查询学生信息
	public void selectStuByID(int id) {
		for(int i=0;i<stuArray.length;i++) {
			if(id==stuArray[i].id) {
				System.out.println("学生id："+stuArray[i].id);
				System.out.println("姓名："+stuArray[i].name);
				System.out.println("性别："+stuArray[i].sex);
				System.out.println("年龄："+stuArray[i].age);
				System.out.println("所属年级："+stuArray[i].grade);
				System.out.println("地址："+stuArray[i].address);
				System.out.println("联系方式："+stuArray[i].telephone);
				System.out.println("电子邮箱："+stuArray[i].email);
			}else {
				System.out.println("抱歉，没有此学号的学生");
			}	
		}
	}
	
	//根据学生ID查询学生姓名
	public String selectStuNameByID(int id) {
		String stuName=null;
		for(int i=0;i<stuArray.length;i++) {
			if(id==stuArray[i].id) {
				stuName=stuArray[i].name;
			}
		}
		return stuName;
	}
	//删除部分
	//根据学生ID删除学生
	public Student[] delStuByID(int id) {
		for(int i=0;i<stuArray.length;i++) {
			if(id!=stuArray[i].id) {
				newStuArray=Arrays.copyOf(newStuArray, newStuArray.length+1);
				newStuArray[newStuArray.length-1]=stuArray[i];
			}
		}
		return newStuArray;
	}
	//根据学生姓名删除学生
	public Student[] delStuByName(String stuName) {
		for(int i=0;i<stuArray.length;i++) {
			if(!stuName.equals(stuArray[i].name)) {
				newStuArray=Arrays.copyOf(newStuArray, newStuArray.length+1);
				newStuArray[newStuArray.length-1]=stuArray[i];
			}
		}
		return newStuArray;
	}
	//修改部分
	//根据学生ID修改学生全部信息
	public Student updateStuAllMsgByID(Scanner scanner) {
		Student updateStu=new Student();
		System.out.println("请输入要修改学生信息的学生id:");
		int id =scanner.nextInt();
		System.out.println("该学生修改前信息:");
		selectStuByID(id);
		for(int i=0;i<stuArray.length;i++) {
			if(id==stuArray[i].id) {
				System.out.println("请输入要修改的属性值:");
				System.out.println("姓名:");
				String name=scanner.next();
				System.out.println("性别:");
				char sex=scanner.next().charAt(0);
				System.out.println("年龄:");
				int age=scanner.nextInt();
				System.out.println("所属年级:");
				String grade=scanner.next();
				System.out.println("地址:");
				String address=scanner.next();
				System.out.println("联系方式:");
				long telephone=scanner.nextInt();
				System.out.println("电子邮箱:");
				String email=scanner.next();
				stuArray[i]=new Student(id, name, sex, age, grade, address, telephone, email);
				updateStu=stuArray[i];
			}
		}
		System.out.println("修改后的学生信息为");
		System.out.println("学生id："+updateStu.id);
		System.out.println("姓名："+updateStu.name);
		System.out.println("性别："+updateStu.sex);
		System.out.println("年龄："+updateStu.age);
		System.out.println("所属年级："+updateStu.grade);
		System.out.println("地址："+updateStu.address);
		System.out.println("联系方式："+updateStu.telephone);
		System.out.println("电子邮箱："+updateStu.email);
		return updateStu;
	}
	//根据学生ID修改学生部分信息
	public Student updateStuSomeMsgByID(Scanner scanner) {
		Student updateStu=new Student();
		System.out.println("请输入要修改学生信息的学生id:");
		int id =scanner.nextInt();
		System.out.println("该学生修改前信息:");
		selectStuByID(id);
		for(int i=0;i<stuArray.length;i++) {
			if(id==stuArray[i].id) {
				System.out.println("请输入要修改的属性：");
				String property=scanner.next();
				if(property.equals("name")) {
					System.out.println("请输入修改后的数据：");
					String name=scanner.next();
					stuArray[i].name=name;
					updateStu= stuArray[i];
				}else if(property.equals("sex")) {
					System.out.println("请输入修改后的数据：");
					char sex=scanner.next().charAt(0);
					stuArray[i].sex=sex;
					updateStu= stuArray[i];
				}else if(property.equals("age")) {
					System.out.println("请输入修改后的数据：");
					int age=scanner.nextInt();
					stuArray[i].age=age;
					updateStu= stuArray[i];
				}else if(property.equals("grade")) {
					System.out.println("请输入修改后的数据：");
					String grade=scanner.next();
					stuArray[i].grade=grade;
					updateStu= stuArray[i];
				}else if(property.equals("address")) {
					System.out.println("请输入修改后的数据：");
					String address=scanner.next();
					stuArray[i].address=address;
					updateStu= stuArray[i];
				}else if(property.equals("telephone")) {
					System.out.println("请输入修改后的数据：");
					long telephone=scanner.nextInt();
					stuArray[i].telephone=telephone;
					updateStu= stuArray[i];
				}else if(property.equals("email")) {
					System.out.println("请输入修改后的数据：");
					String email=scanner.next();
					stuArray[i].email=email;
					updateStu= stuArray[i];
				}else {
					System.out.println("对不起,没有这个属性!");	
				}
				
			}
		}
		return updateStu;
	}
	
	
	//
}
