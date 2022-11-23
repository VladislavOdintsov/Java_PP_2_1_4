package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Timer {

//    @Autowired
//    @Qualifier("animalsCage")
//    private Timer timer;
//
//    public Timer getTimer() {
//        return timer;
//    }

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
