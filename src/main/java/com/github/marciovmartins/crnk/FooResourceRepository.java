package com.github.marciovmartins.crnk;

import io.crnk.core.exception.MethodNotAllowedException;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.ResourceList;
import org.springframework.stereotype.Controller;

@Controller
public class FooResourceRepository extends ResourceRepositoryBase<Foo, Long> {
    public FooResourceRepository() {
        super(Foo.class);
    }

    @Override
    public <S extends Foo> S create(S resource) {
        resource.setId(1L);
        return resource;
    }

    @Override
    public ResourceList<Foo> findAll(QuerySpec querySpec) {
        throw new MethodNotAllowedException("method not allowed");
    }
}
