import java.util.Scanner;

public class FourPillars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sResult;
        System.out.println("음력으로 입력해주세요.");
        System.out.print("출생연도를 입력해주세요.");
        int iYear = sc.nextInt();
        System.out.print("출생월을 입력해주세요.");
        int iMonth = sc.nextInt();
        System.out.print("출생일을 입력해주세요.");
        int iDay = sc.nextInt();
        System.out.print("출생시를 입력해주세요.");
        int iHour = sc.nextInt();
        sResult = getFourPillars(iYear, iMonth, iDay, iHour);
        for (String s : sResult) {
            System.out.printf("%s\t", s);
        }
        sc.close();
    }

    private static final String[] KOREAN_ZODIAC_MAPPING = {
            //"자","축", "인", "묘", "진", "사", "오", "미", "신", "유", "술", "해"
            "천귀", "천액", "천권", "천파", "천인", "천문", "천복", "천고", "천역", "천간", "천수", "천명"
    };

    public static String[] getFourPillars(int iYear, int iMonth, int iDay, int iHour){
        String[] sResult = new String[4];
        int iIndex = 0;
        //YearToZodiac
        iIndex = (iYear - 4) % 12;
        sResult[0]  =  KOREAN_ZODIAC_MAPPING[iIndex];
        //MonthToZodiac
        iIndex = (iIndex+iMonth-1)% 12;
        sResult[1]  =  KOREAN_ZODIAC_MAPPING[iIndex];
        //DayToZodiac
        iIndex = (iIndex+iDay-1)% 12;
        sResult[2]  =  KOREAN_ZODIAC_MAPPING[iIndex];
        //HourToZodiac
        iIndex = (iHour + 1) / 2 % 12;
        sResult[3]  =  KOREAN_ZODIAC_MAPPING[iIndex];
        return sResult;
    }
}
