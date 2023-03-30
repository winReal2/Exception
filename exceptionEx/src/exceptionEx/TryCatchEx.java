package exceptionEx;

import java.util.Scanner;

public class TryCatchEx {
	public static void main(String[] args) {
/**
 * try-catch
 * 
 * try{
 *     //예외가 발생할 소지가 있는 코드
 * } catch(Exception e){
 *             // try블럭에서 예외가 발생시 실행을 멈추고
 *               catch 블럭으로 이동하여 예외처리 코드를 실행
 * }
 */
	Scanner scan = new Scanner(System.in);
	int num =0;
	while(true) {
		try {
			System.out.println("숫자를 입력해주세요");
			// 사용자가 문자를 입력했을 경우, 숫자로 변환시 오류가 발생
			num = scan.nextInt();
			System.out.println(num + "입력되었습니다.");
			break;
		} catch (Exception e) {
			String str = scan.next();
			// e.printStackTrace();
			System.out.println(str + "입력 가능한 숫자가 아닙니다.");
		}		
	}
	}	
}
