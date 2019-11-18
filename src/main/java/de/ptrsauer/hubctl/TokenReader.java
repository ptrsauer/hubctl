package de.ptrsauer.hubctl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.logging.Logger;

class TokenReader {
    private Logger log = Logger.getLogger(this.getClass().getSimpleName());

    private String token;

    TokenReader() {
        Optional<String> tokenOpt = readToken();
        if (tokenOpt.isPresent()) {
            this.token = tokenOpt.get();
        } else {
            System.exit(1);
        }
    }

    String getToken() {
        return token;
    }

    private Optional<String> readToken() {
        String homeDir = System.getProperty("user.home");
        try {
            return Optional.of(new String(Files.readAllBytes(Paths.get(homeDir + "/.hubctl"))));
        } catch (IOException e) {
            log.severe("Fehler beim Lesen des Token-Files.");
            log.throwing(this.getClass().getSimpleName(), "run", e);
        }
        return Optional.empty();
    }
}
