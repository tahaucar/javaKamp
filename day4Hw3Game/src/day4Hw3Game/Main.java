package day4Hw3Game;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer(1, "Taha", "UÇAR", "asfasg@asdfsd.sdf", "asfasgj");
		GameSale gameSale1 = new GameSale(1, 1, "Pubg", 200);
		Campaign campaign1 = new Campaign(1, "Dev kampanya", 20);
		
		GamerService gamerService = new GamerManager(new EDevletVerificationManagerAdapter());
		gamerService.add(gamer1);
		
		CampaignService campaignService = new CampaignManager();
		campaignService.add(campaign1);
		
		GameSaleService gameSaleService = new GameSaleManager();
		gameSaleService.sell(gamer1, campaign1, gameSale1);
		
	}

}
