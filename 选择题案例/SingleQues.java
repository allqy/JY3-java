package com.neuedu.test;

public class SingleQues extends OptionQuestion{
	//正确答案
	String ranswer;
	public SingleQues() {
	}
	public SingleQues(int id ,String text,String[] options,String ranswer) {
		this.id=id;
		this.text=text;
		this.options=options;
		this.ranswer=ranswer;
	}
	public void showQues(){
		System.out.println(this.id+"题目:"+"\t"+this.text);
		for(String opts:options) {
			System.out.print("\t"+opts);
		}
		System.out.println();
	}
	public boolean checkAnswer(String[] sanswer) {
		if(sanswer.length==0||sanswer.length>1) {
			return false;
		}else {
			return ranswer.equals(sanswer[0]);
		}	
	}
}
