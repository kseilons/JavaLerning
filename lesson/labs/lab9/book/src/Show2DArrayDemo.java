class Show2DArrayDemo{
    static void show(int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        int[][] alpha={{1,2,3},{4,5,6}};
        int[][] bravo={{1,2,3},{4,5},{6,7,8,9}};
        System.out.println("Массив alpha:");
        show(alpha);
        System.out.println("Массив bravo:");
        show(bravo);
    }
}
