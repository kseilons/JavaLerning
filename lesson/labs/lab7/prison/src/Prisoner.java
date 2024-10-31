public class Prisoner {
    String name;
    double height;
    int years;

    Prisoner(String name, double height, int years){
        System.out.println("Привет из второго конструктора");
        this.name = name;
        this.years = years;
        this.height = height;
    }
    Prisoner(){
        this("Бубба", 1.75, 3);
        System.out.println("Привет из конструктора");
    }


    void setCrime(){
        if (years == 4) System.out.println("Он не закрыл сканнер");
        else if (years == 3) System.out.println("Запушил в develop");
    }
    void setFields(Prisoner prisoner) {
        setFields(prisoner.name, prisoner.years, prisoner.height);
    }

    void setFields(String name, int years, double height){
        this.name = name;
        this.height = height;
        this.years = years;
    }


    void showFields(){
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Years: " + years);
    }

    void showFields(boolean isTrue){
        showFields();
        if (isTrue) setCrime();
    }
}
