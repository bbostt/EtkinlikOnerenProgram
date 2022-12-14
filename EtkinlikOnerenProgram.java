import java.util.Scanner;
public class EtkinlikOnerenProgram {

	public static void main(String[] args) {
		int heat;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sýcaklýk giriniz : ");
		heat = input.nextInt();
		
		if(heat < 5) {
			System.out.println("Kayak yapabilirsiniz");
		}
		else if(heat >=5 && heat <= 15) {
			System.out.println("Sinemaya gidebilirsiniz");
		}
		else if(heat > 15 && heat <=25) {
			System.out.println("Pikniðe gidebilirsiniz");
		}
		else if(heat > 25) {
			System.out.println("Du kannst schwimmen gehen");
		}

	}

}
