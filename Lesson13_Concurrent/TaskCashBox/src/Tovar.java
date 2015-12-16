/*
 * Класс, который хранит шаблон для создания товаров.
 * Наименование товара будет звучать "Tovar1" "Tovar2" ... "Tovar3".
 * В качестве полей класса будет:
 *  - стоимость одной единицы товара.
 */
public class Tovar {

	public String name;     // наименование товара
	
	public int price;       // стоимость единицы товара
	
	public Tovar(String name) {
		this.name=name;
	}
	
}
