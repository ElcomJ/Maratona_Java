package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Promotion.NORMAL_PRICE;
import static academy.devdojo.maratonajava.javacore.ZZEstreams.domain.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.groupingBy;

/**
 * Aula_215 - <b>Collectors - Grouping by</b><br />
 * <b>Collectors</b> é como um framework dentro do stream<br />
 * Na linha <b>39</b> se utiliza um <b>groupingBy</b> dentro de outro <b>groupingBy</b> usando Collectors<br />
 */
public class StreamTest13 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlod", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Komo desuga", 1.99, Category.FANTASY),
            new LightNovel("Komo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE));
        System.out.println(collect);

        // Map<Category, Map<Promotion, List<LightNovel>>>

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels
                .stream()
                .collect(groupingBy(LightNovel::getCategory,
                        groupingBy(getLightNovelPromotionFunction())));
        System.out.println(collect1);
    }

    private static Function<LightNovel, Promotion> getLightNovelPromotionFunction() {
        return ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
