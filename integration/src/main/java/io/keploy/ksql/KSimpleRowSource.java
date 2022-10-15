package io.keploy.ksql;

import org.h2.tools.SimpleRowSource;

import java.sql.SQLException;
import java.util.ArrayList;

public class KSimpleRowSource implements SimpleRowSource {
    ArrayList<Object> row;
    public KSimpleRowSource(ArrayList<Object> row) {
        this.row = row;
    }

    @Override
    public Object[] readRow() throws SQLException {
        return new ArrayList[]{this.row};
    }

    @Override
    public void close() {

    }

    @Override
    public void reset() throws SQLException {

    }
}
