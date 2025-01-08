package q9498;


import java.util.Scanner;
public class Main {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
	        
	        int inputNum = sc.nextInt();
	        sc.close();
	        
	        if(inputNum>101)
	        {
	        	System.out.println("error");
	        }
	        else if(inputNum>=90)
	        {
	        	System.out.println('A');
	        }
	        else if(inputNum>=80)
	        {
	        	System.out.println('B');
	        }
	        else if(inputNum>=70)
	        {
	        	System.out.println('C');
	        }
	        else if(inputNum>=60)
	        {
	        	System.out.println('D');
	        }
	        else
	        {
	        	System.out.println('F');
	        }
	        /*switch(inputNum/10)
	        {
	        case 9:System.out.println('A');break;
	        case 8:System.out.println('B');break;
	        case 7:System.out.println('C');break;
	        case 6:System.out.println('D');break;
	        default:System.out.println('F');break;
	        }*/
		}
	}


