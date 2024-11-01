class ArraysAndMethodsDemo{
    static void show1D(int[] nums){
        for(int s: nums){
            System.out.printf("%4d",s);
        }
        System.out.println("");
    }
    static void show2D(int[][] nums){
        for(int[] p: nums){
            show1D(p);
        }
    }
    static int[] prod(int[][] A,int[] B){
        int[] C=new int[A.length];
        for(int i=0;i<C.length;i++){
            C[i]=0;
            for(int j=0;j<B.length;j++){
                C[i]+=A[i][j]*B[j];
            }
        }
        return C;
    }
    public static void main(String[] args){
        int[][] A={{1,0,3,-1},{2,-1,-2,3},{-1,1,0,2}};

        int[] B={1,-1,3,2};
        int[] C=prod(A,B);
        System.out.println("Матрица A:");
        show2D(A);
        System.out.println("Вектор B:");
        show1D(B);
        System.out.println("Вектор C=AB:");
        show1D(C);
    }
}