package entities;

import interfaces.Entity;

public class Sale implements Entity {
	
	private int id;
	private Game game;
	private Player player;
	private Campaign campaign;
//	private double amount;

	public Sale() {
		
	}
	
	public Sale(int id, Game game, Player player, Campaign campaign) {
		super();
		this.id = id;
		this.game = game;
		this.player = player;
		this.campaign = campaign;
//		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public double getAmount() {
		return game.getPrice() - (game.getPrice() * campaign.getDiscountRate() / 100);
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	
	

}
