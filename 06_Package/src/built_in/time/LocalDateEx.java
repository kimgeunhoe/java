package built_in.time;

import java.time.LocalDate;

public class LocalDateEx {

	public static void main(String[] args) {
		//1.8이전에서는 new Date()를 통해 구현했던 것을(=> deprecated) 이후에는 Calendar 혹은 LocalDate, LocalDateTime을 사용을 권장한다.

		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getDayOfYear());
		System.out.println(today.getMonthValue());
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.plusYears(1L));
		LocalDate ago100 = today.minusYears(100L);
		System.out.println(ago100);
		//month, days, weeks 도 있으니 추가로 확인해보실 것
	}

}
