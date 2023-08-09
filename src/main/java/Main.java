import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String result = "";

        String[] list  = str.split(" ");

        for (int i = 0; i < list.length; i ++) {
            if (list[i].length() > result.length()) {
                result = list[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(T.solution(str));
    }
}
