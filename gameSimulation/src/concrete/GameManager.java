package concrete;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" "+game.getPrice()+" "+"fiyatıyla eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" "+"oyununun bilgileri güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" "+"sistemden kaldırıldı.");
		
	}

}
