/*
 * Класс, в котором создаём метод currentDate().
 * Он будет возвращать дату и время события, в нужном для нас формате.
 */
package car;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

	// формат вывода даты не зависит от выбора локали (ru или en)
	// здесь стоит en
	public static String currentDate() {
		SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy. HH:mm:ss.SSS");
		String currentDateString = ft.format(new Date());
		return currentDateString;
	}
	
}