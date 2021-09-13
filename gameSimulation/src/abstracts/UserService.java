package abstracts;

import java.rmi.RemoteException;

import entities.User;

public interface UserService {
	void add(User user) throws NumberFormatException, RemoteException;	
	void update(User user) throws NumberFormatException, RemoteException;
	void delete(User user)throws NumberFormatException, RemoteException;
}
