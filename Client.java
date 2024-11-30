import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            // Conectar al registro RMI en localhost en el puerto 1100
            Registry registry = LocateRegistry.getRegistry("localhost", 1100);

            // Buscar el servicio remoto
            RemoteService service = (RemoteService) registry.lookup("RemoteService");

            // Invocar métodos remotos
            String response = service.greetClient("Cliente");
            System.out.println("Respuesta del servidor: " + response);

            // Enviar un objeto serializable
            DataObject data = new DataObject("Hola!");
            DataObject processedData = service.sendData(data);
            System.out.println("Objeto procesado: " + processedData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}