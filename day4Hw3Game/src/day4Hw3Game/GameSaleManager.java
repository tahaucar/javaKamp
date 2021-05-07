package day4Hw3Game;

public class GameSaleManager implements GameSaleService {

	@Override
	public void sell(Gamer gamer, Campaign campaign, GameSale gameSale) {

		System.out.println("'" + gamer.getFirstName() + " " + gamer.getLastName() + " ' oyuncusuna" + "'" + gameSale.getName()
				+ " ' oyunu" + "'" + campaign.getCampaignRate() + " ' oranýnda inridim uygulaanrak satýldý.");

	}

}
