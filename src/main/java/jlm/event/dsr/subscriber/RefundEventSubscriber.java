package jlm.event.dsr.subscriber;

import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;
import jlm.event.core.subscriber.EventSubscriber;
import jlm.event.dsr.event.RefundEvent;

@Slf4j
public class RefundEventSubscriber implements EventSubscriber<RefundEvent> {

    @Override
    @Subscribe
    public void onEvent(RefundEvent event) {
        log.debug("event data: {}", event.getData().toString());
    }
}
