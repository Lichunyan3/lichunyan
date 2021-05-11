public class Homework02{
	public static void main(String[] args){
		Book b =new Book(120);
		b.info();
		b.updatePrice();
		b.info();
	}
}
class Book{
	int price;
	public Book(int price){
		this.price = price;
	}
	public void updatePrice(){
		if(this.price > 150){
			price = 150;
		} else if(this.price > 100){
			price = 100;
		}
	}
	public void info(){
		System.out.println("书的价格为" + price);
	}
}