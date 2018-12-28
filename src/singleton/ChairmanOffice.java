package singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ChairmanOffice {

    private ChairmanOffice() {
    }

    private Random random = new Random();

    private Map<String, Integer> requestCounter = new HashMap<String, Integer>();;

    public boolean askForRise(String employeeId) throws IllegalArgumentException {

        boolean requestAccepted = random.nextBoolean();
        if (requestCounter.containsKey(employeeId)) {
            int count = requestCounter.get(employeeId);
            if (count > 3) {
                System.out.println("BOSS: You have asked for salary rise too many times , YOU ARE FIRED\n");
                System.out.println("< kicks you out >");
                System.exit(666);
            }
            count++;
            requestCounter.put(employeeId,count);
        } else {
            requestCounter.put(employeeId, 1);
        }
        return requestAccepted;
    }

    private static class SingletonHolder {
        public static final ChairmanOffice INSTANCE = new ChairmanOffice();
    }

    public static ChairmanOffice getInstance() {
        return SingletonHolder.INSTANCE;
    }

}