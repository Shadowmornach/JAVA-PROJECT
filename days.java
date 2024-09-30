import java.util.Scanner;
public class days {
public static void main (String []arg){
    Scanner scan=new Scanner(System.in);

    String MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    System.out.println("What day of the week are you on from (1-7)");

    int days=scan.nextInt();

    switch (days) {
        case 1:
            System.out.println("SUNDAY;");
            break;
            case 2:
            System.out.println("MONDAY");
            break;
            case 3:
            System.out.println("TUESDAY");
            break;
            case 4:
            System.out.println("WEDNESDAY");
            break;
            case 5:
            System.out.println("THURSDAY");
            break;
            case 6:
            System.out.println("FRIDAY");
            break;
            case 7:
            System.out.println("SATURDAY");
            break;
            
            
        
        default:
            System.out.println("INVALID ENTRY,PLEASE INPUT FROM (1-7)");
    }
        
    
}
}
