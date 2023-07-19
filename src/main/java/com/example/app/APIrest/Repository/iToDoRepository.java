package com.example.app.APIrest.Repository;

import com.example.app.APIrest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iToDoRepository extends JpaRepository<Task,Long> {
}
