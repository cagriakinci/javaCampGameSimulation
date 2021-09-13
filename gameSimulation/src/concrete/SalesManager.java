package concrete;

import entities.Campaign;
import entities.Game;
import entities.User;

public class SalesManager {
	public void gameSales(User user, Game game, Campaign campaign) {
		String discountedPrice = user.getFirstName() + " " + user.getLastName() + " " + game.getName() + " " + "oyununu"
				+ " " + "%" + campaign.getDiscount() + " " + "indirimle" + " "
				+ (game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100)) + " "
				+ "TL fiyatına satın aldı.";
		System.out.println(discountedPrice);

	}
}
