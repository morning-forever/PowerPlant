package jlm.event.dsr.subscriber.processor;

import jlm.event.dsr.model.RawData;

import java.util.Stack;

public class StackStringReverseTicketEventProcessor implements TicketEventProcessor {

    @Override
    public RawData process(RawData data) {
        Stack<Character> stack = new Stack<>();
        for (char c : data.getData().toCharArray()) {
            stack.push(c);
        }

        StringBuilder buff = new StringBuilder();
        while (!stack.isEmpty()) {
            buff.append(stack.pop());
        }

        RawData newData = new RawData();
        newData.setId(data.getId());
        newData.setType(data.getType());
        newData.setNeedCtrip(data.isNeedCtrip());
        newData.setData(buff.toString());
        return newData;
    }

}
