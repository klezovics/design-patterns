package com.klezovich.design_patterns.behavioral.state.improved;


public interface TCPConnectionState {

    void open();

    void close();

    void acknowledge() throws Exception;


}
