// Factory Concreta para a Família TCP
public class TCPConnectionFactory implements ConnectionFactory {
    @Override
    public Channel createChannel() {
        return new TCPChannel();
    }

    @Override
    public Encoder createEncoder() {
        return new TCPEncoder();
    }
}
