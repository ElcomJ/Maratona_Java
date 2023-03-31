package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain;

/**
 * Aula_251 - <b>Design Pattern - DTO (Data Transfer Object)</b>
 * O <b>DTO</b> é utilizado quando queremos informações de varias classes em apenas uma<br />
 *
 */
public class ReportDto {
    private String aircraftName;
    private Country country;
    private Currency currency;
    private String personName;

    @Override
    public String toString() {
        return "ReportDto{" +
                "aircraftName='" + aircraftName + '\'' +
                ", country=" + country +
                ", currency=" + currency +
                ", personName='" + personName + '\'' +
                '}';
    }

    private ReportDto(Builder builder) {
        aircraftName = builder.aircraftName;
        country = builder.country;
        currency = builder.currency;
        personName = builder.personName;
    }


    public static final class Builder {
        private String aircraftName;
        private Country country;
        private Currency currency;
        private String personName;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder aircraftName(String val) {
            aircraftName = val;
            return this;
        }

        public Builder country(Country val) {
            country = val;
            return this;
        }

        public Builder currency(Currency val) {
            currency = val;
            return this;
        }

        public Builder personName(String val) {
            personName = val;
            return this;
        }

        public ReportDto build() {
            return new ReportDto(this);
        }
    }
}
