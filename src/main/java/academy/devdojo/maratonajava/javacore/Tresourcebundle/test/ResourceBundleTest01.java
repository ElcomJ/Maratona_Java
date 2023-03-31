package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Aula_130 - <b>Classes Utilitárias - ResourceBundle</b><br />
 * <b>ResourceBundle</b> é uma forma de internacionalizar as nossas mensagens para outras idiomas e alterar os valores dos <b>labels</b><br />
 * <b>ResourceBundle</b> do Java.util<br />
 * Ter cuidado com o <b>FallBack</b><br /><br />
 * <b>Locale("fr", "CA");</b> ->
 * <b>messages_fr_CA.properties</b> -><br />
 * <b>messages_fr.properties</b> -><br />
 * <b>messages_en_US.properties</b> -><br />
 * <b>messages_en.properties</b> -><br />
 * <b>messages.properties</b> -><br />
 * <b>Exception</b><br /><br />
 * Muitas mensagens com o mesmo valor, coloque em <b>INGLÊS</b><br />
 *
 */
public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle.getString("hi"));

        ResourceBundle bundle2 = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle2.getString("hello"));
        System.out.println(bundle2.getString("good.morning"));
        System.out.println(bundle.getString("hi"));
    }
}
