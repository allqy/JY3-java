package com.neuedu.studentManageSystem;

import java.util.Arrays;
import java.util.Scanner;

public class Admin {
	String aName;
	String aPwd;
	Student student=new Student(1, "����", '��', 23, "����", "���", 123456, "123@qq.com");
	Student[] stuArray= {student};
	Student[] newStuArray= new Student[0];
	public Admin(String aName,String aPwd) {
		this.aName=aName;
		this.aPwd=aPwd;
	}
	//���Ӳ���
	
	//���һ��ѧ����Ϣ
	public Student[] addOneStudent(Scanner scanner) {
		System.out.println("������ѧ��id:");
		int id=scanner.nextInt();
		
		System.out.println("������ѧ������:");
		String name=scanner.next();
		
		System.out.println("������ѧ���Ա�:");
		char sex=scanner.next().charAt(0);
		
		System.out.println("������ѧ������:");
		int age=scanner.nextInt();
		
		System.out.println("������ѧ�������꼶:");
		String grade=scanner.next();
		
		System.out.println("������ѧ����ַ:");
		String address=scanner.next();
		
		System.out.println("������ѧ����ϵ��ʽ:");
		long telephone=scanner.nextInt();
		
		System.out.println("������ѧ����������:");
		String email=scanner.next();
		Student student=new Student(id, name, sex, age, grade, address, telephone, email);
		stuArray=Arrays.copyOf(stuArray, stuArray.length+1);
		stuArray[stuArray.length-1]=student;
		//System.out.println(Arrays.toString(stuArray));
		return stuArray;
	}
	
	
	//�鿴����
	
	//�鿴����ѧ����Ϣ
	public void showAllStuMsg() {
		for(int i=0;i<stuArray.length;i++) {
			System.out.println("��"+(i+1)+"��ѧ������Ϣ��");
			System.out.println("ѧ��id��"+stuArray[i].id);
			System.out.println("������"+stuArray[i].name);
			System.out.println("�Ա�"+stuArray[i].sex);
			System.out.println("���䣺"+stuArray[i].age);
			System.out.println("�����꼶��"+stuArray[i].grade);
			System.out.println("��ַ��"+stuArray[i].address);
			System.out.println("��ϵ��ʽ��"+stuArray[i].telephone);
			System.out.println("�������䣺"+stuArray[i].email);
		}
	}
	//����ID��ѯѧ����Ϣ
	public void selectStuByID(int id) {
		for(int i=0;i<stuArray.length;i++) {
			if(id==stuArray[i].id) {
				System.out.println("ѧ��id��"+stuArray[i].id);
				System.out.println("������"+stuArray[i].name);
				System.out.println("�Ա�"+stuArray[i].sex);
				System.out.println("���䣺"+stuArray[i].age);
				System.out.println("�����꼶��"+stuArray[i].grade);
				System.out.println("��ַ��"+stuArray[i].address);
				System.out.println("��ϵ��ʽ��"+stuArray[i].telephone);
				System.out.println("�������䣺"+stuArray[i].email);
			}else {
				System.out.println("��Ǹ��û�д�ѧ�ŵ�ѧ��");
			}	
		}
	}
	
	//����ѧ��ID��ѯѧ������
	public String selectStuNameByID(int id) {
		String stuName=null;
		for(int i=0;i<stuArray.length;i++) {
			if(id==stuArray[i].id) {
				stuName=stuArray[i].name;
			}
		}
		return stuName;
	}
	//ɾ������
	//����ѧ��IDɾ��ѧ��
	public Student[] delStuByID(int id) {
		for(int i=0;i<stuArray.length;i++) {
			if(id!=stuArray[i].id) {
				newStuArray=Arrays.copyOf(newStuArray, newStuArray.length+1);
				newStuArray[newStuArray.length-1]=stuArray[i];
			}
		}
		return newStuArray;
	}
	//����ѧ������ɾ��ѧ��
	public Student[] delStuByName(String stuName) {
		for(int i=0;i<stuArray.length;i++) {
			if(!stuName.equals(stuArray[i].name)) {
				newStuArray=Arrays.copyOf(newStuArray, newStuArray.length+1);
				newStuArray[newStuArray.length-1]=stuArray[i];
			}
		}
		return newStuArray;
	}
	//�޸Ĳ���
	//����ѧ��ID�޸�ѧ��ȫ����Ϣ
	public Student updateStuAllMsgByID(Scanner scanner) {
		Student updateStu=new Student();
		System.out.println("������Ҫ�޸�ѧ����Ϣ��ѧ��id:");
		int id =scanner.nextInt();
		System.out.println("��ѧ���޸�ǰ��Ϣ:");
		selectStuByID(id);
		for(int i=0;i<stuArray.length;i++) {
			if(id==stuArray[i].id) {
				System.out.println("������Ҫ�޸ĵ�����ֵ:");
				System.out.println("����:");
				String name=scanner.next();
				System.out.println("�Ա�:");
				char sex=scanner.next().charAt(0);
				System.out.println("����:");
				int age=scanner.nextInt();
				System.out.println("�����꼶:");
				String grade=scanner.next();
				System.out.println("��ַ:");
				String address=scanner.next();
				System.out.println("��ϵ��ʽ:");
				long telephone=scanner.nextInt();
				System.out.println("��������:");
				String email=scanner.next();
				stuArray[i]=new Student(id, name, sex, age, grade, address, telephone, email);
				updateStu=stuArray[i];
			}
		}
		System.out.println("�޸ĺ��ѧ����ϢΪ");
		System.out.println("ѧ��id��"+updateStu.id);
		System.out.println("������"+updateStu.name);
		System.out.println("�Ա�"+updateStu.sex);
		System.out.println("���䣺"+updateStu.age);
		System.out.println("�����꼶��"+updateStu.grade);
		System.out.println("��ַ��"+updateStu.address);
		System.out.println("��ϵ��ʽ��"+updateStu.telephone);
		System.out.println("�������䣺"+updateStu.email);
		return updateStu;
	}
	//����ѧ��ID�޸�ѧ��������Ϣ
	public Student updateStuSomeMsgByID(Scanner scanner) {
		Student updateStu=new Student();
		System.out.println("������Ҫ�޸�ѧ����Ϣ��ѧ��id:");
		int id =scanner.nextInt();
		System.out.println("��ѧ���޸�ǰ��Ϣ:");
		selectStuByID(id);
		for(int i=0;i<stuArray.length;i++) {
			if(id==stuArray[i].id) {
				System.out.println("������Ҫ�޸ĵ����ԣ�");
				String property=scanner.next();
				if(property.equals("name")) {
					System.out.println("�������޸ĺ�����ݣ�");
					String name=scanner.next();
					stuArray[i].name=name;
					updateStu= stuArray[i];
				}else if(property.equals("sex")) {
					System.out.println("�������޸ĺ�����ݣ�");
					char sex=scanner.next().charAt(0);
					stuArray[i].sex=sex;
					updateStu= stuArray[i];
				}else if(property.equals("age")) {
					System.out.println("�������޸ĺ�����ݣ�");
					int age=scanner.nextInt();
					stuArray[i].age=age;
					updateStu= stuArray[i];
				}else if(property.equals("grade")) {
					System.out.println("�������޸ĺ�����ݣ�");
					String grade=scanner.next();
					stuArray[i].grade=grade;
					updateStu= stuArray[i];
				}else if(property.equals("address")) {
					System.out.println("�������޸ĺ�����ݣ�");
					String address=scanner.next();
					stuArray[i].address=address;
					updateStu= stuArray[i];
				}else if(property.equals("telephone")) {
					System.out.println("�������޸ĺ�����ݣ�");
					long telephone=scanner.nextInt();
					stuArray[i].telephone=telephone;
					updateStu= stuArray[i];
				}else if(property.equals("email")) {
					System.out.println("�������޸ĺ�����ݣ�");
					String email=scanner.next();
					stuArray[i].email=email;
					updateStu= stuArray[i];
				}else {
					System.out.println("�Բ���,û���������!");	
				}
				
			}
		}
		return updateStu;
	}
	
	
	//
}
