package com.neuedu.test;

public class MultiQuesTest {

	public static void main(String[] args) {
		String[] options= {"int","String","char","boolean","enum"};
		String[] rAnswers= {"String","enum"};
		String[] stuAnswer= {"enum","String"};
		MultiQues mulQues=new MultiQues(2, "������Щ������java�Ļ�����������", options,rAnswers);
		mulQues.printQues();
		boolean result=mulQues.checkAnswer(stuAnswer);
		System.out.println(result==true?"��ϲ�������!":"���ź��������!");
	}

}
