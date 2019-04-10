package com.neuedu.test;

import java.util.Arrays;

public class MultiQues extends OptionQuestion{
	//正确答案
	String[] rAnswers;
	public MultiQues() {
		
	}
	public MultiQues(int id ,String text,String[] options,String[] rAnswers) {
		this.id=id;
		this.text=text;
		this.options=options;
		this.rAnswers=rAnswers;
	}
	public void printQues() {
		System.out.println(this.id+"题目:"+"\t"+this.text);
		for(String opts:options) {
			System.out.print("\t"+opts);
		}
		System.out.println();
	}
	
	//方法一
	/*public boolean checkAnswer(String[] arry) {
		return Arrays.equals(this.rAnswers, arry);
	}*/
	
	
	public boolean checkAnswer(String[] arry) {
		if(this.rAnswers.length==arry.length) {
			//System.out.println("******");
			for(int i=0;i<this.rAnswers.length;i++) {
				for(int j=0;j<arry.length;j++) {
					if(this.rAnswers[i].equals(arry[j])) {
						break;
					}
				}
				continue;
			}
			return true;
		}else {
			return false;
		}
	}
	
}
