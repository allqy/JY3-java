package com.neuedu.test;

public class SingleQuesTest {

	public static void main(String[] args) {
		String[] opts= {"Ñ¦Ö®Ç«","³ÂŞÈÑ¸","ÕÅ½Ü","ÁÖ¿¡½Ü"};
		String[] sanswer= {"ÁÖ¿¡½Ü"};
		SingleQues sQues=new SingleQues(1, "¸èÇú¡¶×í³à±Ú¡·ÊÇË­³ªµÄ?", opts, "ÁÖ¿¡½Ü");
		sQues.showQues();
		boolean result=sQues.checkAnswer(sanswer);
		System.out.println(result==true?"¹§Ï²Äú£¬´ğ¶ÔÁË!":"ºÜÒÅº¶£¬»Ø´ğ´íÎó!");
	}

}
