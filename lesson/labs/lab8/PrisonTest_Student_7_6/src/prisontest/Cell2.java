
package prisontest;

public class Cell2 {
    private String name;
    private boolean isOpen;
    private int securityCode;
    private int tries = 3;
    
    public Cell2(String name, boolean isOpen, int securityCode){
        this.name = name;
        this.isOpen = isOpen;
        this.securityCode = securityCode;
    }
    
    public String getName(){
        return name;
    }
    public boolean getIsOpen(){
        return isOpen;
    }
    
    public int setIsOpen(int code){
        if (tries == 0) {
            System.out.println("Количество попыток закончилось, открыть дверь не удастся");
            return 0;
        }
        if(code != securityCode){
            System.out.println("Incorrect code");
            --tries;
            return 0;
        }
        else{
            tries = 3;
            if(isOpen){
                isOpen = false;
                System.out.println("Cell " +name +" Closed");

                return -1;
            }
            else{
                isOpen = true;
                System.out.println("Cell " +name +" Open");
                return 1;
            }
        }
    }
}
