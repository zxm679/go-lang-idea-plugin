package ro.redeul.google.go.runner.beforeRunTasks;

import com.intellij.execution.BeforeRunTask;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.util.Key;
import org.jetbrains.annotations.NotNull;

public class GoVetTask extends BeforeRunTask<GoVetTask> {
    private RunConfiguration config;

    protected GoVetTask(@NotNull Key<GoVetTask> providerId, RunConfiguration config) {
        super(providerId);

        this.config = config;
    }

    public RunConfiguration getConfiguration() {
        return this.config;
    }
}
