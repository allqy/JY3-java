package com.neuedu.test;

public class SingleQuesTest {

	public static void main(String[] args) {
		String[] opts= {"Ѧ֮ǫ","����Ѹ","�Ž�","�ֿ���"};
		String[] sanswer= {"�ֿ���"};
		SingleQues sQues=new SingleQues(1, "���������ڡ���˭����?", opts, "�ֿ���");
		sQues.showQues();
		boolean result=sQues.checkAnswer(sanswer);
		System.out.println(result==true?"��ϲ���������!":"���ź����ش����!");
	}

}
