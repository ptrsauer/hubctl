package de.ptrsauer.hubctl;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

class RepositoryReader {
    private Logger log = Logger.getLogger(this.getClass().getSimpleName());

    private HubCtlFile hubCtlFile = new HubCtlFile();

    public List<String> readRepositoryUrls() {
        return hubCtlFile.readHubCtlConfigFileLines().stream().skip(1).collect(Collectors.toList());
    }
}
