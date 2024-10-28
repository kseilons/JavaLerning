package prisontest;

public class Cell {
    private String name;
    private int pin;
    private Boolean isOpen;

    Cell(String name, Boolean isOpen, int pin) {
        this.name = name;
        this.isOpen = isOpen;
        this.pin = pin;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
        if (isOpen) {
            System.out.println("Дверь открыта");
        } else {
            System.out.println("Дверь закрыта");
        }
    }

    public void openCell(int pin) {
        if (pin != this.pin) {
            System.out.println("Неверный ПИН-код");
        } else {
            setIsOpen(!this.isOpen);
        }
    }
}

//    Cell(String name, Boolean isOpen) {
//        this.name = name;
//        this.isOpen = isOpen;
//    }