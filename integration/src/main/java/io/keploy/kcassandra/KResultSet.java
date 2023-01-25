package io.keploy.kcassandra;

import com.datastax.driver.core.ColumnDefinitions;
import com.datastax.driver.core.ExecutionInfo;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.Iterator;
import java.util.List;

public class KResultSet implements ResultSet {

    public ResultSet wrappedResultSet = null;

    public KResultSet(ResultSet resultSet) {
        wrappedResultSet = resultSet;
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
    public ListenableFuture<ResultSet> fetchMoreResults() {
        return null;
    }

    @Override
    public Row one() {
        return wrappedResultSet.one();
    }

    @Override
    public List<Row> all() {
        return null;
    }

    @Override
    public Iterator<Row> iterator() {
        return wrappedResultSet.iterator();
    }

    @Override
    public ExecutionInfo getExecutionInfo() {
        return null;
    }

    @Override
    public List<ExecutionInfo> getAllExecutionInfo() {
        return null;
    }

    @Override
    public ColumnDefinitions getColumnDefinitions() {
        return null;
    }

    @Override
    public boolean wasApplied() {
        return false;
    }
}
