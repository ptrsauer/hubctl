package de.ptrsauer.hubctl;

import picocli.CommandLine;
import picocli.CommandLine.Command;

import java.util.Optional;
import java.util.logging.Logger;

@Command(name = "hubctl",
        mixinStandardHelpOptions = true,
        version = "0.0.1",
        description = "List your Issues and Pull Requests from GitHub.")
public class HubCtl implements Runnable {

    private static Logger log = Logger.getLogger(HubCtl.class.getSimpleName());

    private final TokenReader tokenReader = new TokenReader();

    public void run() {
        Optional<String> token = tokenReader.getToken();
        System.out.println("GitHub-Token: " + token.map(String::toString).orElse("Sorry, no token found in ~/.hubctl"));
    }

    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine(new HubCtl());
        commandLine.parseArgs(args);
        if (commandLine.isUsageHelpRequested()) {
            commandLine.usage(System.out);
            return;
        }
        if (commandLine.isVersionHelpRequested()) {
            commandLine.printVersionHelp(System.out);
            return;
        }
        int exitCode = commandLine.execute(args);
        System.exit(exitCode);
    }
}
