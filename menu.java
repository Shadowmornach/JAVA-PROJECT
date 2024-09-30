
    import java.util.Scanner;
    public class menu {
public static void main (String []arg){
    Scanner scan=new Scanner(System.in);

    final String MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    System.out.println("Menu of day from (sunday-saturday)");

    String days=scan.nextLine().toUpperCase();

    switch (days) {
        case"SUNDAY" :
            System.out.println("MORNING:tea and samosa");
            System.out.println("LUNCH:Ugali and sukuma");
            System.out.println("SUPPER:chapati and beans");
            break;
            case "MONDAY":
            System.out.println("MORNING:Coffee and mandazi");
            System.out.println("LUNCH:Kitheri");
            System.out.println("SUPPER:Mseto");
            break;
            case "TUESDAY":
            
            System.out.println("MORNING:tea and chapati");
            System.out.println("LUNCH:pilau");
            System.out.println("SUPPER:Biriani");
            break;
            case "WEDNESDAY":
            System.out.println("MORNING:Black tea and bread");
            System.out.println("LUNCH:Ugali and meat");
            System.out.println("SUPPER:chips and samosa");
            break;
            case "THURSDAY":
            System.out.println("MORNING:Tea and pancakes");
            System.out.println("LUNCH:Mokimo");
            System.out.println("SUPPER:indomie");
            break;
            case "FRIDAY":
            System.out.println("MORNING:juice and cakes");
            System.out.println("LUNCH:Ugali and chicken");
            System.out.println("SUPPER:rice and beans");
            break;
            case "SATURDAY":
            System.out.println("MORNING:Tea and bread ");
            System.out.println("LUNCH:Mseto");
            System.out.println("SUPPER:inama");
            break;
            
            
        
        default:
            System.out.println("INVALID ENTRY,PLEASE INPUT NAME OF THE DAY");
    }
        
    
}
}



