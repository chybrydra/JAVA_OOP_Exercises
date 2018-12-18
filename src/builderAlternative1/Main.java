package builderAlternative1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {
        Train train = new Train.Builder(2)
                .composedOnTrack(1)
                .destinationTrack(2)
                .build();

        System.out.println(train.toString());
    }

}
