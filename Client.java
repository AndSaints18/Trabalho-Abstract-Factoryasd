public class Client {
    private final Channel channel;
    private final Encoder encoder;

    // O Cliente recebe o Abstract Factory (ConnectionFactory)
    public Client(ConnectionFactory factory) {
        this.channel = factory.createChannel();
        this.encoder = factory.createEncoder();
    }

    public void runConnectionTest() {
        System.out.println("\n--- Executando Teste de Conexão ---");
        channel.getMessage();
        encoder.encode();
    }
}
