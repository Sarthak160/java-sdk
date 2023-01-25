package io.keploy.kcassandra;

import com.datastax.driver.core.*;
import com.datastax.driver.core.policies.RetryPolicy;

import java.nio.ByteBuffer;
import java.util.Map;

public class KPreparedStatement implements PreparedStatement {
    @Override
    public ColumnDefinitions getVariables() {
        return null;
    }

    @Override
    public BoundStatement bind(Object... objects) {
        return null;
    }

    @Override
    public BoundStatement bind() {
        return null;
    }

    @Override
    public PreparedStatement setRoutingKey(ByteBuffer byteBuffer) {
        return null;
    }

    @Override
    public PreparedStatement setRoutingKey(ByteBuffer... byteBuffers) {
        return null;
    }

    @Override
    public ByteBuffer getRoutingKey() {
        return null;
    }

    @Override
    public PreparedStatement setConsistencyLevel(ConsistencyLevel consistencyLevel) {
        return null;
    }

    @Override
    public ConsistencyLevel getConsistencyLevel() {
        return null;
    }

    @Override
    public PreparedStatement setSerialConsistencyLevel(ConsistencyLevel consistencyLevel) {
        return null;
    }

    @Override
    public ConsistencyLevel getSerialConsistencyLevel() {
        return null;
    }

    @Override
    public String getQueryString() {
        return null;
    }

    @Override
    public String getQueryKeyspace() {
        return null;
    }

    @Override
    public PreparedStatement enableTracing() {
        return null;
    }

    @Override
    public PreparedStatement disableTracing() {
        return null;
    }

    @Override
    public boolean isTracing() {
        return false;
    }

    @Override
    public PreparedStatement setRetryPolicy(RetryPolicy retryPolicy) {
        return null;
    }

    @Override
    public RetryPolicy getRetryPolicy() {
        return null;
    }

    @Override
    public PreparedId getPreparedId() {
        return null;
    }

    @Override
    public Map<String, ByteBuffer> getIncomingPayload() {
        return null;
    }

    @Override
    public Map<String, ByteBuffer> getOutgoingPayload() {
        return null;
    }

    @Override
    public PreparedStatement setOutgoingPayload(Map<String, ByteBuffer> map) {
        return null;
    }

    @Override
    public CodecRegistry getCodecRegistry() {
        return null;
    }

    @Override
    public PreparedStatement setIdempotent(Boolean aBoolean) {
        return null;
    }

    @Override
    public Boolean isIdempotent() {
        return null;
    }
}
