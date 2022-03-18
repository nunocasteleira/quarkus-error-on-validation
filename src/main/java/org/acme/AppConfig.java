package org.acme;

import io.quarkus.runtime.annotations.StaticInitSafe;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;
import io.smallrye.config.WithName;

@StaticInitSafe
@ConfigMapping(prefix = "app")
public interface AppConfig {
    @WithName("feature-toggle")
    FeatureToggle featureToggle();

    interface FeatureToggle {
        @WithDefault("false")
        boolean featureShouldBeOffByDefault();
    }
}
