package com.github.priyath.kinesis.asyncconnector;

import com.github.priyath.kinesis.asyncconnector.config.AsyncConnectorConfig;

import java.util.Properties;

public class AsyncConnector {

    public AsyncConnector(Properties properties) {
        AsyncConnectorConfig asyncConnectorConfigs = new AsyncConnectorConfig(properties);
    }
}
