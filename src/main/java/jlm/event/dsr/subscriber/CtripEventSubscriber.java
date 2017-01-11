package jlm.event.dsr.subscriber;

import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;
import jlm.event.core.subscriber.EventSubscriber;
import jlm.event.dsr.event.CtripEvent;
import jlm.event.dsr.model.RawData;

@Slf4j
public class CtripEventSubscriber implements EventSubscriber<CtripEvent> {

    @Override
    @Subscribe
    public void onEvent(CtripEvent event) {
        log.debug("event data: {}", event.getData().toString());
        RawData data = event.getData();
        data.setData("OPQRSTUVWXYZ");
        log.debug("  >> event data: {}", event.getData().toString());
    }

}
