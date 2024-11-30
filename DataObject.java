import java.io.Serializable;

// Objeto que será serializado
public class DataObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private String message;

    public DataObject(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "DataObject{message='" + message + "'}";
    }
}