package de.ptrsauer.hubctl;

import java.util.Optional;
import java.util.logging.Logger;

class TokenReader {
    private Logger log = Logger.getLogger(this.getClass().getSimpleName());

    private HubCtlFile hubCtlFile = new HubCtlFile();

    private String token;

    TokenReader() {
        Optional<String> tokenOpt = readToken();
        tokenOpt.ifPresent(token -> this.token = token);
    }

    Optional<String> getToken() {
        return Optional.ofNullable(token);
    }

    private Optional<String> readToken() {
        return hubCtlFile.readHubCtlConfigFileLines().stream().findFirst();
    }
}
