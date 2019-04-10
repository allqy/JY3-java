package com.neuedu.test;

public class MultiQuesTest {

	public static void main(String[] args) {
		String[] options= {"int","String","char","boolean","enum"};
		String[] rAnswers= {"String","enum"};
		String[] stuAnswer= {"enum","String"};
		MultiQues mulQues=new MultiQues(2, "以下哪些不属于java的基本数据类型", options,rAnswers);
		mulQues.printQues();
		boolean result=mulQues.checkAnswer(stuAnswer);
		System.out.println(result==true?"恭喜您答对了!":"很遗憾，答错了!");
	}

}
