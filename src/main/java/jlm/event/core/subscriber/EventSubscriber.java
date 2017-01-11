package jlm.event.core.subscriber;

import jlm.event.core.Event;

public interface EventSubscriber<T extends Event> {

    void onEvent(T event);

}
