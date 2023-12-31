import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    /**
     * 람다식 활용
     *
     * @param strLength 점수의 개수
     * @param scores 점수 배열
     * @return
     */
    public String solution(int strLength, int [] scores) {
        return IntStream.range(0, strLength)
                .mapToObj(i -> (int) IntStream.range(0, strLength).filter(j -> scores[i] < scores[j]).count() + 1)
                .map(Object::toString)
                .reduce((a, b) -> a + " " + b)
                .orElse("");
    }

    /**
     * 첫번째 시도
     *
     * @param strLength 점수의 개수
     * @param scores 점수 배열
     * @return 등수 String
     */
    public String solution2(int strLength, int [] scores) {

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<strLength; i++) {
            int deongSu = 1;

            for (int j=0; j<strLength; j++) {
                if (scores[i] < scores[j]) {
                    deongSu ++;
                }
            }
            sb.append(deongSu + " ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Main t = new Main();

        Scanner sc = new Scanner(System.in);

        int strLength = sc.nextInt();
        int[] scores = new int[strLength];

        for (int i = 0; i < strLength; i++) {
            scores[i] = sc.nextInt();
        }

        System.out.println(t.solution(strLength, scores));
    }
}
