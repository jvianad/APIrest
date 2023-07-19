package com.example.app.APIrest.Controller;
import com.example.app.APIrest.Model.Task;
import com.example.app.APIrest.Repository.iToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    

}
