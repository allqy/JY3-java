package com.neuedu.studentManageSystem;

import java.util.Arrays;
import java.util.Scanner;

public class StudentClient {
	static String defaultAdminName="admin";
	static String defaultAdminPwd="admin";
	Admin defaultAdmin=new Admin(defaultAdminName, defaultAdminPwd);
	Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		StudentClient sc=new StudentClient();
		sc.login();
	}
	//����Ա��¼����
	public void login() {
		System.out.println("****************��ӭ��¼ѧ����Ϣ����ϵͳ****************");
		System.out.println("1.��¼         2.�˳�");
		System.out.println("********************************************************");
		System.out.println("��ѡ��");
		int result =scanner.nextInt();
		switch (result) {
		case 1:
			System.out.println("��ӭ��¼��");
			System.out.println("�������û�����");
			String adminName=scanner.next();
			System.out.println("���������룺");
			String adminPwd=scanner.next();
			Admin admin =new Admin(adminName, adminPwd);
			if(admin.aName.equals(defaultAdmin.aName)&&admin.aPwd.equals(defaultAdmin.aPwd)) {
				System.out.println("��¼�ɹ���");
				System.out.println("��ӭ����"+admin.aName);
				clientMainPage();
			}else {
				System.out.println("�û��������벻��ȷ�������µ�¼��");
				login();
			}
			break;
		case 2:
			System.exit(0);
			break;
		default:
			System.out.println("�������ֲ�����Ҫ�����������룡");
			login();
			break;
		}
	}
	
	//�ͻ���������
	public void clientMainPage() {
		System.out.println("****************��ѡ��Ҫ��������Ϣ��Ӧ����****************");
		System.out.println("*1.�鿴ѧ����Ϣ     2.���ѧ����Ϣ    3.ɾ��ѧ����Ϣ    4.�޸�ѧ����Ϣ    5.�˳�    *");
		System.out.println("********************************************************");
		System.out.println("��ѡ��");
		int result =scanner.nextInt();
		switch (result) {
		case 1:
			selectStuMsgPage();
			break;
		case 2:
				System.out.println("****************���ѧ����Ϣ****************");
				defaultAdmin.addOneStudent(scanner);
				System.out.println("�������ݳɹ���ϵͳ���Զ������ϼ�Ŀ¼��");
				clientMainPage();
			break;
		case 3:
			delStuPage();
			break;
		case 4:
			updateStuMsgPage();
			break;
		case 5:
			System.out.println("���˳���");
			System.exit(0);
			break;
		default:
			System.out.println("�������ֲ�����Ҫ�����������룡");
			clientMainPage();
		}
		
	}
	//��ѯѧ����Ϣ����
	public void selectStuMsgPage() {
		System.out.println("********************************************************");
		System.out.println("*1.�鿴����ѧ����Ϣ     2.����ID��ѯѧ����Ϣ    3.����ID��ѯѧ������    4.������һ��    *");
		System.out.println("********************************************************");
		System.out.println("��ѡ��");
		int result =scanner.nextInt();
		switch (result) {
		case 1:
			defaultAdmin.showAllStuMsg();
			System.out.println("���ݲ�ѯ��ϣ�ϵͳ���Զ������ϼ�Ŀ¼��");
			selectStuMsgPage();
			break;
		case 2:
			System.out.println("������Ҫ��ѯ��ѧ��id:");
			int id =scanner.nextInt();
			defaultAdmin.selectStuByID(id);
			System.out.println("���ݲ�ѯ��ϣ�ϵͳ���Զ������ϼ�Ŀ¼��");
			selectStuMsgPage();
			break;
		case 3:
			System.out.println("������Ҫ��ѯ��ѧ��id:");
			int sId =scanner.nextInt();
			System.out.println("ѧ��Ϊ"+sId+"��ѧ������:");
			System.out.println(defaultAdmin.selectStuNameByID(sId));
			System.out.println("���ݲ�ѯ��ϣ�ϵͳ���Զ������ϼ�Ŀ¼��");
			selectStuMsgPage();
			break;
		case 4:
			clientMainPage();
			break;
		default:
			System.out.println("�������ֲ�����Ҫ�����������룡");
			selectStuMsgPage();
		}
	}
	//ɾ��ѧ������
	public void delStuPage() {
		System.out.println("********************************************************");
		System.out.println("*1.����IDɾ��ѧ����Ϣ     2.����ѧ������ɾ��ѧ����Ϣ    3.������һ��   *");
		System.out.println("********************************************************");
		System.out.println("��ѡ��");
		int result =scanner.nextInt();
		switch (result) {
		case 1:
			System.out.println("������Ҫɾ����ѧ��id:");
			int id =scanner.nextInt();
			Student[] stuArray=defaultAdmin.delStuByID(id);
			System.out.println("ʣ��ѧ����Ϣ:");
			System.out.println(Arrays.toString(stuArray));
			System.out.println("ɾ���ɹ�!");
			System.out.println("ϵͳ���Զ������ϼ�Ŀ¼......");
			delStuPage();
			break;
		case 2:
			System.out.println("������Ҫɾ��ѧ��������:");
			String stuName=scanner.next();
			Student[] stuArray1=defaultAdmin.delStuByName(stuName);
			System.out.println("ʣ��ѧ����Ϣ:");
			System.out.println(Arrays.toString(stuArray1));
			System.out.println("ɾ���ɹ�!");
			System.out.println("ϵͳ���Զ������ϼ�Ŀ¼......");
			delStuPage();
			break;
		case 3:
			clientMainPage();
			break;
		default:
			System.out.println("�������ֲ�����Ҫ�����������룡");
			delStuPage();
		}
	}
	
	//�޸�ѧ����Ϣ����
	public void updateStuMsgPage() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("*1.����ID�޸�ѧ��ȫ����Ϣ    2.����ID�޸�ѧ��������Ϣ   3.�����ϼ�Ŀ¼    4.ϵͳ�˳�   *");
		System.out.println("-----------------------------------------------------------");
		System.out.println("��ѡ��");
		int result =scanner.nextInt();
		switch (result) {
		case 1:
			defaultAdmin.updateStuAllMsgByID(scanner);
			System.out.println("�޸ĳɹ�");
			System.out.println("ϵͳ���Զ������ϼ�Ŀ¼......");
			updateStuMsgPage();
			break;
		case 2:
			defaultAdmin.updateStuSomeMsgByID(scanner);
			System.out.println("�޸ĳɹ�");
			System.out.println("ϵͳ���Զ������ϼ�Ŀ¼......");
			updateStuMsgPage();
			break;
		case 3:
			clientMainPage();
			break;
		case 4:
			System.out.println("���˳���");
			System.exit(0);
			break;
		default:
			System.out.println("�������ֲ�����Ҫ�����������룡");
			updateStuMsgPage();
		}
	}
}
