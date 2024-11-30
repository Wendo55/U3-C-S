import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implementación del servicio remoto
public class RemoteServiceImpl extends UnicastRemoteObject implements RemoteService {

    protected RemoteServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String greetClient(String name) throws RemoteException {
        return "Hello, " + name + "! This is the server.";
    }

    @Override
    public DataObject sendData(DataObject data) throws RemoteException {
        // Modificar y retornar el objeto recibido
        data.setMessage(data.getMessage() + " - Processed by the server.");
        return data;
    }
}