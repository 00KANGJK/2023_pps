import java.util.Scanner;

class A107_강준혁_20230720 {
    public static void main(String[] args) {
        Main stepG = new Main();
        stepG.g01();
    }

    void g01() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int[] arr = new int[1001];
        int i, j;
        int k=1;
        int sum=0;

        for(i=1; i<=1000; i++){
            for(j=1; j<=i; j++){
                if(k==1001){
                    break;
                }
                arr[k]=i;
                k++;
            }
        }

        for(i=a; i<=b; i++){
            sum+=arr[i];
        }
        System.out.print(sum);
    }
}