package concretes;

import abstracts.BaseCheckManager;
import abstracts.BaseUserManager;
import entities.Player;

public class PlayerManager extends BaseUserManager {

	BaseCheckManager checkManager;
	
	public PlayerManager (BaseCheckManager checkManager) {
		this.checkManager = checkManager;
	}

	@Override
	public void add(Player player) {
		// TODO Auto-generated method stub
		
		if (checkManager.ifRealPerson()) {
			super.add(player);
		} else {
			System.out.println("Player eklenemedi.");
		}
		
		
	}
	
	
			
			
			
	

}
