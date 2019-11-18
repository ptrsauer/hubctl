package de.ptrsauer.hubctl;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "hubctl",
        mixinStandardHelpOptions = true,
        version = "0.0.1",
        description = "List your Issues and Pull Requests from GitHub.")
public class HubCtl implements Runnable {

    private final TokenReader tokenReader = new TokenReader();

    public void run() {
        String token = tokenReader.getToken();
        System.out.println("GitHub-Token: " + token);
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new HubCtl()).execute(args);
        System.exit(exitCode);
    }
}
