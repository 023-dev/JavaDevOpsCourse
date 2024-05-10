// if문을 사용하여 다양한 메시지 출력
import java.io.IOException;
public class L0201{
	public static void main(String[] args){
		String s;
		System.out.printf("문자를 입력하세요. : ");
		char c = (char) System.in.read();
		if (c.equals('a'){
			System.out.printf("입력된 문자 %c은 모음입니다.", c);
			break;
			//여기에 적절한 case 문을 삽입한다.
		}
	}
}