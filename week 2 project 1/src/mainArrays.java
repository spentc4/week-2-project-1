import java.util.*;
import java.util.Arrays;
public class mainArrays implements week2project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] ar1 = new int[10];
        for(int i = 0; i <  ar1.length; i++) {
            ar1[i] = (int)(Math.random() * 100);
            System.out.print(ar1[i] + "  ");
        }
        System.out.println("\n here is a list if 10 numbers put into a bag select which one you want to remove");

        Scanner scanner = new Scanner(System.in);
        int inputString = scanner.nextInt();
        
        switch (inputString) {
        case 1:
        	ar1[0] = 0;
        	break;
        case 2:
        	ar1[1] = 0;
        	break;
        case 3:
        	ar1[2] = 0;
        	break;
        case 4:
        	ar1[3] = 0;
        	break;
        case 5:
        	ar1[4] = 0;
        	break;
        case 6:
        	ar1[5] = 0;
        	break;
        case 7:
        	ar1[6] = 0;
        	break;
        case 8:
        	ar1[7] = 0;
        	break;
        case 9:
        	ar1[8] = 0;
        	break;
        case 10:
        	ar1[9] = 0;
        	break;
        	
        }
        for(int i = 0; i <  ar1.length; i++) {
            System.out.print(ar1[i] + "  ");
        }
        
        System.out.println("what do you want to replace that number with?");
        
        Scanner scanner1 = new Scanner(System.in);
        int inputString1 = scanner.nextInt();
        
        switch (inputString1) {
        case 1:
        	ar1[inputString-1] = inputString1;
        	break;
        case 2:
        	ar1[inputString-1] = inputString1;        	
        	break;
        case 3:
        	ar1[inputString-1] = inputString1;        	
        	break;
        case 4:
        	ar1[inputString-1] = inputString1;        	
        	break;
        case 5:
        	ar1[inputString-1] = inputString1;        	
        	break;
        case 6:
        	ar1[inputString-1] = inputString1;        	
        	break;
        case 7:
        	ar1[inputString-1] = inputString1;        	
        	break;
        case 8:
        	ar1[inputString-1] = inputString1;        	
        	break;
        case 9:
        	ar1[inputString-1] = inputString1;        	
        	break;
        case 10:
        	ar1[inputString-1] = inputString1;        	
        	break;
        	
        }
        for(int i = 0; i <  ar1.length; i++) {
            System.out.print(ar1[i] + "  ");
        }


	}

	

}
