package com.example.backend.repo;

import com.example.backend.model.ToDo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Repository
public class Repo {
    //= new ArrayList<>(List.of(new ToDo("1", "Sport", "Open"),(new ToDo("2", "Arbeit", "Open"))));
    private final List<ToDo> toDoList;


    public Repo(List<ToDo> toDoList) {
        this.toDoList = toDoList;
    }


    public List<ToDo> getToDoListRepo(){
        return toDoList;
    }

    public ToDo addTodoRepo(ToDo newTodo) {
        newTodo.setId(addOneToTheId());
        toDoList.add(newTodo);
        return newTodo;
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

    public ToDo updateToDoRepo(String id, ToDo toDoUpdate) {
        ToDo safeATodo = null;
        for(ToDo currentTodo : toDoList) {
            if(currentTodo.getId().equals(id)){ // == geht nicht nur equals(id)
                currentTodo.setStatus(toDoUpdate.getStatus());
                currentTodo.setId(toDoUpdate.getId());
                currentTodo.setDescription(toDoUpdate.getDescription());
                safeATodo = currentTodo;
            }
        }
        return safeATodo;
    }

    public List<ToDo> deleteTodoRepo(String id) {
        ToDo toDo = null;
        for (ToDo currentTodo : toDoList) {
            if (currentTodo.getId().equals(id)) {
                toDo = currentTodo;
            }
        }
        toDoList.remove(toDo);
        return toDoList;
    }

    public void deleteTodoRepoWieMuslim(String id){
        toDoList.remove(getToDoById(id));
    }
}
