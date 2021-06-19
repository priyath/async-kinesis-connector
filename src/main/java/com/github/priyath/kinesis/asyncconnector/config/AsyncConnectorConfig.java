package com.github.priyath.kinesis.asyncconnector.config;

import java.util.Properties;

import static com.github.priyath.kinesis.asyncconnector.constants.ConfigConstants.*;

public class AsyncConnectorConfig {

    public String streamName;
    public String applicationName;
    public String accessKey;
    public String secretKey;

    public AsyncConnectorConfig(Properties properties) {
        this.streamName = properties.getProperty(ASYNC_CONNECTOR_STREAM_NAME);
        this.applicationName = properties.getProperty(ASYNC_CONNECTOR_APPLICATION_NAME);
        this.accessKey = properties.getProperty(ASYNC_CONNECTOR_ACCESS_KEY);
        this.secretKey = properties.getProperty(ASYNC_CONNECTOR_SECRET_KEY);
    }
}
