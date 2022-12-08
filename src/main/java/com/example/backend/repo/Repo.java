package com.example.backend.repo;

import com.example.backend.model.ToDo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.NoSuchElementException;

@Repository
public class Repo {

    private final List<ToDo> toDoList;

    public Repo(List<ToDo> toDoList) {
        this.toDoList = toDoList;
    }

    public List<ToDo> getToDoListRepo(){
        return toDoList;
    }

    public boolean addTodoRepo(ToDo newTodo) {
        newTodo.setId(addOneToTheId());
        return toDoList.add(newTodo);
    }

    private String addOneToTheId(){
        ToDo lastTodoInList;
        int intID;
        if(toDoList.size() == 0){
            intID = 1;
        } else {
            lastTodoInList = toDoList.get(toDoList.size() - 1);
            String strID = lastTodoInList.getId();
            intID =Integer.parseInt(strID);
            intID = intID + 1;
        }
        return String.valueOf(intID);
    }

    public ToDo getToDoById(String id) {
        for(ToDo currentTodo : toDoList) {
            if(currentTodo.getId().equals(id)){ // == geht nicht nur equals(id)
                return currentTodo;
            }
        }
        throw new NoSuchElementException("No Element");
    }

    public void updateToDo(String id, ToDo toDoUpdate) {
        for(ToDo currentTodo : toDoList) {
            if(currentTodo.getId().equals(id)){ // == geht nicht nur equals(id)
                currentTodo.setStatus(toDoUpdate.getStatus());
                currentTodo.setId(toDoUpdate.getId());
                currentTodo.setDescription(toDoUpdate.getDescription());
            }
        }
    }

    public void deleteTodoRepo(String id) {
        ToDo toDo = null;
        for (ToDo currentTodo : toDoList) {
            if (currentTodo.getId().equals(id)) {
                toDo = currentTodo;
            }
        }
        toDoList.remove(toDo);
    }

    public void deleteTodoRepoWieMuslim(String id){
        toDoList.remove(getToDoById(id));
    }
}
