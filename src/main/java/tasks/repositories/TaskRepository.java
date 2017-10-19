package tasks.repositories;

import org.springframework.data.repository.CrudRepository;

import tasks.model.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {}
