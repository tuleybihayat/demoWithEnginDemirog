import concretes.CampaignManager;
import concretes.CheckManager;
import concretes.GameManager;
import concretes.PlayerManager;
import concretes.SaleManager;
import entities.Campaign;
import entities.Game;
import entities.Player;
import entities.Sale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player1 = new Player();
		player1.setId(1);
		player1.setFirsName("emre");
		player1.setLastName("şahin");
		player1.setAge(29);
		
		Player player2 = new Player();
		player2.setId(2);
		player2.setAge(45);
		player2.setFirsName("ahmet");
		player2.setLastName("alper");
		
		PlayerManager playerManager = new PlayerManager(new CheckManager());
		playerManager.add(player1);
		playerManager.add(player2);
		
		System.out.println("-*-*-*-*-*-*-*-*-");
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setName("mortal combat");
		game1.setPrice(12333);

		
		Game game2 = new Game();
		game2.setId(2);
		game2.setName("canavarcılık");
		game2.setPrice(1100);

		
		GameManager gameManager = new GameManager();
		gameManager.add(game2);
		gameManager.add(game1);
		
		System.out.println("-*-*-*-*-*-*-*-*-");

		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setName("tam kapanma kampanyası");
		campaign1.setDiscountRate(15);
		
		
		Campaign campaign2 = new Campaign();
		campaign2.setId(2);
		campaign2.setName("ramazan kampanyası");
		campaign2.setDiscountRate(78);
		
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign2);
		campaignManager.add(campaign1);
		
		System.out.println("-*-*-*-*-*-*-*-*-");
		
		Sale sale1 = new Sale();
		sale1.setId(1);
		sale1.setGame(game2);
		sale1.setPlayer(player2);
		sale1.setCampaign(campaign2);
		
		Sale sale2 = new Sale();
		sale2.setId(2);
		sale2.setGame(game1);
		sale2.setPlayer(player1);
		sale2.setCampaign(campaign1);
			
		SaleManager saleManager = new SaleManager();
		saleManager.add(sale1);
		saleManager.add(sale2);
		
	}
	
	
	
}
