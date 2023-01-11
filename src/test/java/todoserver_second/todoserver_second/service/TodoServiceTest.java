package todoserver_second.todoserver_second.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.AdditionalAnswers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import todoserver_second.todoserver_second.model.TodoEntity;
import todoserver_second.todoserver_second.model.TodoRequest;
import todoserver_second.todoserver_second.repository.TodoRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class TodoServiceTest {


    @Mock
    private TodoRepository todoRepository;

    @InjectMocks
    private TodoService todoService;


//    @Test
//    void add() {
//        when(this.todoRepository.save(any(TodoRepository.class)))
//                .then(AdditionalAnswers.returnsFirstArg());
//        TodoRequest expected=new TodoRequest();
//        expected.setTitle("Test Title");
//        TodoEntity actual=this.todoService.add(expected);
//
//        assertEquals(expected.getTitle(),actual.getTitle());
//
//    }

    @Test
    void searchById() {
    }
}