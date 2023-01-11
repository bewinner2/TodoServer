package todoserver_second.todoserver_second.service;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import todoserver_second.todoserver_second.model.TodoEntity;
import todoserver_second.todoserver_second.model.TodoRequest;
import todoserver_second.todoserver_second.repository.TodoRepository;

import java.util.List;


//필요 기능
//        1	todo 리스트 목록에 아이템을 추가
//        2	todo  리스트 목록 중 특정 아이템을 조회
//        3	todo 리스트 전체 목록을 조회
//        4	todo 리스트 목록 중 특정 아이템을 수정
//        5	todo 리스트 목록 중 특정 아이템을 삭제
//        6	todo 리스트 전체 목록을 삭제
@Service
@AllArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;


    //        1	todo 리스트 목록에 아이템을 추가
    public TodoEntity add(TodoRequest request){

        TodoEntity todoEntity=new TodoEntity();

        todoEntity.setTitle(request.getTitle());
        todoEntity.setOrder(request.getOrder());
        todoEntity.setCompleted(request.getCompleted());

        return  this.todoRepository.save(todoEntity);


    }


    //        2	todo  리스트 목록 중 특정 아이템을 조회

    public TodoEntity searchById(Long id){

         return   this.todoRepository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));


    }

    //        3	todo 리스트 전체 목록을 조회
    public List<TodoEntity> searchAll(){
        return this.todoRepository.findAll();
    }


    //        4	todo 리스트 목록 중 특정 아이템을 수정


    public TodoEntity updateById(Long id, TodoRequest Request){
        TodoEntity todoEntity=this.searchById(id);

        if(Request.getTitle()!=null){
            todoEntity.setTitle(Request.getTitle());
        }

        if(Request.getOrder()!=null){
            todoEntity.setOrder(Request.getOrder());
        }

        if(Request.getCompleted()!=null){
            todoEntity.setCompleted(Request.getCompleted());
        }

        return this.todoRepository.save(todoEntity);
    }

    //        5	todo 리스트 목록 중 특정 아이템을 삭제


    public void deleteById(Long id){

        this.todoRepository.deleteById(id);

    }

    //        6	todo 리스트 전체 목록을 삭제

    public void deleteAll(){
        this.todoRepository.deleteAll();

    }



}
