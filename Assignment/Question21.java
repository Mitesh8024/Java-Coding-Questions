public class Question21{
	public static void main(String []args){
		int n=7;
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
//D:\CDAC\Assignment>java Question21
//1
//10
//101
//1010
//10101
//101010
//1010101

//D:\CDAC\Assignment>