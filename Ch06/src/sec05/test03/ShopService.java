package sec05.test03;

public class ShopService {
	private static ShopService instance=new ShopService();
	
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return instance;
	}

}
