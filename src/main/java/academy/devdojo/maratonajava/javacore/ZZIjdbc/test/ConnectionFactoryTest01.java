package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.domain.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

/**
 * Aula_256 | Aula_257 - <b>JDBC</b><br />
 * Aula_258 - <b>Lombok e Log4J2</b><br />
 * Aula_259 - <b>JDBC - Deletando dados com Statement</b><br />
 * Aula_260 - <b>JDBC - Atualizando os dados com Statement</b><br />
 * Aula_261 | Aula_262 - <b>JDBC - Buscando dados com ResultSet</b>
 * Aula_263 - <b>JDBC - ResultSetMetaData</b><br />
 * Nesta classe é onde fica as regras de negócios<br />
 */

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder()
                .name("Studio Deen")
                .build();

        Producer producerToUpdate = Producer.builder()
                .id(1)
                .name("madhouse")
                .build();

//        ProducerService.save(producer);
//        ProducerService.delete(6);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("Mad");
//        log.info("Producers found '{}'", producers);
//        ProducerService.showProducerMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 pictures");
//        log.info("Producers found '{}'", producers);
//        ProducerService.findByNameAndDelete("A-1 pictures");
//        List<Producer> producers = ProducerService.findByNamePreparedStatement("Bo");
//        log.info("Producers found '{}'", producers);
//        ProducerService.updatePreparedStatement(producerToUpdate);
        List<Producer> producers = ProducerService.findByNameCallableStatement("Bo");
        log.info("Producers found '{}'", producers);
    }
}