import java.util.ArrayList;


public class Sorting {
	
	protected static ArrayList<String> userInput = new ArrayList<String>();
	
	protected static void reverse(ArrayList<String> array) {
		
		for(int i = 0; i < array.size(); i ++) {
			String element = array.get(i);
			String setter = "";
			for(int k = 0; k < element.length(); k++){
				char temp = element.charAt(element.length()- k - 1);
				setter += temp;
			}
			
			array.set(i, setter);
		}
	}
	
	protected static void alphabetize(ArrayList<String> array) {
		
		int length = array.size();
		for(int i = 0; i < length; i++){
			int minIndex = i;
			for(int j = i+1; j < length; j++){
				String indexI = array.get(i);
				String indexJ = array.get(j);
				if(indexJ.compareTo(indexI) < 0) {
					minIndex = j;
				}
			}
			
			String temp = array.get(i);
			array.set(i, array.get(minIndex));
			array.set(minIndex, temp);
		}
		
		userInput = array;
		
	}

	protected static void print(ArrayList<String> array) {
		for(String line : array){
			System.out.println(line);
		}
	}
		
}
