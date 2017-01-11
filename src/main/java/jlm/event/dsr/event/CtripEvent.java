package jlm.event.dsr.event;

import jlm.event.core.BaseEvent;
import jlm.event.dsr.model.RawData;

public class CtripEvent extends BaseEvent<RawData> {

    public CtripEvent(RawData data) {
        super(data);
    }

}
