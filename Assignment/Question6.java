public class Question6{
	public static void main(String []args){
		int n=5;
		//outer loop
		for(int i=1;i<=n;i++){
			for(int j=i;j>=1;j--){
				System.out.print(j+" ");
				}
				System.out.println();
			}
		}
	}
	
//Output
//D:\CDAC\Assignment>javac Question6.java

//D:\CDAC\Assignment>java Question6
//1
//2 1
//3 2 1
//4 3 2 1
//5 4 3 2 1
 