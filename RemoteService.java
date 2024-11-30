import java.rmi.Remote;
import java.rmi.RemoteException;

// Interfaz remota
public interface RemoteService extends Remote {
    String greetClient(String name) throws RemoteException;
    DataObject sendData(DataObject data) throws RemoteException;
}