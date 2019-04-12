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
	//管理员登录界面
	public void login() {
		System.out.println("****************欢迎登录学生信息管理系统****************");
		System.out.println("1.登录         2.退出");
		System.out.println("********************************************************");
		System.out.println("请选择：");
		int result =scanner.nextInt();
		switch (result) {
		case 1:
			System.out.println("欢迎登录！");
			System.out.println("请输入用户名：");
			String adminName=scanner.next();
			System.out.println("请输入密码：");
			String adminPwd=scanner.next();
			Admin admin =new Admin(adminName, adminPwd);
			if(admin.aName.equals(defaultAdmin.aName)&&admin.aPwd.equals(defaultAdmin.aPwd)) {
				System.out.println("登录成功！");
				System.out.println("欢迎您，"+admin.aName);
				clientMainPage();
			}else {
				System.out.println("用户名或密码不正确，请重新登录！");
				login();
			}
			break;
		case 2:
			System.exit(0);
			break;
		default:
			System.out.println("输入数字不符合要求，请重新输入！");
			login();
			break;
		}
	}
	
	//客户端主界面
	public void clientMainPage() {
		System.out.println("****************请选择要操作的信息对应数字****************");
		System.out.println("*1.查看学生信息     2.添加学生信息    3.删除学生信息    4.修改学生信息    5.退出    *");
		System.out.println("********************************************************");
		System.out.println("请选择：");
		int result =scanner.nextInt();
		switch (result) {
		case 1:
			selectStuMsgPage();
			break;
		case 2:
				System.out.println("****************添加学生信息****************");
				defaultAdmin.addOneStudent(scanner);
				System.out.println("保存数据成功，系统将自动返回上级目录！");
				clientMainPage();
			break;
		case 3:
			delStuPage();
			break;
		case 4:
			updateStuMsgPage();
			break;
		case 5:
			System.out.println("已退出！");
			System.exit(0);
			break;
		default:
			System.out.println("输入数字不符合要求，请重新输入！");
			clientMainPage();
		}
		
	}
	//查询学生信息界面
	public void selectStuMsgPage() {
		System.out.println("********************************************************");
		System.out.println("*1.查看所有学生信息     2.根据ID查询学生信息    3.根据ID查询学生姓名    4.返回上一层    *");
		System.out.println("********************************************************");
		System.out.println("请选择：");
		int result =scanner.nextInt();
		switch (result) {
		case 1:
			defaultAdmin.showAllStuMsg();
			System.out.println("数据查询完毕，系统将自动返回上级目录！");
			selectStuMsgPage();
			break;
		case 2:
			System.out.println("请输入要查询的学生id:");
			int id =scanner.nextInt();
			defaultAdmin.selectStuByID(id);
			System.out.println("数据查询完毕，系统将自动返回上级目录！");
			selectStuMsgPage();
			break;
		case 3:
			System.out.println("请输入要查询的学生id:");
			int sId =scanner.nextInt();
			System.out.println("学号为"+sId+"的学生姓名:");
			System.out.println(defaultAdmin.selectStuNameByID(sId));
			System.out.println("数据查询完毕，系统将自动返回上级目录！");
			selectStuMsgPage();
			break;
		case 4:
			clientMainPage();
			break;
		default:
			System.out.println("输入数字不符合要求，请重新输入！");
			selectStuMsgPage();
		}
	}
	//删除学生界面
	public void delStuPage() {
		System.out.println("********************************************************");
		System.out.println("*1.根据ID删除学生信息     2.根据学生姓名删除学生信息    3.返回上一层   *");
		System.out.println("********************************************************");
		System.out.println("请选择：");
		int result =scanner.nextInt();
		switch (result) {
		case 1:
			System.out.println("请输入要删除的学生id:");
			int id =scanner.nextInt();
			Student[] stuArray=defaultAdmin.delStuByID(id);
			System.out.println("剩余学生信息:");
			System.out.println(Arrays.toString(stuArray));
			System.out.println("删除成功!");
			System.out.println("系统将自动返回上级目录......");
			delStuPage();
			break;
		case 2:
			System.out.println("请输入要删除学生的姓名:");
			String stuName=scanner.next();
			Student[] stuArray1=defaultAdmin.delStuByName(stuName);
			System.out.println("剩余学生信息:");
			System.out.println(Arrays.toString(stuArray1));
			System.out.println("删除成功!");
			System.out.println("系统将自动返回上级目录......");
			delStuPage();
			break;
		case 3:
			clientMainPage();
			break;
		default:
			System.out.println("输入数字不符合要求，请重新输入！");
			delStuPage();
		}
	}
	
	//修改学生信息界面
	public void updateStuMsgPage() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("*1.根据ID修改学生全部信息    2.根据ID修改学生部分信息   3.返回上级目录    4.系统退出   *");
		System.out.println("-----------------------------------------------------------");
		System.out.println("请选择：");
		int result =scanner.nextInt();
		switch (result) {
		case 1:
			defaultAdmin.updateStuAllMsgByID(scanner);
			System.out.println("修改成功");
			System.out.println("系统将自动返回上级目录......");
			updateStuMsgPage();
			break;
		case 2:
			defaultAdmin.updateStuSomeMsgByID(scanner);
			System.out.println("修改成功");
			System.out.println("系统将自动返回上级目录......");
			updateStuMsgPage();
			break;
		case 3:
			clientMainPage();
			break;
		case 4:
			System.out.println("已退出！");
			System.exit(0);
			break;
		default:
			System.out.println("输入数字不符合要求，请重新输入！");
			updateStuMsgPage();
		}
	}
}
