package exceptionEx;
import java.io.IOException;

public class B_Throws {
	public static void main(String[] args) {
		B_Throws b = new B_Throws();
		b.method2();
	}
	public void method1() throws IOException, Exception, NullPointerException {
		System.out.println("method1() 호출");
		// 1~3까지 수를 추출
		int num = (int)(Math.random()*3+1);	
		if(num==1) {
			throw new Exception();
		} else if (num==2) {
			throw new IOException();
		} else if (num==3) {
			throw new NullPointerException();
		}
	}
	public void method2() {
		System.out.println("method1 호출");
		try {
			method1();
			// 오류처리시 나눠서 처리하는 것이 바람직
			//어떤 종류의 예외가 발생했는지 확인 후 처리
		} catch (IOException e) {
			System.out.println("파일 입출력 도중 오류가 발생했습니다");
//			e.printStackTrace();
			//Exception은 예외의 최상의 계층이므로 어떤 오류 발생했는지
			// 명확하게 알 수 없다
		} catch (Exception e) {
		System.out.println("오류가 발생했습니다");
		{
//			e.printStackTrace();
		}
		System.out.println("method1 종료");
		}
	}
	public void method3() {	
	}
}
