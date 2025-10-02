public class Main {
    public static void main(String[] args) {
        // 1. Configurar para usar a família TCP
        ConnectionFactory tcpFactory = new TCPConnectionFactory();
        Client tcpClient = new Client(tcpFactory);
        tcpClient.runConnectionTest();
        
        // 2. Configurar para usar a família UDP
        ConnectionFactory udpFactory = new UDPConnectionFactory();
        Client udpClient = new Client(udpFactory);
        udpClient.runConnectionTest();

        /*
         * Resultado da Execução:
         * * --- Executando Teste de Conexão ---
         * Canal: Conexão TCP estabelecida.
         * Encoder: Dados codificados para TCP (Checksum).
         * * --- Executando Teste de Conexão ---
         * Canal: Conexão UDP aberta.
         * Encoder: Dados codificados para UDP (Simples).
         */
    }
}
