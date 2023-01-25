package io.keploy.kcassandra;


import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.ResultSetFuture;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class KResultSetFuture implements ResultSetFuture {
    @Override
    public ResultSet getUninterruptibly() {
        return null;
    }

    @Override
    public ResultSet getUninterruptibly(long l, TimeUnit timeUnit) throws TimeoutException {
        return null;
    }

    @Override
    public boolean cancel(boolean b) {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return false;
    }

    @Override
    public ResultSet get() throws InterruptedException, ExecutionException {
        return null;
    }

    @Override
    public ResultSet get(long timeout, @NotNull TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    @Override
    public void addListener(Runnable runnable, Executor executor) {

    }
}
