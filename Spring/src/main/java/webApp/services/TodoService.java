package webApp.services;

import org.springframework.stereotype.Service;
import webApp.todo.Todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static final List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;

    static {
        todos.add(new Todo(++todosCount, "in28minutes", "Learn Spring MVC", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "in28minutes", "Learn Struts", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todosCount, "in28minutes", "Learn Hibernate", LocalDate.now().plusYears(3), false));
        todos.add(new Todo(++todosCount, "in28minutes", "Learn Java", LocalDate.now().plusYears(4), false));
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean isDone) {
        todos.add(new Todo(++todosCount, username, description, targetDate, isDone));
    }

    public void deleteTodo(int id) {
        todos.removeIf(todo -> todo.getId() == id);
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
