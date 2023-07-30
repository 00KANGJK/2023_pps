import java.util.*;

public class A131_강준혁_20230726 {

    public static int N;
    public static int[] array;

    public static int getAverage() {
        double avg = (double) Arrays.stream(array).sum() / N;
        return (int) Math.round(avg);
    }

    public static int countFreq() {
        Map<Integer, Integer> mp = new HashMap<>();

        if (N == 1) {
            return array[0];
        }

        for (int i = 0; i < N; i++) {
            mp.put(array[i], mp.getOrDefault(array[i], 0) + 1);
        }

        List<Integer> freqNums = new ArrayList<>();
        int maxValue = 0;

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                freqNums.clear();
                freqNums.add(entry.getKey());
            } else if (entry.getValue() == maxValue) {
                freqNums.add(entry.getKey());
            }
        }
        Collections.sort(freqNums);

        return freqNums.size() > 1 ? freqNums.get(1) : freqNums.get(0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println(getAverage());
        Arrays.sort(array);
        System.out.println(array[N / 2]);
        System.out.println(countFreq());
        System.out.println(array[N - 1] - array[0]);
        scan.close();
    }
}
