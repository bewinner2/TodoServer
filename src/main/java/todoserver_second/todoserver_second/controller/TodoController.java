package todoserver_second.todoserver_second.controller;


import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import todoserver_second.todoserver_second.model.TodoResponse;
import todoserver_second.todoserver_second.service.TodoService;

import java.util.List;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping("/")
public class TodoController {

    private final TodoService todoService;

    @PostMapping
    public ResponseEntity<TodoResponse> create(){
        System.out.println("CREATE");
        return null;
    }

    @GetMapping("{id}")
    public ResponseEntity<TodoResponse> readOne(){
        System.out.println("READ ONE");
        return null;
    }

    @GetMapping
    public ResponseEntity<List<TodoResponse>> readAll(){
        System.out.println("READ ALL");
        return null;
    }

    @PatchMapping("{id}")
    public ResponseEntity<TodoResponse> update(){
        System.out.println("UPDATE");
        return null;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteOne(){
        System.out.println("DELETE");
        return null;
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAll(){
        System.out.println("DELETE ALL");

        return null;
    }

}
