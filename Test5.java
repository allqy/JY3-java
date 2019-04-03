import java.lang.*;
public class Test5{
	public static void main(String[] args){
		int n1=0;
		int n2=0;
		int n3=0;
		int n4=0;
		for(int i=0;i<=9988;i++){
			n1=i/1000;
			n2=(i%1000)/100;
			n3=((i%1000)%100)/10;
			n4=((i%1000)%100)%10;
			if(n1==n2&&n3==n4&&n1!=n3){
				System.out.println("该数为:"+i+"    该数开方结果为:"+Math.sqrt(i));
			}
		}
	}
}