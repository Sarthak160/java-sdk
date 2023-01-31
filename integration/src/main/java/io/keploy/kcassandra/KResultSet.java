package io.keploy.kcassandra;

import com.datastax.driver.core.ColumnDefinitions;
import com.datastax.driver.core.ExecutionInfo;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.Iterator;
import java.util.List;

import static io.keploy.kcassandra.App.cmode;

public class KResultSet implements ResultSet {

    public ResultSet wrappedResultSet = null;

    public KResultSet(ResultSet resultSet) {
        System.out.println("inside KResultSet");
        wrappedResultSet = resultSet;
    }

    public KResultSet() {
        System.out.println("inside KResultSet in test");
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
        System.out.println("inside KResultSet one");
        return wrappedResultSet.one();
    }

    @Override
    public List<Row> all() {
        return null;
    }

    //    @Override
//    public Iterator<Row> iterator() {
//        return wrappedResultSet.iterator();
//    }
    @Override
    public Iterator<Row> iterator() {
        if (cmode.equals("test")) {
            return new Iterator<Row>() {
                @Override
                public boolean hasNext() {
                    return false;
                }

                @Override
                public Row next() {
                    System.out.println("inside KResultSet iterator" + cmode);
                    return null;
                }
            };
        }
        return new Iterator<Row>() {
            final Iterator<Row> wrappedIterator = wrappedResultSet.iterator();

            @Override
            public boolean hasNext() {
                return wrappedIterator.hasNext();
            }

            @Override
            public Row next() {
                return new KRow(wrappedIterator.next());
            }
        };
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
