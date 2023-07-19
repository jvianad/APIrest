package com.example.app.APIrest.Controller;
import com.example.app.APIrest.Model.Task;
import com.example.app.APIrest.Repository.iToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private iToDoRepository todorepository;

    @GetMapping(value = "/tasks")
    public List<Task> getTask(){
        return todorepository.findAll();
    }
    
    @PostMapping(value = "/savetask")
    public String saveTask(@RequestBody Task task){
        todorepository.save(task);
        return "Saved Task";
    }

    @PutMapping(value = "/updatetask/{id}")
    public String updateTask(@PathVariable long id, @RequestBody Task task){
        Task updatedTask = todorepository.findById(id).get();
        updatedTask.setTitle(task.getTitle());
        updatedTask.setDescription(task.getDescription());
        todorepository.save(updatedTask);
        return "Updated task";
    }

    @DeleteMapping(value = "/deletetask/{id}")
    public String deleteTask(@PathVariable long id){
        Task deletedTask = todorepository.findById(id).get();
        todorepository.delete(deletedTask);
        return "Deleted task";
    }

}
