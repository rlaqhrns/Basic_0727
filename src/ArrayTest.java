
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][][] str = {
				{ { "이재오1", "일이삼2" }, { "홍길동1", "고길동2" } },
				{ { "앙아아1", "1234", "abc3" }, { "에어컨1", "선풍기2", "컴퓨터3" } },
				{ { "김김김12", "모니터56" }, { "데이터12", "핸드폰56" } } };
		for (String[][] k : str) {
			for (String[] i : k) {
				for (String j : i) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
//		for (String[][] k : str) {
//			for (String[] i : k) {
//				for (String j : i) {
//					System.out.print(j.substring(0, 3) + " ");
//				}
//			}
//			System.out.println();
//		}
//		for (String[][] k : str) {
//			for (String[] i : k) {
//				for (String j : i) {
//					System.out.print(j.substring(3) + " ");
//				}
//			}
//		}
	}

}
