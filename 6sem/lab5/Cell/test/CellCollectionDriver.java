package test;

public class CellCollectionDriver {
	public static void main(String[] args) {
		CellCollection cells = new CellCollection(5);
		
		cells.add(new Cell());
		cells.add(new Cell());
		
		System.out.println(cells.get(0));
		System.out.println(cells.get(1));
		
		cells.get(0).setValue("First Cell");
		cells.get(1).setValue("Second Cell");
		
		System.out.println(cells.get(0));
		System.out.println(cells.get(1));
	}
}
