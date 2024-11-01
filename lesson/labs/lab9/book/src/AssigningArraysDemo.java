class AssigningArraysDemo{
    static void show(int[] nums){
        for(int s: nums){
            System.out.print("| "+s+" ");
        }
        System.out.println("|");
    }
    public static void main(String[] args){
        int[] odd={1,3,5,7,9};
        int[] even={2,4,8,10,12,14,16};
        System.out.println("Массив odd:");
        show(odd);
        System.out.println("Массив even:");
        show(even);
        System.out.println("Выполняется присваивание.");
        even=odd;
        even[0]=-1;
        System.out.println("Массив odd:");
        show(odd);
        System.out.println("Массив even:");
        show(even);
    }
}