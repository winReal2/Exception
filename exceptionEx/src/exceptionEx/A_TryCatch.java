package exceptionEx;
/**
 * try{
 *    //예외가 발생할 수 있는 코드들을 작성
 * }catch (Exception e){
 *     // try블록에서 예외가 발생시 실행을 멈추고
 *        catch블록을 실행
 * } finally{
 *    //생략가능, 
 *      예외가 발생하거나 발생하지 않았을 경우 모두 실행
 *      보통 자원을 반납하는 문장이 작성 
 * }
 * @author user
 *
 */
public class A_TryCatch {
	public static void main(String[] args) throws Exception {
		A_TryCatch a = new A_TryCatch();
		a.method1();
		System.out.println("================");	
		a.method3();
	}
	public void method3() throws Exception {
		method2();
	}
	public void method1() {
		// 오류가 발생할 소지가 있는 메소드를 try catch문으로 감싸
		// 오류 처리를 할 수 있다
		// 오류처리 => 프로그램이 강제종료되지 않고 계속해서 실행될 수 있도록 처리
		// 1. 메소드를 호출한 곳으로 오류를 떠넘기기 (=>강제종료의 위험이 있다)
		// 2. try catch문으로 처리하기
		try {
			System.out.println("method2() 호출 전");
			method2();
			System.out.println("method2() 호출 후");
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("method2() 호출 도중 오류 발생");
		} finally {
			// 필수블럭은 아님(생략가능)
			// finally는 무조건 실행됨 (오류발생, 미발생)
			System.out.println();
		}
	}
	
	// 메소드를 호출한 곳으로 예외처리를 미룸(떠넘김)
	public void method2() throws Exception {   //throws Exception으로 오류발생소지를 알려줘야함!
		System.out.println("method2 호출 중에 예상치 못한 예외가 발생..");
		throw new Exception("강제로 예외를 발생시켰습니다.");
	}
}
