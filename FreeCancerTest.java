import java.util.Scanner;
import java.util.Date;
public class FreeCancerTest {
    /*
    사용자한테 이름 출생연도 성별을 입력받아 무료 암검진 대상자인지 판별하는 프로그램을 작성

    무료 암검진 대상자는 나이가 40 이상이고 그 해가 홀수 연도이면 홀수 연도에 태어나고
    그 해가 짝수 연도이면 짝수 연도에 태어난 사람입니다.

    홀수 연도에는 홀수년 출생자들이 짝수 연도에는 짝수년 출생자들이 검진을 받습니다.
    또, 성별별로 나이별로 검진항목은 다음과 같습니다.
    
    case 1: 40세 이상 남성 : 위암, 간암
    case 2: 40세 이상 여성 : 위암, 간암, 유방암, 자궁암
    case 3: 50세 이상 남성 : 위암, 간암, 대장암
    case 4: 50세 이상 여성 : 위암, 간암, 대장암, 유방암, 자궁암
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Date now = new Date();
        String name, gender, cancelTestItems = "위암, 간암";
        int userYear, thisYear, age;

        System.out.print("이름을 입력해주세요. : ");
        name = sc.next();//유저 이름
        System.out.print("출생연도를 입력해주세요. : ");
        userYear = sc.nextInt();//유저 출생연도
        thisYear = now.getYear()+1900;//java.util.Date 문서 참고
        age = thisYear - userYear;//유저 나이
        System.out.print("성별을 입력해주세요.(Male/Female) : ");
        gender = sc.next();//유저 성별

        if(age >= 40 && //유저 나이 확인
                ((userYear % 2 == 0 && thisYear % 2 ==0) || (userYear % 2 != 0 && thisYear % 2 != 0))) {//나이와 출생연도에 대한 홀짝 일치 확인
            if (gender.equals("Male")) {//유저가 남성이고
                if (age >= 50) {//50세 이상일 때
                    cancelTestItems += ", 대장암";
                }
            } else if (gender.equals("Female")) {//유저가 여성이고
                if (age >= 50){//50세 이상일 때
                    cancelTestItems += ", 대장암, 유방암, 자궁암";
                } else {//40세 이상일 때
                    cancelTestItems += ", 유방암, 자궁암";
                }
            } else {//유저 성별에 대한 예외 처리
                System.out.println("올바른 성별을 입력해주세요.(Male/Female)");
            }
        } else { //유저 나이가 40세 미만이거나 나이와 출생연도에 대한 홀짝이 불일치인 경우
            System.out.printf("%s님은 %d년 무료 암검진 대상자가 아닙니다.", name, thisYear);
            return;
        }
        System.out.printf("%s님은 %d년 무료 암검진 대상자입니다.\n" +
                "암검진 항목 : %s", name, thisYear, cancelTestItems);//최종 출력
    }
}
