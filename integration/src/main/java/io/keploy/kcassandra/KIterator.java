package io.keploy.kcassandra;

import com.datastax.driver.core.ExecutionInfo;
import com.datastax.driver.core.PagingIterable;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.Iterator;
import java.util.List;

public class KIterator implements PagingIterable{

    public PagingIterable wrappedIterator = null;
    public KIterator(PagingIterable iterator) {
        System.out.println("inside KIterator");
        wrappedIterator = iterator;
    }
    @Override
    public boolean isExhausted() {
        return false;
    }

    @Override
    public boolean isFullyFetched() {
        return false;
    }

    @Override
    public int getAvailableWithoutFetching() {
        return 0;
    }

    @Override
    public ListenableFuture fetchMoreResults() {
        return null;
    }

    @Override
    public Object one() {
        return null;
    }

    @Override
    public List all() {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public ExecutionInfo getExecutionInfo() {
        return null;
    }

    @Override
    public List<ExecutionInfo> getAllExecutionInfo() {
        return null;
    }
}
