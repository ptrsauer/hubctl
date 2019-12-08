package de.ptrsauer.hubctl;

import java.util.Optional;

class TokenReader {
    private final HubCtlFile hubCtlFile = new HubCtlFile();

    private String token;

    TokenReader() {
        Optional<String> tokenOpt = readToken();
        tokenOpt.ifPresent(token -> this.token = token);
    }

    String getToken() {
        return token;
    }

    private Optional<String> readToken() {
        return hubCtlFile.readHubCtlConfigFileLines().stream().findFirst();
    }
}
