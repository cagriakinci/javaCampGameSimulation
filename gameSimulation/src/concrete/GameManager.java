package concrete;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" "+game.getPrice()+" "+"fiyat�yla eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" "+"oyununun bilgileri g�ncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" "+"sistemden kald�r�ld�.");
		
	}

}
