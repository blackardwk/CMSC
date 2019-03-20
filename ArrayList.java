import java.util.ArrayList;

public class CustomerNameArrayList {

	public static void main(String[] args) {
		ArrayList<String> CustomerName = new ArrayList<String>();
		CustomerName.add("Beth");
		CustomerName.add("Jerry");
		CustomerName.add("Rick");
		CustomerName.add("Summer");
		CustomerName.add("Morty");
		
		for (String element : CustomerName) {
			System.out.println(element);
		}
			System.out.println("");
			
			
			CustomerName.add(4, "Jessica");
			CustomerName.add(3, "Rick");
			
			for (String element : CustomerName) {
				System.out.println(element);
				
			}
			
			for (int i = 0; i < CustomerName.size(); i++) {
				if (CustomerName.get(i) == "Rick") {
					CustomerName.remove(i);

				}
			}
			CustomerName.remove("Rick");
			System.out.println(CustomerName);
	}

}
