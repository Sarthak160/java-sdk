package io.keploy.kcassandra;
import com.datastax.oss.driver.api.core.CqlIdentifier;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.context.DriverContext;
import com.datastax.oss.driver.api.core.metadata.Metadata;
import com.datastax.oss.driver.api.core.metrics.Metrics;
import com.datastax.oss.driver.api.core.session.Request;
import com.datastax.oss.driver.api.core.type.reflect.GenericType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.concurrent.CompletionStage;

public class KCQLSession implements CqlSession{
    @NotNull
    @Override
    public String getName() {
        return null;
    }

    @NotNull
    @Override
    public Metadata getMetadata() {
        return null;
    }

    @Override
    public boolean isSchemaMetadataEnabled() {
        return false;
    }

    @NotNull
    @Override
    public CompletionStage<Metadata> setSchemaMetadataEnabled(@Nullable Boolean aBoolean) {
        return null;
    }

    @NotNull
    @Override
    public CompletionStage<Metadata> refreshSchemaAsync() {
        return null;
    }

    @NotNull
    @Override
    public CompletionStage<Boolean> checkSchemaAgreementAsync() {
        return null;
    }

    @NotNull
    @Override
    public DriverContext getContext() {
        return null;
    }

    @NotNull
    @Override
    public Optional<CqlIdentifier> getKeyspace() {
        return Optional.empty();
    }

    @NotNull
    @Override
    public Optional<Metrics> getMetrics() {
        return Optional.empty();
    }

    @Nullable
    @Override
    public <RequestT extends Request, ResultT> ResultT execute(@NotNull RequestT requestT, @NotNull GenericType<ResultT> genericType) {
        return null;
    }

    @NotNull
    @Override
    public CompletionStage<Void> closeFuture() {
        return null;
    }

    @NotNull
    @Override
    public CompletionStage<Void> closeAsync() {
        return null;
    }

    @NotNull
    @Override
    public CompletionStage<Void> forceCloseAsync() {
        return null;
    }
}
