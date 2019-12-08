package de.ptrsauer.hubctl.githubclient;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.util.List;

public class GitHubClient {

    public List<GitHubIssue> getIssuesForRepository(String token, String repository) {
        Response response = ClientBuilder.newClient().target("https://api.github.com/repos/" + repository + "/issues")
                .request()
                .header("Authorization", "Bearer " + token)
                .buildGet()
                .invoke();

        return response.readEntity(new GenericType<>() {
        });
    }
}
