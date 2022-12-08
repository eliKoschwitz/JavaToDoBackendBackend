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
    public void postATodo(@RequestBody ToDo newTodo){
        service.addTodoService(newTodo);
    }

    @GetMapping("/api/todo/{id}")
    public ToDo getTodos(@PathVariable String id){
        return service.getToDoByIdService(id);
    }

    @PutMapping("/api/todo/{id}")
    public void updateTodo(@PathVariable String id, @RequestBody ToDo toDoUpdate){
        service.putNewStatusService(id, toDoUpdate);
        service.getToDoByIdService(id);
    }

    @DeleteMapping("api/todo/{id}")
    public void deleteTodo(@PathVariable String id) {
        service.deleteTodoService(id);
    }
}
