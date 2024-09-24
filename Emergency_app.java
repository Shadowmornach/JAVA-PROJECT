
    import java.util.Scanner;

    public class Emergency_app {

    static String intensity = "( 1. low / 2. high / 3. extreamlly high)";
    static String thanx_message = "Thank you for reaching out to us concerned citizen. ";
    static String fire_truck = "fire department team";
    static String meds = "medical team";
    static String feds = "police";

    static Scanner scanner = new Scanner(System.in);
    
    //fire method
    static void fire() {
        System.out.println("Location of fire: ");
        String fire_location = scanner.nextLine();

        System.out.println("Magnitude of the fire " + intensity + " enter your choice either 1, 2 or 3:");
        String fire_severity = scanner.nextLine();

        System.out.println("Number of casualties: ");
        String people_affected = scanner.nextLine();

        System.out.println( thanx_message + " the " + fire_truck + " and " + meds + "are on their way to " + fire_location + ", within 10 to 30 minutes.");
    }
 

    // floods method
    static void flood() {
        System.out.println("Accident area: ");
        String affected_area = scanner.nextLine();

        System.out.println("Water levels " + intensity + " : ");
        String water_levels = scanner.nextLine();

        System.out.println("Number of casualties: ");
        String flood_casualties = scanner.nextLine();

        System.out.println( thanx_message + " to " + affected_area + ", within 10 to 30 minutes.");
    }

    //accident method 
     static void accident() {
        System.out.println("location of the accident: ");
        String accident_area = scanner.nextLine();
    
        System.out.println("Type of accident ( vehicle, workplace, e.t.c. ): ");
        String accident_type = scanner.nextLine();

        System.out.println("Number of casualties: ");
        String accident_casualties = scanner.nextLine();

        System.out.println(thanx_message + " The " + meds + ", " + fire_truck +" and "+ feds + " are on their way to " + accident_area + ".");
     }
    // death method 
     static void death() {
        System.out.println("Cause of death: ");
        String death_cause = scanner.nextLine();
    
        System.out.println("Name of deceased. If the deceased is uknown, type unknown and if you know their name, then input their name : ");
        String deceased_name = scanner.nextLine();

        System.out.println("contact of the deceased next of kin: ");
        String deceased_relative_contact_num = scanner.nextLine();

        if ( deceased_name.toUpperCase().equals("UNKWOWN")) {
            System.out.println("Our deepest condolences to family and friend of deceased");
        } 
        else {
            System.out.println("Our deepest condolences to family and friend of " + deceased_name); 
        }

        
     }

    // theft method 
     static void theft() {
        System.out.println("location of the theft: ");
        String theft_area = scanner.nextLine();
    
        System.out.println("Time of theft: ");
        String theft_time = scanner.nextLine();

        System.out.println("Items stolen: ");
        String stolen_items = scanner.nextLine();

        System.out.println("Any information to aid the investigation: ");
        String important_information = scanner.nextLine();

        System.out.println(thanx_message + " The "+ feds + " are on their way to " + theft_area + ".");
     }

     
    // disease outbreak
     static void disease_outbreak() {

        System.out.println("The affect area of disease: ");
        String disease_area = scanner.nextLine();

        System.out.println("type of disease: ");
        String affected_organism = scanner.nextLine();
    
        System.out.println("Intensity of disease " + intensity + " : ");
        String disease_intensity = scanner.nextLine();

        System.out.println("Number of casualties: ");
        String disease_casualties = scanner.nextLine();

        System.out.println(thanx_message + " The " + meds + ", " + " and "+ feds + " are on their way to " + disease_area + ".");
     }
     

     static void power_outage() {
        System.out.println("The affect area: ");
        String power_area = scanner.nextLine();

        System.out.println("cause of the power outage: ");
        String power_cause = scanner.nextLine();
    
        System.out.println("Intensity of disease " + intensity + " : ");
        String power_intensity = scanner.nextLine();

        System.out.println("duration the power outage: ");
        String duration = scanner.nextLine();

     } 

     static void riot(){
        System.out.println("riot location: ");
        String riot_area = scanner.nextLine();

        System.out.println("severty of violence: ");
        String riot_violence = scanner.nextLine();
    
        System.out.println("Number of casualties:");
        String riot_casualties = scanner.nextLine();

        System.out.println("any information about the riot : ");
        String riot_info = scanner.nextLine();
     } 

     static void wild_animal_attack(){   
        System.out.println("location: ");
        String area = scanner.nextLine();

        System.out.println("type of animal: ");
        String affected_organism = scanner.nextLine();
    
        System.out.println("people affected:");
        String people_affected = scanner.nextLine();

       
         }


     static void earth_quake(){
        System.out.println("location: ");
        String area = scanner.nextLine();

        System.out.println("magnitude of the earthquake :");
        String affected_organism = scanner.nextLine();
    
        System.out.println("number of casualties within the area");
        String earthquake_casualties = scanner.nextLine();
        
     } 

     static void missing_person(){

        System.out.println("location: ");
        String client_location = scanner.nextLine();

        System.out.println("Name of the missing person: ");
        String name= scanner.nextLine();

        System.out.println("age of the missing person :");
        String persons_age = scanner.nextLine();
    
        System.out.println("when was he/she last seen ");
        String last_seen = scanner.nextLine();
        System.out.println("any information that may be used to condact the investigation");
        String information=scanner.nextLine();
        

     } 


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        

        while (true) { 
            System.out.println("Welcome. Please input the emergency type from options below (1-10):");
            System.out.println("1. Fire.");
            System.out.println("2. Floods.");
            System.out.println("3. Accident.");
            System.out.println("4. Death.");
            System.out.println("5. Theft.");
            System.out.println("6. Disease outbreak.");
            System.out.println("7. Power outage.");
            System.out.println("8. Riot.");
            System.out.println("9. Wild animal attack.");
            System.out.println("10. Earthquake.");
            System.out.println("11. Missing person.");

        String emergency_type = scanner.nextLine();

        switch (emergency_type) {
            case "1":
            fire();
            break;

            case "2":
                flood();
                break;

            case "3":
                accident();
                break;
            case "4":
                death();
                break;
            case "5":
                theft();
                break;
            case "6":
                disease_outbreak();
                break;
            case "7":
               power_outage();
                break;
            case "8":
                riot();
                break;
            case "9":
            wild_animal_attack();
                break;
            case "10":
            earth_quake();
                break;

            case "11":
            missing_person();
                break;

            default:
            
                throw new AssertionError();
        }

        }

        
    }
}

    

