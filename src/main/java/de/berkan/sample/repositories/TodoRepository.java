package de.berkan.sample.repositories;

import de.berkan.sample.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface TodoRepository
        extends CrudRepository<Todo,Integer> {

    Set<Todo> findAllByUserId(int userId);

}
