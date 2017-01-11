package jlm.event.dsr.event;

import jlm.event.core.BaseEvent;
import jlm.event.dsr.model.RawData;

public class RefundEvent extends BaseEvent<RawData> {

    public RefundEvent(RawData data) {
        super(data);
    }

}
