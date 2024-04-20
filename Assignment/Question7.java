public class Question7{
	public static void main(String []args){
		int n=5;
		//outer loop
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				int sum = i+j;
				if(sum%2==0){
				System.out.print("1");
				}
				else{
				System.out.print("0");
					}
				}
				System.out.println();
			}
		}
	}
//Output-
//D:\CDAC\Assignment>javac Question7.java

//D:\CDAC\Assignment>java Question7
//10101
//01010
//10101
//01010
//10101