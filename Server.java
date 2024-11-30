import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            // Crear el registro RMI en el puerto 1100
            Registry registry = LocateRegistry.createRegistry(1100);

            // Registrar el servicio remoto
            RemoteServiceImpl service = new RemoteServiceImpl();
            registry.rebind("RemoteService", service);

            System.out.println("Servidor RMI está listo.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}