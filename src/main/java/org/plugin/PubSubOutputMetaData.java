package org.plugin;

import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.ServerStatus;
import org.graylog2.plugin.Version;

import java.net.URI;
import java.util.Collections;
import java.util.Set;

/**
 * Implement the PluginMetaData interface here.
 */
public class PubSubOutputMetaData implements PluginMetaData {
    private static final String PLUGIN_PROPERTIES = "org.plugin.graylog-plugin-pubsub-output/graylog-plugin.properties";

    @Override
    public String getUniqueId() {
        return "org.plugin.PubSubOutputPlugin";
    }

    @Override
    public String getName() {
        return "PubSubOutput";
    }

    @Override
    public String getAuthor() {
        return "Debasish Misra <debasishmisra3008@gmail.com>";
    }

    @Override
    public URI getURL() {
        return URI.create("https://github.com/https://github.com/debasish283/graylog-plugin-pubsub-output.git");
    }

    @Override
    public Version getVersion() {
        return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "version", Version.from(1, 0, 0, "unknown"));
    }

    @Override
    public String getDescription() {
        // TODO Insert correct plugin description
        return "Plugin to send output to a specific topic in Google PubSub";
    }

    @Override
    public Version getRequiredVersion() {
        return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "graylog.version", Version.from(0, 0, 0, "unknown"));
    }

    @Override
    public Set<ServerStatus.Capability> getRequiredCapabilities() {
        return Collections.emptySet();
    }
}
