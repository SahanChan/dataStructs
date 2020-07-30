
public class OrdApp {

	public static void main(String[] args) {
		int maxSize=10;
		OrdArray array = new OrdArray(maxSize);
		array.insert(11);
		array.insert(22);
		array.insert(33);
		array.insert(44);
		array.insert(55);
		array.insert(66);
		array.insert(77);
		array.insert(88);
		array.insert(99);
		array.insert(101);
		System.out.println(array.find(88));
		array.display();

	}

}
