package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.ZZGconcorrencia.service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * Aula_241 - <b>Concorrência - CompletableFuture</b><br />
 * <b>CompletableFuture</b> executa todas as chamadas Async de uma vez só em diferentes Threads<br />
 * Ao usar Streams com o <b>CompletableFuture</b> tomar cuidado pois ele faz a saida ser syncrona<br />
 * Para resolver esse problema precisar quebrar a streams em partes separadas<br />
 * Esse problema também acontecer usando o <b>Future</b><br />
 *
 */
public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();

        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        List<CompletableFuture<Double>> completableFutures = stores.stream()
                .map(storeService::getPricesAsyncCompletableFuture)
                .collect(Collectors.toList());

        List<Double> prices = completableFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());


        System.out.println(prices);

        long end = System.currentTimeMillis();

        System.out.printf("Time passed to searchPricesSync %dms%n", (end - start));
    }
}
