package tasks.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import tasks.model.Task;

@CrossOrigin
public interface TaskRepository extends CrudRepository<Task, Long> {}
