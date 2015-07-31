import java.util.Scanner;

public class SortMain extends Sorting {

	public static void main(String[] args) {
		
		System.out.println("Type in a word: Enter \"-h if you need help. ");
		Scanner scan = new Scanner(System.in);
		String input = "";
		
		boolean reverse = false;
		
		while(scan.hasNext()){
			input = scan.nextLine();
		
			if(input.contains("-r")){
				reverse = true;
				break;
			}
			
			else if(input.contains("-q")){
				break;
			}
			
			else if(input.contains("-h")) {
				System.out.println("Need some help? "
						+ "Don't worry!\nThe commands are: \n "
						+ "\n-r\": Reverses the word \n" 
						+ "\n-q\": Quits and terminates\n");
			}
			
			else {
				userInput.add(input.toLowerCase());
			}
		}
		scan.close();
		
		if(reverse){
			reverse(userInput);
			print(userInput);
		}
		
		else{
			print(userInput);
		}
		
		System.out.println("--------------------------");
		System.out.println("Thank You for using Sorter");
		System.out.println("--------------------------");
		
	}

}
