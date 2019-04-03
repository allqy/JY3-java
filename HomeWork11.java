import java.util.*;
public class HomeWork11{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
	    System.out.print("请输入您的基本工资:");
		int n=scanner.nextInt();
		int i=getSalary(n);
		System.out.print("您应得的工资为:"+i);
	}
	public static int getSalary(int i){
		if(i<=5000){
			i=(int)(i*0.86);
		}else if(i>5000&&i<=8000){
			i=(int)(i-(i-5000)*0.03-i*0.11);
		}else if(i>8000&&i<=17000){
			i=(int)(i-(i-5000)*0.1-i*0.11);
		}else if(i>17000&&i<=30000){
			i=(int)(i-(i-5000)*0.2-i*0.11);
		}else if(i>30000&&i<=40000){
			i=(int)(i-(i-5000)*0.25-i*0.11);
		}else if(i>40000&&i<=60000){
			i=(int)(i-(i-5000)*0.3-i*0.11);
		}else if(i>60000&&i<=85000){
			i=(int)(i-(i-5000)*0.35-i*0.11);
		}else if(i>85000){
			i=(int)(i-(i-5000)*0.45-i*0.11);
		}
		return i;
	}
}