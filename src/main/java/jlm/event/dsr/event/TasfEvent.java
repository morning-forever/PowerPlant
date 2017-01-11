package jlm.event.dsr.event;

import jlm.event.core.BaseEvent;
import jlm.event.dsr.model.RawData;

/**
 * Created by xzl on 2017-01-01.
 */
public class TasfEvent extends BaseEvent<RawData> {

    public TasfEvent(RawData data) {
        super(data);
    }

}
