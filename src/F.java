import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class F{

    @SuppressWarnings("unused")
    class StrategyPatternUsingConsumers {

        public class TheClassThatWillCreateStrategiesAndPassToObjectsCreatedUsingConsumers {

            List<Double> listOfDrinks = new ArrayList<>();
            private BiConsumer<Double, Double> happyHourStrategyConsumer = (pricePassed, quantity) -> listOfDrinks.add(pricePassed * 0.5 * quantity);
            private BiConsumer<Double, Double> normalStrategyHourConsumer = (pricePassed, quantity) -> listOfDrinks.add(pricePassed * quantity);

            void strategyConsumerExecution() {
                happyHourStrategyConsumer.accept(45.0, 89.2);
            }
            void strategyConsumerExecution(BiConsumer<Double,Double> biConsumer) {
                biConsumer.accept(45.0, 89.2);
            }

            void setNormalStrategyHourConsumerExecution() {
                normalStrategyHourConsumer.accept(34.4, 5.9);
            }
        }
    }
    public static void main(String[] args) {

    }
}