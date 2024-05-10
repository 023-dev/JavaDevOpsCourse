// if문을 사용하여 다양한 메시지 출력
import java.io.IOException;
public class L0202{
	public static void main(String[] args){
		String s;
		System.out.printf("문자를 입력하세요. : ");
		char c = (char) System.in.read();
		switch(c){
			case('a'):case('e'):case('i'):case('u'):case('o')://Q.2-2
			case('A'):case('E'):case('I'):case('U'):case('O')://Q.2-3
				System.out.printf("입력된 문자 %c은 모음입니다.", c);
				break;
				//여기에 적절한 case 문을 삽입한다.
			default://Q.2-4
				System.out.println("입력된 문자는 모음이 아닙니다.");
				break;
		}
	}
}