package jlm.event.core;

/**
 * Created by xzl on 2017-01-01.
 */
public abstract class BaseEvent<T> implements Event<T> {

    private final T data;

    public BaseEvent(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

}