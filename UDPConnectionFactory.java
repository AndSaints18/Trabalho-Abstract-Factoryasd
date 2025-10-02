// Factory Concreta para a Família UDP
public class UDPConnectionFactory implements ConnectionFactory {
    @Override
    public Channel createChannel() {
        return new UDPChannel();
    }

    @Override
    public Encoder createEncoder() {
        return new UDPEncoder();
    }
}
