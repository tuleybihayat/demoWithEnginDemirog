package abstracts;

import entities.Campaign;

public abstract class BaseCampaignManager {
	
	public void add(Campaign campaign) {
		System.out.println("A new campaign is added: " + campaign.getName());
	}
	
	public void delete(Campaign campaign) {
		System.out.println("The campaign is deleted: " + campaign.getName());
	}
	
	public void update(Campaign campaign) {
		System.out.println("The campaign is updated: " + campaign.getName());
	}
}
