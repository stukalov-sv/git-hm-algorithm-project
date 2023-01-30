package Service;

import java.util.concurrent.ThreadLocalRandom;

public class RandomizeService {
    
    public static <T> T getRandomValue(T[] values) {
        int randomIndex = ThreadLocalRandom.current().nextInt(values.length);
        return values[randomIndex];
    }
}
