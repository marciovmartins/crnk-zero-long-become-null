package com.github.marciovmartins.crnk;

import io.crnk.client.CrnkClient;
import io.crnk.core.repository.ResourceRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooResourceRepositoryTest {
    @Test
    void test() {
        CrnkClient client = new CrnkClient("http://localhost:8080");
        ResourceRepository<Foo, Long> fooResourceRepository = client.getRepositoryForType(Foo.class);

        Foo newFoo1 = new Foo();
        newFoo1.setBar(1L);
        Foo foo1 = fooResourceRepository.create(newFoo1);
        assertEquals(1L, foo1.getBar());

        Foo newFoo2 = new Foo();
        newFoo2.setBar(0L);
        Foo foo2 = fooResourceRepository.create(newFoo2);
        assertEquals(0L, foo2.getBar());
    }
}
