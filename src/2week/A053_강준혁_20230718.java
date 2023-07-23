import java.util.Scanner;

public class A053_강준혁_20230718{
    private static int[] arr;
    private static int str=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        arr = new int[N];

        for (int i = 0; i<N; i++){

            String m = sc.next();

            switch (m){
                case "push" :
                    push(sc.nextInt());
                    break;

                case "pop" : //StringBuilder에는 append()가 있으며, 이는 문자열을 더하는 역할을 한다.
                    sb.append(pop()).append('\n');
                    break;

                case "size" :
                    sb.append(size()).append('\n');
                    break;

                case "empty" :
                    sb.append(empty()).append('\n');
                    break;

                case "top" :
                    sb.append(top()).append('\n');
                    break;

            }

        }
        System.out.println(sb);
        sc.close();
    }

    public static void push(int x){ //push 메서드
        arr[str++]= x;
    }

    public static int pop(){
        if (str<=0){
            return -1;
        }
        return arr[--str];
    }

    public static int size(){
        return str;
    }
    public static int empty() {
        if(str == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static int top(){
        if (str<=0){
            return -1;
        }
        return arr[str-1];
    }
}