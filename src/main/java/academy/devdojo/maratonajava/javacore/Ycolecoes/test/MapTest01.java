package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Aula_178 - <b>Map</b><br />
 * <b>Map</b> funciona como um dicionário, usando <b>CHAVE</b> e <b>VALOR</b><br />
 * No map a <b>CHAVE</b> não pode ser duplicada, porêm o <b>VALOR</b> pode<br />
 * Para manter a ordem de inserção de valores, usar o <b>LinkedHashMap</b><br />
 *
 */
public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc2", "você2");
        System.out.println(map);

        for (String key : map.keySet()) { // Assim consegue acessar a chave e também ao valor a parte dela
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("-------------------------------------");

        for (String value : map.values()) { // Assim só acessa ao valor
            System.out.println(value);
        }

        System.out.println("-------------------------------------");

        for (Map.Entry<String, String> entry : map.entrySet()) { // Assim consegue acessar a chave e o valor
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
