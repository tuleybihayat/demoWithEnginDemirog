package concretes;

import abstracts.BaseSaleManager;
import entities.Sale;

public class SaleManager extends BaseSaleManager {

	@Override
	public void add(Sale sale) {
		// TODO Auto-generated method stub
		System.out.println("Satış gerçekleşti: " + sale.getCampaign().getName() + " kapsamında " + sale.getGame().getPrice() + 
				" fiyatına " + sale.getCampaign().getDiscountRate() + " oranında indirim uygulanarak " + sale.getGame().getName() +
				" oyunu " + sale.getAmount() + " fiyatına " + sale.getPlayer().getFirsName() + " adlı oyuncuya satılmıştır.");
		
		super.add(sale);
	}
	
	
	
	

}
