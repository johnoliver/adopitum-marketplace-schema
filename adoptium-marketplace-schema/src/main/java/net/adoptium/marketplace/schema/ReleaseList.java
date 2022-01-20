package net.adoptium.marketplace.schema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ReleaseList {

    private final List<Release> releases;

    @JsonCreator
    public ReleaseList(
            @JsonProperty("releases") List<Release> releases
    ) {
        this.releases = releases;
    }

    public List<Release> getReleases() {
        return releases;
    }
}
