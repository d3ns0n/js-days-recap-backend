package tasks.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import tasks.model.Task;

@CrossOrigin
public interface TaskRepository extends CrudRepository<Task, Long> {
    List<Task> findByTaskListId(@Param("taskListId") Long taskListId);
}
