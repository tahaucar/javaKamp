package day4Hw3Game;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi : " + campaign.getCampaignName());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getCampaignName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya gŁncellendi : " + campaign.getCampaignName());		
	}

}
