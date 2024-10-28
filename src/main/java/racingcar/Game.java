package racingcar;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class Game {
    private final List<Car> cars;

    public Game(List<String> carNames) {
        validateDuplicateNames(carNames);
        cars = createCars(carNames);
    }

    private List<Car> createCars(List<String> carNames) {
        List<Car> carList = new ArrayList<>();
        for (String name : carNames) {
            carList.add(new Car(name));
        }
        return carList;
    }

    private void validateDuplicateNames(List<String> carNames) {
        Set<String> nameSet = new HashSet<>(carNames);
        if (nameSet.size() != carNames.size()) {
            throw new IllegalArgumentException("중복된 이름 존재");
        }
    }

}
