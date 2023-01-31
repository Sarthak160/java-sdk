package io.keploy.kcassandra;

import com.datastax.driver.core.*;
import com.google.common.util.concurrent.ListenableFuture;

import java.util.Map;

import static io.keploy.kcassandra.App.cmode;

public class KSession implements Session {
    Session wrappedSession = null;

    public KSession(Session session) {
        System.out.println("inside Ksession");
        wrappedSession = session;
    }

    public KSession(){
        System.out.println("inside Ksession in test");
    }
    @Override
    public String getLoggedKeyspace() {
        return null;
    }

    @Override
    public Session init() {
        return wrappedSession.init();
    }

    @Override
    public ListenableFuture<Session> initAsync() {
        return wrappedSession.initAsync();
    }

    @Override
    public ResultSet execute(String s) {
        if(cmode.equals("record")){
            System.out.println("inside KSession execute");
            System.out.println(s);
            return new KResultSet(wrappedSession.execute(s));
        }else {
            return new KResultSet();
        }

    }

    @Override
    public ResultSet execute(String s, Object... objects) {
        return wrappedSession.execute(s, objects);
    }

    @Override
    public ResultSet execute(String s, Map<String, Object> map) {
        return null;
    }

    @Override
    public ResultSet execute(Statement statement) {
        return wrappedSession.execute(statement);
    }

    @Override
    public ResultSetFuture executeAsync(String s) {
        return wrappedSession.executeAsync(s);
    }

    @Override
    public ResultSetFuture executeAsync(String s, Object... objects) {
        return null;
    }

    @Override
    public ResultSetFuture executeAsync(String s, Map<String, Object> map) {
        return null;
    }

    @Override
    public ResultSetFuture executeAsync(Statement statement) {
        return null;
    }

    @Override
    public PreparedStatement prepare(String s) {
        return null;
    }

    @Override
    public PreparedStatement prepare(RegularStatement regularStatement) {
        return null;
    }

    @Override
    public ListenableFuture<PreparedStatement> prepareAsync(String s) {
        return null;
    }

    @Override
    public ListenableFuture<PreparedStatement> prepareAsync(RegularStatement regularStatement) {
        return null;
    }

    @Override
    public CloseFuture closeAsync() {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public boolean isClosed() {
        return false;
    }

    @Override
    public Cluster getCluster() {
        return null;
    }

    @Override
    public State getState() {
        return null;
    }
}
