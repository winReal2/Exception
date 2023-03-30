package exceptionEx;

public class NullPointExceptionEx {
	public static void main(String[] args) {
		String str = null;
		// 참조변수가 null 값을 가지고 있을때 
		// 참조변수로부터 객체접근연산자(.)을 이용해서 접근할 때 발생하는 오류
		//컴파일러 상에서는 오류가 발생하지 않음
		
		try {
			str.toString();  			
			print(str);
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다");
		}	
	
		// 예외처리
		// 프로그램이 정상적으로 종료될 수 있도록 처리해줍니다.
		System.out.println("프로그램이 정상적으로 종료되었습니다");
	}
	//(str.toString())에서 에러가 났을때 호출한 print(str)로 감
	public static void print(String str) throws Exception {
		
		throw new Exception("강제 오류 발생");
	}
}
