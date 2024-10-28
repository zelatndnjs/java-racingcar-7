package racingcar;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    private final List<Car> cars;

    private void validateDuplicateNames(List<String> carNames) {
        Set<String> nameSet = new HashSet<>(carNames);
        if (nameSet.size() != carNames.size()) {
            throw new IllegalArgumentException("중복된 이름 존재");
        }
    }

}
