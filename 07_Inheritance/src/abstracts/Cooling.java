package abstracts;

public class Cooling {

	public static void main(String[] args) {
		//냉장고 제작을 위한 시작
		//추상화를 해보자!
		//딤채를 만들어보자 => 냉장고이기 전에 전자제품이어야 함
		
//		Electronic dimchae = new Dimchae(); 하나 실행하면 전부 실행되는 것이 단점
//		Cooler dimchae = new Dimchae();
		KimchiRef dimchae = new Dimchae();
		dimchae.setButton(1);
		System.out.println(dimchae.getButton());
		System.out.println(dimchae.getFeature());
		
//		KimchiRef kimchi = new KimchiRef() {
//			int i = 1;
//			@Override
//			void buttonColor(String color) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		}; 문법적으로 가능하지만 추천하지는 않음. 안드로이드에서 많이 사용
	}

}
