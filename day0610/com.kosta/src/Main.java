import java.util.ArrayList;

class Main {
    public int solution(String numbers) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < numbers.length(); i++) {
            for (int j = i; j < numbers.length(); j++) {
                int num;
                if (j == i) {
                    num = Integer.parseInt(String.valueOf(numbers.charAt(i)));
                } else {
                    num = Integer.parseInt(String.valueOf(numbers.charAt(i)+""+numbers.charAt(j)));
                }
                if(!(arr.contains(num)) && (num>1)) {
                    arr.add(num);
                    boolean isPrime = true;
                    for (int k = 2; k < num; k++) {
                        if (num % k == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        answer++;
                    }
                }
            }
        }
        System.out.println(arr.toString());
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Main().solution("011"));
    }
}