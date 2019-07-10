import java.util.Scanner;
class DivisibleNumbers{
	public static void main(String args[]){
	if (args.length!=3){
		System.out.println("invalid number of arguments");
		System.out.println("DivisibleNumbers <n1> <n2> <n> \n where program will print all numbers in range n1-n2 divisible by n");
	}
	int n1=Integer.parseInt(args[0]);
	int n2=Integer.parseInt(args[1]);
	int n=Integer.parseInt(args[2]);
	
	for(int i=n1;i<=n2;i++)
	{
		if(i%n==0)
			System.out.println(i);
	}
	
	}
}
