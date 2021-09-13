package concrete;

import java.rmi.RemoteException;

import abstracts.PersonCheckService;
import abstracts.UserService;
import entities.User;

public class UserManager implements UserService {
	PersonCheckService personCheckService;

	public UserManager(PersonCheckService personCheckService) {
		this.personCheckService = personCheckService;
	}

	@Override
	public void add(User user) throws NumberFormatException, RemoteException {
		if (personCheckService.CheckIfRealPerson(user)) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "başarıyla kayıt oldu.");
		}else {
			System.out.println("Kişi Mernis Sisteminde yok.");
		}

	}

	@Override
	public void update(User user) throws NumberFormatException, RemoteException { 
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "bilgilerini güncelledi.");

	}

	@Override
	public void delete(User user) throws NumberFormatException, RemoteException {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "kaydını sildi.");

	}

}
