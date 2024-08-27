import java.util.List;

public class HtmlPages {
    public static String getLoginPage(String errorMessage) {
        return "<!DOCTYPE html>\n" + //
            "<html lang=\"pt-br\">\n" + //
            "<head>\n" + //
            "    <meta charset=\"UTF-8\">\n" + //
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" + //
            "    <title>Login</title>\n" + //
            "</head>\n" + //
            "<body>\n" + //
            "    <h1>Login</h1>" +
            (errorMessage.isEmpty() ? "" : "<p style='color:red;'>" + errorMessage + "</p>") +
            "<form method='post'>\n" + //
            "        <label for=\"username\">Usuário: </label><input type='text' name='username'><br>\n" + //
            "        <label for=\"password\">Senha: </label><input type='password' name='password'><br>\n" + //
            "        <button type='submit'>Login</button>\n" + //
            "    </form>\n" + //
            "</body>\n" + //
            "</html>";
    }

    public static String getCadastroPage(String username) {
        return "<!DOCTYPE html>\n" + //
                "<html lang=\"pt-br\">\n" + //
                "<head>\n" + //
                "    <meta charset=\"UTF-8\">\n" + //
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" + //
                "    <title>Laboratório de Radiações</title>\n" + //
                "</head>\n" + //
                "<body>\n" + //
                "    <h1>Laboratório de Radiações</h1>\n" + //
                "    <h3>Atenuação da Radiação - 24/08/2024</h3>\n" + //
                "    <h6>Prof. Dr. Luis Alberto Schwind Pedroso Stussi da Silva Pereira</h6>\n" + //
                "    <nav style=\"background-color: lightsalmon;\">\n" + //
                "        <a href=\"/\">Login</a>\n" + //
                "        <a href=\"/cadastrar\">Criar Relatório</a>\n" + //
                "        <a href=\"/visualizar\">Visualizar Relatório</a>\n" + //
                "    </nav>\n" + //
                "    <section style=\"background-color: lightblue; padding: 10px;\">\n" + //
                "        <h5>Instruções</h5>\n" + //
                "        <p>Preencham os campos abaixos com o que for pedido</p>\n" + //
                "    </section>\n" + //
                "    <section style=\"background-color: lightgray; padding: 10px;\">\n" + //
                "        <h3>Cadastro de Informações</h3>\n" + //
                "        <form id='cadastroForm'>\n" + //
                "            <hr>\n" + //
                "            <p>O título deve ser um nome que sintetize a temática do que foi feito no laboratório.</p>\n" + //
                "            <label for=\"titulo\">Título: </label><br>\n" + //
                "            <input style=\"width: 95%;\" type='text' name='titulo'><br>\n" + //
                "            <hr>\n" + //
                "            <p>O objetivo deve ser aquilo que o laboratório se propõe à provar, dessa forma o que o experimento apresentado pretende demonstrar para o experimentalista?</p>\n" + //
                "            <label for=\"objetivo\">Objetivo: </label><br>\n" + //
                "            <textarea style=\"width: 95%; min-height: 150px;\" name='introducao'></textarea><br>\n" + //
                "            <hr>\n" + //
                "            <p>As palavras chave são palavrar que ajudam à encontrar um relatório em uma lista de muitos outros relatórios. O que este esperimento tem de diferente de outros vários esperimentos que você já fez? Encontre 5 palavras que façam este esperimento ser fácil de achar!</p>\n" + //
                "            <label for=\"palavras_chave\">Palavras-chave: </label><br>\n" + //
                "            <input style=\"width: 95%;\" type='text' name='palavras_chave'><br>\n" + //
                "            <hr>\n" + //
                "            <p>Depois de terminar o relatório resuma-o de forma que em poucas palavras você consiga explicar para uma pessoa que não acompanhou sua experiência o que aconteceu e quais os resultados encontrados.</p>\n" + //
                "            <label for=\"resumo\">Resumo: </label><br>\n" + //
                "            <textarea style=\"width: 95%; min-height: 150px;\" name='resumo'></textarea><br>\n" + //
                "            <hr>\n" + //
                "            <p>Contextualise o leitor sobre o que é importante saber para entender o experimento que foi feito, usando como referências Livros, Artigos, Manuais de Fabricantes e Trabalhos Acadêmicos (Monografias, Disertações e Teses).</p>\n" + //
                "            <label for=\"introducao\">Introdução: </label><br>\n" + //
                "            <textarea style=\"width: 95%; min-height: 150px;\" name='introducao'></textarea><br>\n" + //
                "            <hr>\n" + //
                "            <p>Explique para o leitor todos os procedimentos usados por você para obter os resultados que você obteve. Seja bestante preciso e evite usar gírias ou linguagem leiga para a explicação. Ele deve ser uma receita de bolo, o qual deve-se especificar cada passo que influencia no resultado final do experimento.</p>\n" + //
                "            <label for=\"materiais\">Materiais e Métodos: </label><br>\n" + //
                "            <textarea style=\"width: 95%; min-height: 150px;\" name='materiais'></textarea><br>\n" + //
                "            <hr>\n" + //
                "            <p>São os resultados obtidos no experimento, sem interpretação alguma, apenas o que for observado e mensurado.</p>\n" + //
                "            <label for=\"resultados\">Resultados: </label><br>\n" + //
                "            <textarea style=\"width: 95%; min-height: 150px;\" name='resultados'></textarea><br>\n" + //
                "            <hr>\n" + //
                "            <p>A conclusão deve ser a sua interpretação do fenômeno observado. Ela é de carater pessoal, logo você deve analisar os resultados obtidos e concluir utilizando sua dedução lógica e conhecimento prévio o que você acha que ocorreu no experimento.</p>\n" + //
                "            <label for=\"conclusao\">Conclusão: </label><br>\n" + //
                "            <textarea style=\"width: 95%; min-height: 150px;\" name='conclusao'></textarea><br>\n" + //
                "            <hr>\n" + //
                "            <p>A bibliografia deve incluir todos os autores e trabalhos citados ao longo do relatório. E lembre-se todo o trabalho que não for citados acarreta em plágio. Em resumo toda afirmação feita no texto, que não esteja na conclusão e resultados deve ser citada e esta citação deve ser referenciada no tópico Bibliografia.</p>\n" + //
                "            <label for=\"bibliografia\">Bibliografia: </label><br>\n" + //
                "            <textarea style=\"width: 95%; min-height: 150px;\" name='bibliografia'></textarea><br>\n" + //
                "            <hr>\n" + //
                "            <button style=\"margin: 20px; padding: 25px;\" type='button' onclick='cadastrar()'>Cadastrar</button>\n" + //
                "        </form>\n" + //
                "        <script>\n" + //
                "            function cadastrar() {\n" + //
                "                const form = document.getElementById('cadastroForm');\n" + //
                "                const data = {};\n" + //
                "                for (const input of form.elements) {\n" + //
                "                    if (input.name) data[input.name] = input.value;\n" + //
                "                }\n" + //
                "                fetch('/cadastrar', {\n" + //
                "                    method: 'POST',\n" + //
                "                    headers: { 'Content-Type': 'application/json' },\n" + //
                "                    body: JSON.stringify(data)\n" + //
                "                }).then(response => response.text()).then(alert);\n" + //
                "            }\n" + //
                "        </script>\n" + //
                "    </section>\n" + //
                "</body>\n" + //
                "</html>";
    }

    public static String getVisualizarPage(List<String> userFiles) {
        StringBuilder page = new StringBuilder("<!DOCTYPE html>\n" + //
            "<html lang=\"pt-br\">\n" + //
            "<head>\n" + //
            "    <meta charset=\"UTF-8\">\n" + //
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" + //
            "    <title>Visualizar Relatório</title>\n" + //
            "</head>\n" + //
            "<body>\n" + //
            "    <h1>Informações Cadastradas</h1>\n" + //
            "    <ul>");
        for (String fileContent : userFiles) {
            page.append("        <li>").append(fileContent).append("</li>");
        }
        page.append("    </ul>\n" + //
            "</body>\n" + //
            "</html>");
        return page.toString();
    }
}
