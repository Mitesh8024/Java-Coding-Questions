public class Question8{
	public static void main(String []args){
		int n=5;
		//outer loop
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(j%2==0){
				System.out.print("0");
				}
				else{
				System.out.print("1");
					}
				}
				System.out.println();
			}
		}
	}
//Output-
//D:\CDAC\Assignment>javac Question8.java

//D:\CDAC\Assignment>java Question8
//1
//10
//101
//1010
//10101