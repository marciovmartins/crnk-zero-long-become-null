package com.github.marciovmartins.crnk;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "foo")
public class Foo {
    @JsonApiId
    private Long id;
    private Long bar;

    public Long getBar() {
        return bar;
    }

    public void setBar(Long bar) {
        this.bar = bar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
