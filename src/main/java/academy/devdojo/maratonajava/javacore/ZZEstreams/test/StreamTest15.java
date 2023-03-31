package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Promotion.NORMAL_PRICE;
import static academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Promotion.UNDER_PROMOTION;

/**
 * Aula_217 - <b>Collectors - Grouping by</b><br />
 * <b>Collectors</b> é como um framework dentro do stream<br />
 * O <b>groupingBy</b> pode receber mais de um argumento<br />
 *
 */
public class StreamTest15 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlod", 10.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Komo desuga", 1.99, Category.FANTASY),
            new LightNovel("Komo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, List<Promotion>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(getLightNovelPromotionFunction(), Collectors.toList())));
        System.out.println(collect1);

        Map<Category, Set<Promotion>> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(getLightNovelPromotionFunction(), Collectors.toSet())));
        System.out.println(collect2);

        Map<Category, LinkedHashSet<Promotion>> collect3 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(getLightNovelPromotionFunction(), Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect3);


    }

    private static Function<LightNovel, Promotion> getLightNovelPromotionFunction() {
        return ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}