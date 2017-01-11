package jlm.event.core.subscriber;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by xzl on 2017-01-01.
 */
@Slf4j
public class DeadEventSubscriber {

    @Subscribe
    public void onEvent(DeadEvent event) {
        log.debug("event : {}", event.toString());
    }

}
