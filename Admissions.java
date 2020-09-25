import java.util.Scanner;

public class Admissions {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Last name: ");
        String name = scanner.nextLine();
		System.out.print("Enter SAT score: ");
        int sat = scanner.nextInt();
        System.out.print("Enter class rank: ");
        int rank = scanner.nextInt();
        System.out.print("Enter Award amount: ");
        int awards = scanner.nextInt();
        System.out.print("Enter Residence: ");
        String residence = scanner.nextLine();

		if (sat >= 1500 || rank >= 95 || awards >= 10 || residence == "Colorado"){
            System.out.println("Accepted because one category is elite");
        } else if (sat >= 1400 && rank >= 90 || sat >= 1400 && awards >= 8 || rank >= 90 && awards >= 8){
            System.out.println("Accepted because 2 or more metrics is solid");
        } else if ("Padjen".equals(name)){
            System.out.println("Accepted because name is Padjen");
        } else if (sat >= 1200 && rank >= 85 && awards >= 3 && residence != "Florida"){
            System.out.println("Accepted because no metric is lower than acceptable");
        } else {
            System.out.println("Not accepted");
        }


	}	
}