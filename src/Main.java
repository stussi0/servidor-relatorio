import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8985), 0);

        server.createContext("/", new LoginHandler());
        server.createContext("/cadastrar", new CadastrarHandler());
        server.createContext("/visualizar", new VisualizarHandler());

        server.setExecutor(null);
        System.out.println("Servidor iniciado na porta 8985");
        server.start();
    }
}
