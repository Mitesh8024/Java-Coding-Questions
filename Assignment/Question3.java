public class Question3{
	public static void main(String []args){
		int n=5;
		int num=1;
		//outer loop
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
				num++;//num = num+1
				}
				System.out.println();
			}
		}
	}
//Output-
//D:\CDAC\Assignment>javac Question3.java

//D:\CDAC\Assignment>java Question3
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
