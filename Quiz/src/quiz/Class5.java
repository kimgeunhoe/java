package quiz;

import java.util.Scanner;

class Store {
	String[] items = new String[3];
	int count = 0;

	public String getItems(int a) {
		count++;
		return items[a];
	}

	public void setItems(String[] items) {
		this.items = items;
	}

	public void viewItem() {
		for (String string : items) {
			System.out.println(string);
		}
	}
}

public class Class5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Store first = new Store();
		Store second = new Store();
		Store third = new Store();
		String[] itemList = {"1", "2", "3"};
		first.setItems(itemList);
		//first.setItems(new String[] {"1", "2", "3"});
		second.setItems(itemList);
		third.setItems(itemList);
		
		while(true) {
			System.out.print("상점 선택: ");
			int stores = sc.nextInt();
			System.out.print("1:아이템 리스트, 2:아이템 구입 ");
			int menuNum = sc.nextInt();
			
			if(stores==1) {
				if(menuNum==1) {
					System.out.println("list");
					first.viewItem();
				}
				else if(menuNum==2) {
					System.out.print("구입할 아이템 인덱스번호: ");
					switch (sc.nextInt()) {
					case 0:
						System.out.println("first상점의 " + first.getItems(0) + " 구매");
						System.out.println("구매횟수" + first.count);
						break;
					case 1:
						System.out.println("first상점의 " + first.getItems(1) + " 구매");
						System.out.println("구매횟수" + first.count);
						break;
					case 2:
						System.out.println("first상점의 " + first.getItems(2) + " 구매");
						System.out.println("구매횟수" + first.count);
						break;
					default:
						break;
					}
				}
			}
			else if(stores==2) {
				if(menuNum==1) {
					second.viewItem();
				}
				else if(menuNum==2) {
					System.out.print("구입할 아이템 인덱스번호: ");
					switch (sc.nextInt()) {
					case 0:
						System.out.println("second상점의 " + second.getItems(0) + " 구매");
						System.out.println("구매횟수" + second.count);
						break;
					case 1:
						System.out.println("second상점의 " + second.getItems(1) + " 구매");
						System.out.println("구매횟수" + second.count);
						break;
					case 2:
						System.out.println("second상점의 " + second.getItems(2) + " 구매");
						System.out.println("구매횟수" + second.count);
						break;
					default:
						break;
					}
				}
			}
			else if(stores==3) {
				if(menuNum==1) {
					third.viewItem();
				}
				else if(menuNum==2) {
					System.out.print("구입할 아이템 인덱스번호: ");
					switch (sc.nextInt()) {
					case 0:
						System.out.println("third상점의 " + third.getItems(0) + " 구매");
						System.out.println("구매횟수" + third.count);
						break;
					case 1:
						System.out.println("third상점의 " + third.getItems(1) + " 구매");
						System.out.println("구매횟수" + third.count);
						break;
					case 2:
						System.out.println("third상점의 " + third.getItems(2) + " 구매");
						System.out.println("구매횟수" + third.count);
						break;
					default:
						break;
					}
				}
			} 
			else {
				System.out.println("종료\n");
				break;
			}
		}
	}
}
