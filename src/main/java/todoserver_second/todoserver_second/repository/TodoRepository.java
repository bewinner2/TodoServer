package todoserver_second.todoserver_second.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todoserver_second.todoserver_second.model.TodoEntity;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity,Long> {
}
