package com.example.backend.controller;

import com.example.backend.model.ToDo;
import com.example.backend.service.ServiceTodo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ControllerTodo {
    private final ServiceTodo service;

    public ControllerTodo(ServiceTodo service) {
        this.service = service;
    }

    @GetMapping("/api/todo")
    public List<ToDo> getTodos(){
        return service.getToDoListService(); // an dieser Stelle wird meine Liste in ein JSON gemappt!
    }

    @PostMapping("/api/todo")
    public ToDo postATodo(@RequestBody ToDo newTodo){
        return service.addTodoService(newTodo);
    }

    @GetMapping("/api/todo/{id}")
    public ToDo getTodoById(@PathVariable String id){
        return service.getToDoByIdService(id);
    }

    @PutMapping("/api/todo/{id}")
    public ToDo updateTodo(@PathVariable String id, @RequestBody ToDo toDoUpdate){
        return service.putNewStatusService(id, toDoUpdate);
    }

    @DeleteMapping("/api/todo/{id}")
    public List<ToDo> deleteTodo(@PathVariable String id) {
        return service.deleteTodoService(id);
    }
}
