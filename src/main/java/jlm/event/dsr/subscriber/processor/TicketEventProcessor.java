package jlm.event.dsr.subscriber.processor;

import jlm.event.dsr.model.RawData;

/**
 * Created by xzl on 2017-01-01.
 */
public interface TicketEventProcessor {

    RawData process(RawData data);

}
