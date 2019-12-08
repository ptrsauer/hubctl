package de.ptrsauer.hubctl;

import java.util.List;
import java.util.stream.Collectors;

class RepositoryReader {

    private final HubCtlFile hubCtlFile = new HubCtlFile();

    public List<String> readRepositoryUrls() {
        return hubCtlFile.readHubCtlConfigFileLines().stream().skip(1).collect(Collectors.toList());
    }
}
