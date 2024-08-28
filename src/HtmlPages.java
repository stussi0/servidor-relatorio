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
        return "<!doctype html>\n" + //
            "<html lang=\"pt-br\">\n" + //
            "  <head>\n" + //
            "    <meta charset=\"UTF-8\" />\n" + //
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" + //
            "    <title>Laboratório de Radiações</title>\n" + //
            "  </head>\n" + //
            "  <body>\n" + //
            "    <h1>Laboratório de Radiações</h1>\n" + //
            "    <h3>Atenuação da Radiação - 24/08/2024</h3>\n" + //
            "    <h6>Prof. Dr. Luis Alberto Schwind Pedroso Stussi da Silva Pereira</h6>\n" + //
            "    <nav style=\"background-color: lightsalmon\">\n" + //
            "      <a href=\"/\">Login</a>\n" + //
            "      <a href=\"/cadastrar\">Criar Relatório</a>\n" + //
            "      <a href=\"/visualizar\">Visualizar Relatório</a>\n" + //
            "    </nav>\n" + //
            "    <section style=\"background-color: lightblue; padding: 10px\">\n" + //
            "      <h5>Instruções</h5>\n" + //
            "      <p>Preencham os campos abaixos com o que for pedido</p>\n" + //
            "    </section>\n" + //
            "    <section style=\"background-color: lightgray; padding: 10px\">\n" + //
            "      <h3>Cadastro de Informações</h3>\n" + //
            "      <form id=\"cadastroForm\">\n" + //
            "        <hr />\n" + //
            "        <p>O título deve ser um nome que sintetize a temática do que foi feito no laboratório.</p>\n" + //
            "        <label for=\"titulo\">Título: </label><br />\n" + //
            "        <input style=\"width: 95%\" type=\"text\" name=\"titulo\" /><br />\n" + //
            "        <hr />\n" + //
            "        <p>\n" + //
            "          O objetivo deve ser aquilo que o laboratório se propõe à provar, dessa forma o que o experimento apresentado\n" + //
            "          pretende demonstrar para o experimentalista?\n" + //
            "        </p>\n" + //
            "        <label for=\"objetivo\">Objetivo: </label><br />\n" + //
            "        <textarea style=\"width: 95%; min-height: 150px\" name=\"objetivo\"></textarea><br />\n" + //
            "        <hr />\n" + //
            "        <p>\n" + //
            "          As palavras chave são palavrar que ajudam à encontrar um relatório em uma lista de muitos outros relatórios. O\n" + //
            "          que este esperimento tem de diferente de outros vários esperimentos que você já fez? Encontre 5 palavras que\n" + //
            "          façam este esperimento ser fácil de achar!\n" + //
            "        </p>\n" + //
            "        <label for=\"palavras_chave\">Palavras-chave: </label><br />\n" + //
            "        <input style=\"width: 95%\" type=\"text\" name=\"palavras_chave\" /><br />\n" + //
            "        <hr />\n" + //
            "        <p>\n" + //
            "          Depois de terminar o relatório resuma-o de forma que em poucas palavras você consiga explicar para uma pessoa\n" + //
            "          que não acompanhou sua experiência o que aconteceu e quais os resultados encontrados.\n" + //
            "        </p>\n" + //
            "        <label for=\"resumo\">Resumo: </label><br />\n" + //
            "        <textarea style=\"width: 95%; min-height: 150px\" name=\"resumo\"></textarea><br />\n" + //
            "        <hr />\n" + //
            "        <p>\n" + //
            "          Contextualise o leitor sobre o que é importante saber para entender o experimento que foi feito, usando como\n" + //
            "          referências Livros, Artigos, Manuais de Fabricantes e Trabalhos Acadêmicos (Monografias, Disertações e Teses).\n" + //
            "        </p>\n" + //
            "        <label for=\"introducao\">Introdução: </label><br />\n" + //
            "        <textarea style=\"width: 95%; min-height: 150px\" name=\"introducao\"></textarea><br />\n" + //
            "        <hr />\n" + //
            "        <p>\n" + //
            "          Explique para o leitor todos os procedimentos usados por você para obter os resultados que você obteve. Seja\n" + //
            "          bestante preciso e evite usar gírias ou linguagem leiga para a explicação. Ele deve ser uma receita de bolo, o\n" + //
            "          qual deve-se especificar cada passo que influencia no resultado final do experimento.\n" + //
            "        </p>\n" + //
            "        <p>\n" + //
            "          Por exemplo no Roteiro laboratorial é exigido que se façam 5 medições de cada uma mas barreiras e calcule a\n" + //
            "          média. Logo na metodologia deve constar: Fizemos a média dos 5 valores adiquiridos com o contador Geiger de\n" + //
            "          maneira que m = (v1+v2+v3+v4+v5)/5\n" + //
            "        </p>\n" + //
            "        <label for=\"materiais\">Materiais e Métodos: </label><br />\n" + //
            "        <textarea style=\"width: 95%; min-height: 150px\" name=\"materiais\"></textarea><br />\n" + //
            "        <hr />\n" + //
            "        <p>\n" + //
            "          São os resultados obtidos no experimento, sem interpretação alguma, apenas o que for observado e mensurado.\n" + //
            "        </p>\n" + //
            "        <label for=\"resultados\">Resultados: </label><br />\n" + //
            "        <textarea style=\"width: 95%; min-height: 150px\" name=\"resultados\"></textarea><br />\n" + //
            "        <hr />\n" + //
            "        <p>\n" + //
            "          A conclusão deve ser a sua interpretação do fenômeno observado. Ela é de carater pessoal, logo você deve\n" + //
            "          analisar os resultados obtidos e concluir utilizando sua dedução lógica e conhecimento prévio o que você acha\n" + //
            "          que ocorreu no experimento.\n" + //
            "        </p>\n" + //
            "        <label for=\"conclusao\">Conclusão: </label><br />\n" + //
            "        <textarea style=\"width: 95%; min-height: 150px\" name=\"conclusao\"></textarea><br />\n" + //
            "        <hr />\n" + //
            "        <p>\n" + //
            "          A bibliografia deve incluir todos os autores e trabalhos citados ao longo do relatório. E lembre-se todo o\n" + //
            "          trabalho que não for citados acarreta em plágio. Em resumo toda afirmação feita no texto, que não esteja na\n" + //
            "          conclusão e resultados deve ser citada e esta citação deve ser referenciada no tópico Bibliografia.\n" + //
            "        </p>\n" + //
            "        <label for=\"bibliografia\">Bibliografia: </label><br />\n" + //
            "        <textarea style=\"width: 95%; min-height: 150px\" name=\"bibliografia\"></textarea><br />\n" + //
            "        <hr />\n" + //
            "        <button style=\"margin: 20px; padding: 25px\" type=\"button\" onclick=\"cadastrar()\">Cadastrar</button>\n" + //
            "      </form>\n" + //
            "      <script>\n" + //
            "        function cadastrar() {\n" + //
            "          const form = document.getElementById('cadastroForm')\n" + //
            "          const data = {}\n" + //
            "          for (const input of form.elements) {\n" + //
            "            if (input.name) data[input.name] = input.value\n" + //
            "          }\n" + //
            "          fetch('/cadastrar', {\n" + //
            "            method: 'POST',\n" + //
            "            headers: { 'Content-Type': 'application/json' },\n" + //
            "            body: JSON.stringify(data),\n" + //
            "          })\n" + //
            "            .then(response => response.text())\n" + //
            "            .then(alert)\n" + //
            "        }\n" + //
            "\n" + //
            "        function handleMedia(){\n" + //
            "            const v1 = document.getElementById(\"v1\").value;\n" + //
            "            const v2 = document.getElementById(\"v2\").value;\n" + //
            "            const v3 = document.getElementById(\"v3\").value;\n" + //
            "            const v4 = document.getElementById(\"v4\").value;\n" + //
            "            const v5 = document.getElementById(\"v5\").value;\n" + //
            "            const media = (Number(v1)+Number(v2)+Number(v3)+Number(v4)+Number(v5))/Number(5);\n" + //
            "            const mediavalores = document.getElementById(\"mediavalores\");\n" + //
            "            mediavalores.innerHTML = `Media da Intensidade: ${media} contagems/min`;\n" + //
            "        }\n" + //
            "\n" + //
            "        function handleCoeficiente(){\n" + //
            "            const espessura = document.getElementById(\"espessura\").value;\n" + //
            "            const iinicial = document.getElementById(\"iinicial\").value;\n" + //
            "            const ifinal = document.getElementById(\"ifinal\").value;\n" + //
            "            const coeficiente = -Math.log(Number(ifinal)/Number(iinicial))/Number(espessura);\n" + //
            "            const coeficienteatenuante = document.getElementById(\"coeficienteatenuante\");\n" + //
            "            coeficienteatenuante.innerHTML = `Coeficiente de Atenuação Linear: ${coeficiente} cm⁻¹`;\n" + //
            "        }\n" + //
            "\n" + //
            "        function handleCalculoIntensidade(){\n" + //
            "            const espessuramedida = document.getElementById(\"espessuramedida\").value;\n" + //
            "            const iinicialmedida = document.getElementById(\"iinicialmedida\").value;\n" + //
            "            const coeficientemedido = document.getElementById(\"coeficientemedido\").value;\n" + //
            "            const intensidadecalculada = Number(iinicialmedida)*Math.exp(-Number(espessuramedida)*Number(coeficientemedido));\n" + //
            "            const intensidadeatenuada = document.getElementById(\"intensidadeatenuada\");\n" + //
            "            intensidadeatenuada.innerHTML = `Intensidade Atenuada: ${intensidadecalculada} contagems/min`;\n" + //
            "        }\n" + //
            "      </script>\n" + //
            "    </section>\n" + //
            "    <section style=\"background-color: lightgreen;\">\n" + //
            "      <hr />\n" + //
            "      <h3>Fórmulas Úteis</h3>\n" + //
            "      <h5>Média das Medições</h5>\n" + //
            "      <label for=\"valor1\">Valor 1: </label><input id=\"v1\" style=\"max-width: 150px; margin: 10px;\" type=\"number\" name=\"valor1\" /><br />\n" + //
            "      <label for=\"valor2\">Valor 2: </label><input id=\"v2\" style=\"max-width: 150px; margin: 10px;\" type=\"number\" name=\"valor2\" /><br />\n" + //
            "      <label for=\"valor3\">Valor 3: </label><input id=\"v3\" style=\"max-width: 150px; margin: 10px;\" type=\"number\" name=\"valor3\" /><br />\n" + //
            "      <label for=\"valor4\">Valor 4: </label><input id=\"v4\" style=\"max-width: 150px; margin: 10px;\" type=\"number\" name=\"valor4\" /><br />\n" + //
            "      <label for=\"valor5\">Valor 5: </label><input id=\"v5\" style=\"max-width: 150px; margin: 10px;\" type=\"number\" name=\"valor5\" /><br />\n" + //
            "      <span id=\"mediavalores\"></span><br>\n" + //
            "      <button onclick=\"handleMedia()\">Calcular Média</button>\n" + //
            "      <h5>Coeficiente de Atenuação Linear</h5>\n" + //
            "      <label for=\"espessura\">Espessura da Barreira: </label>\n" + //
            "      <input id=\"espessura\" style=\"max-width: 150px; margin: 10px;\" type=\"number\" name=\"espessura\" /><br />\n" + //
            "      <label for=\"iinicial\">Intensidade da Fonte: </label>\n" + //
            "      <input id=\"iinicial\" style=\"max-width: 150px; margin: 10px;\" type=\"number\" name=\"iinicial\" /><br />\n" + //
            "      <label for=\"ifinal\">Intensidade Atenuada: </label>\n" + //
            "      <input id=\"ifinal\" style=\"max-width: 150px; margin: 10px;\" type=\"number\" name=\"ifinal\" /><br />\n" + //
            "      <span id=\"coeficienteatenuante\"></span><br>\n" + //
            "      <button onclick=\"handleCoeficiente()\">Calcular Coeficiente</button>\n" + //
            "      <h5>Lambert-Beer</h5>\n" + //
            "      <label for=\"espessuramedida\">Espessura da Barreira: </label>\n" + //
            "      <input id=\"espessuramedida\" style=\"max-width: 150px; margin: 10px;\" type=\"number\" name=\"espessuramedida\" /><br />\n" + //
            "      <label for=\"iinicialmedida\">Intensidade da Fonte: </label>\n" + //
            "      <input id=\"iinicialmedida\" style=\"max-width: 150px; margin: 10px;\" type=\"number\" name=\"iinicialmedida\" /><br />\n" + //
            "      <label for=\"coeficientemedido\">Coeficiente de Atenuação Linear: </label>\n" + //
            "      <input id=\"coeficientemedido\" style=\"max-width: 150px; margin: 10px;\" type=\"number\" name=\"coeficientemedido\" /><br />\n" + //
            "      <span id=\"intensidadeatenuada\"></span><br>\n" + //
            "      <button onclick=\"handleCalculoIntensidade()\">Calcular Intensidade</button>\n" + //
            "    </section>\n" + //
            "  </body>\n" + //
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
