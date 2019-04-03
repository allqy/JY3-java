public class ConfirmCode{
	static int numArray[]={6,9,2,1,1,6,8,5,1,1,2,8};
	public static void main(String[] args){
		int oSum=oddSum();
		int eSum=evenSum();
		int sum=oSum+eSum*3;
		int remainder=sum%10;
		int subNum=10-remainder;
		int confirmNum=subNum%10;
		System.out.println("Ğ£ÑéÂëÎª:"+confirmNum);
	}
	public static int oddSum(){
		int oSum=0;
		for(int i=1;i<=11;i=i+2){
			oSum+=numArray[i];
		}
		return oSum;
	}
	public static int evenSum(){
		int eSum=0;
		for(int i=0;i<=10;i=i+2){
			eSum+=numArray[i];
		}
		return eSum;
	}
}