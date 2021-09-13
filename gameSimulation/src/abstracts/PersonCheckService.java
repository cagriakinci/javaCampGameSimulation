package abstracts;

import java.rmi.RemoteException;

import entities.User;

public interface PersonCheckService {
	boolean CheckIfRealPerson(User user) throws NumberFormatException, RemoteException ; 
}
