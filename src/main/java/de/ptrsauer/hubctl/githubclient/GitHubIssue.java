package de.ptrsauer.hubctl.githubclient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GitHubIssue {
    public Integer number;
    public String title;
}

/*
 * {
 *         "url": "https://api.github.com/repos/ptrsauer/me/issues/141",
 *         "repository_url": "https://api.github.com/repos/ptrsauer/me",
 *         "labels_url": "https://api.github.com/repos/ptrsauer/me/issues/141/labels{/name}",
 *         "comments_url": "https://api.github.com/repos/ptrsauer/me/issues/141/comments",
 *         "events_url": "https://api.github.com/repos/ptrsauer/me/issues/141/events",
 *         "html_url": "https://github.com/ptrsauer/me/issues/141",
 *         "id": 531082394,
 *         "node_id": "MDU6SXNzdWU1MzEwODIzOTQ=",
 *         "number": 141,
 *         "title": "Read JMock vs Mockito",
 *         "user": {
 *             "login": "ptrsauer",
 *             "id": 13761565,
 *             "node_id": "MDQ6VXNlcjEzNzYxNTY1",
 *             "avatar_url": "https://avatars1.githubusercontent.com/u/13761565?v=4",
 *             "gravatar_id": "",
 *             "url": "https://api.github.com/users/ptrsauer",
 *             "html_url": "https://github.com/ptrsauer",
 *             "followers_url": "https://api.github.com/users/ptrsauer/followers",
 *             "following_url": "https://api.github.com/users/ptrsauer/following{/other_user}",
 *             "gists_url": "https://api.github.com/users/ptrsauer/gists{/gist_id}",
 *             "starred_url": "https://api.github.com/users/ptrsauer/starred{/owner}{/repo}",
 *             "subscriptions_url": "https://api.github.com/users/ptrsauer/subscriptions",
 *             "organizations_url": "https://api.github.com/users/ptrsauer/orgs",
 *             "repos_url": "https://api.github.com/users/ptrsauer/repos",
 *             "events_url": "https://api.github.com/users/ptrsauer/events{/privacy}",
 *             "received_events_url": "https://api.github.com/users/ptrsauer/received_events",
 *             "type": "User",
 *             "site_admin": false
 *         },
 *         "labels": [],
 *         "state": "open",
 *         "locked": false,
 *         "assignee": null,
 *         "assignees": [],
 *         "milestone": null,
 *         "comments": 0,
 *         "created_at": "2019-12-02T12:00:10Z",
 *         "updated_at": "2019-12-02T12:00:10Z",
 *         "closed_at": null,
 *         "author_association": "OWNER",
 *         "body": "https://blog.thecodewhisperer.com/permalink/jmock-v-mockito-but-not-to-the-death"
 *     }
 */
