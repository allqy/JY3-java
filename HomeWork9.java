import java.util.*;
public class HomeWork9{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入您的成绩:");
		int score=scanner.nextInt();
		if(score>100||score<0){
			System.out.print("super man");
		}else if(score>=90&&score<=100){
			System.out.print("优秀");
		}else if(score>=80&&score<90){
			System.out.print("良好");
		}else if(score<80){
			System.out.print("不及格");
		}
	}
}