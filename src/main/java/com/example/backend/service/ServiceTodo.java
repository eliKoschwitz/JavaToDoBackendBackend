package com.example.backend.service;

import com.example.backend.model.ToDo;
import com.example.backend.repo.Repo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTodo {
    Repo repo;

    public ServiceTodo(Repo repo) {
        this.repo = repo;
    }

    public List<ToDo> getToDoListService(){
        return repo.getToDoListRepo();
    }

    public ToDo addTodoService(ToDo newTodo){
        return repo.addTodoRepo(newTodo);
    }

    public ToDo getToDoByIdService(String id){
        return repo.getToDoById(id);
    }

    public ToDo putNewStatusService(String id, ToDo toDoUpdate) {
        return repo.updateToDoRepo(id, toDoUpdate);
    }

    public List<ToDo> deleteTodoService(String id) {
        return repo.deleteTodoRepo(id);
    }
}