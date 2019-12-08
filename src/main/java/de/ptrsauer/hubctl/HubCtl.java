package de.ptrsauer.hubctl;

import de.ptrsauer.hubctl.githubclient.GitHubClient;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "hubctl",
        mixinStandardHelpOptions = true,
        version = "0.0.1",
        description = "List your Issues and Pull Requests from GitHub.")
public class HubCtl implements Runnable {

    private final TokenReader tokenReader = new TokenReader();
    private final RepositoryReader repositoryReader = new RepositoryReader();
    private final GitHubClient gitHubClient = new GitHubClient();

    public void run() {
        String token = tokenReader.getToken();
        System.out.println("GitHub-Token: " + token);

        System.out.println("\nConfigured repositories:");
        repositoryReader.readRepositoryUrls().forEach(System.out::println);

        System.out.println("\nSome Issues to work on:");
        repositoryReader.readRepositoryUrls().stream().map(repoUrl -> gitHubClient.getIssuesForRepository(token, repoUrl)).forEach(System.out::println);
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
