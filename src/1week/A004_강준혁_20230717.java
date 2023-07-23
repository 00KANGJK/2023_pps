import java.util.ArrayList;
import java.util.Collections;
public class A004_강준혁_20230717 {

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> divisibleNumbers = new ArrayList<>();
        for (int number : arr) {
            if (number % divisor == 0) {
                divisibleNumbers.add(number);
            }
        }

        // divisibleNumbers가 비어있다면, -1을 answer 배열에 담아 반환합니다.
        if (divisibleNumbers.isEmpty()) {
            answer = new int[]{-1};
        } else {
            // 그렇지 않다면 오름차순으로 정렬하고 answer 배열에 저장한 후 반환합니다.
            Collections.sort(divisibleNumbers);
            answer = new int[divisibleNumbers.size()];
            for (int i = 0; i < divisibleNumbers.size(); i++) {
                answer[i] = divisibleNumbers.get(i);
            }
        }
        return answer;
    }
}