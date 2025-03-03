package sth_with_cell;

public class CellDriver {

	public static void main(String[] args) {
		Cell<Integer, String> mixCell = new Cell<Integer, String>();
		Cell<Integer, Integer> integerCell = new Cell();
		
		mixCell.setValue(1,  "4");
		integerCell.setValue(45,  60);
		
		int mcType1 = mixCell.getFirstValue();
		String mcType2 = mixCell.getSecondValue();
		
		int icType1 = integerCell.getFirstValue();
		int icType2 = integerCell.getSecondValue();
		
		System.out.println(mixCell);
		System.out.println(integerCell);
		
		
		System.out.println("The numerical value is: " + mcType1 + ". The text value is: " + mcType2);

		System.out.println("The first numerical value is: " + icType1 + " and the second is: " + icType2);
	}
}
