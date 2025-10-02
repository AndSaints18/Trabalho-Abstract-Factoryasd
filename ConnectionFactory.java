// Abstract Factory: Define os métodos para criar todos os produtos
public interface ConnectionFactory {
    Channel createChannel();
    Encoder createEncoder();
}
