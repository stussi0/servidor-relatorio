import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class LoginHandler implements HttpHandler {

    private static final Map<String, String> users = new HashMap<>();

    static {
        users.put("teste", "123");
        users.put("amandaavelino", "123");
        users.put("amandacruz", "123");
        users.put("ana", "123");
        users.put("andre", "123");
        users.put("anna", "123");
        users.put("ariane", "123");
        users.put("barbara", "123");
        users.put("beatriz", "123");
        users.put("brenda", "123");
        users.put("camilycoelho", "123");
        users.put("camilyvitoria", "123");
        users.put("cauane", "123");
        users.put("diogo", "123");
        users.put("eliane", "123");
        users.put("emerson", "123");
        users.put("fabiola", "123");
        users.put("gabriel", "123");
        users.put("gheanderson", "123");
        users.put("gislaine", "123");
        users.put("jheniffer", "123");
        users.put("joao", "123");
        users.put("juliana", "123");
        users.put("karoline", "123");
        users.put("larissa", "123");
        users.put("leticia", "123");
        users.put("luiza", "123");
        users.put("maria", "123");
        users.put("murilo", "123");
        users.put("natalha", "123");
        users.put("pablo", "123");
        users.put("paola", "123");
        users.put("ranny", "123");
        users.put("raquel", "123");
        users.put("rodrigo", "123");
        users.put("saara", "123");
        users.put("thalita", "123");
        users.put("thiago", "123");
        users.put("vanessa", "123");
        users.put("wagner", "123");
        users.put("yasmin", "123");
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        if ("GET".equalsIgnoreCase(exchange.getRequestMethod())) {
            String response = HtmlPages.getLoginPage("");
            exchange.sendResponseHeaders(200, response.getBytes(StandardCharsets.UTF_8).length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes(StandardCharsets.UTF_8));
            }
        } else if ("POST".equalsIgnoreCase(exchange.getRequestMethod())) {
            String requestBody = new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8);
            Map<String, String> params = parseFormData(requestBody);

            String username = params.get("username");
            String password = params.get("password");

            if (users.containsKey(username) && users.get(username).equals(password)) {
                String response = HtmlPages.getCadastroPage(username);
                exchange.getResponseHeaders().add("Set-Cookie", "user=" + username);
                exchange.sendResponseHeaders(200, response.getBytes(StandardCharsets.UTF_8).length);
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(response.getBytes(StandardCharsets.UTF_8));
                }
            } else {
                String response = HtmlPages.getLoginPage("Usuário ou senha inválidos.");
                exchange.sendResponseHeaders(200, response.getBytes(StandardCharsets.UTF_8).length);
                try (OutputStream os = exchange.getResponseBody()) {
                    os.write(response.getBytes(StandardCharsets.UTF_8));
                }
            }
        }
    }

    private Map<String, String> parseFormData(String formData) {
        Map<String, String> map = new HashMap<>();
        for (String pair : formData.split("&")) {
            String[] keyValue = pair.split("=");
            if (keyValue.length > 1) {
                map.put(keyValue[0], keyValue[1]);
            }
        }
        return map;
    }
}
