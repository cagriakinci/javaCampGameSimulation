import java.rmi.RemoteException;

import adapters.MernisCheckService;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.SalesManager;
import concrete.UserManager;
import entities.Campaign;
import entities.Game;
import entities.User;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {

		User user1 = new User(1, "Çağrı", "Akıncı", 1998, "11111111111");

		Game game1 = new Game(1, "Call Of Duty Ghost", 600);

		Campaign campaign1 = new Campaign(1, "Blizzard İndirimi", 20);

		GameManager gameManager = new GameManager();
		gameManager.add(game1);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);

		SalesManager salesManager = new SalesManager();
		salesManager.gameSales(user1, game1, campaign1);

		UserManager userManager = new UserManager(new MernisCheckService());
		userManager.add(user1);

	}

}
