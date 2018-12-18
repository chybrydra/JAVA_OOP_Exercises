package builderAlternative1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {
        Train train = new Train.Builder(2)
                .composedOnTrack(1)
                .destinationTrack(2)
                .build();

        Train train2 = new Train.Builder(2)
                .composedOnTrack(4)
                .destinationTrack(5)
                .markAsExpress()
                .numberOfCarriages(40)
                .build();

        System.out.println(train.toString());
        System.out.println(train2.toString());
    }

}
