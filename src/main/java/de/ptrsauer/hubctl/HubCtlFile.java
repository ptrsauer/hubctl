package de.ptrsauer.hubctl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class HubCtlFile {
    private static Logger log = Logger.getLogger(HubCtlFile.class.getSimpleName());

    public List<String> readHubCtlConfigFileLines() {
        String homeDir = System.getProperty("user.home");
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(homeDir + "/.hubctl"));
            return reader.lines().collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            log.severe("Datei ~/.hubctl konnte nicht gefunden werden.");
        }
        return List.of();
    }
}
