package com.okcoin.websocket.bean.request;

/**
 * @author Created by: zhangbingbing
 * @date 2018/9/11
 **/
public class OKExRequest {
    private String event;
    private String channel;
    private String parameters;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "OKExRequest{" +
                "event='" + event + '\'' +
                ", channel='" + channel + '\'' +
                ", parameters='" + parameters + '\'' +
                '}';
    }
}
