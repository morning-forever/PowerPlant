package jlm.event.core.publisher;

import com.google.common.eventbus.EventBus;

public interface EventPublisher {

    void setEventBus(EventBus eventBus);

}
