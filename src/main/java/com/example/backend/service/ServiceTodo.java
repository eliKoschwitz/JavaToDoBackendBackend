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


    public void addTodoService(ToDo newTodo){
        repo.addTodoRepo(newTodo);
    }

    public ToDo getToDoByIdService(String id){
        return repo.getToDoById(id);
    }

    public void putNewStatusService(String id, ToDo toDoUpdate) {
        repo.updateToDo(id, toDoUpdate);
    }

    public void deleteTodoService(String id) {
        repo.deleteTodoRepo(id);
    }
}
