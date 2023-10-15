import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RepoEmployee implements DBCommunication<Employee> {
    @Override
    public Employee update(Employee object) {
        System.out.println("Update employee by ID: " + object.getId());
        /*
        Изменяем сотрудника
         */
        return object;
    }

    @Override
    public Employee add(Employee object) {
        System.out.println("Add to database: " + object.toString());
        /*
        Добавляем сотрудника
        Получаем id
        object.setId(id);
        */
        return object;
    }

    @Override
    public List<Employee> select(String where) {
        List<Employee> employees = new ArrayList<>();
        System.out.println("Get employees where " + where);
        /*
        Получаем список сорудников из БД и записываем в List
         */
        return employees;
    }

    @Override
    public Employee getById(int id) {
        /*
        Получаем данные из бд
         */
        // Получаем должность по id должности
        Position position = new RepoPosition().getById(new Random().nextInt());
        // Создаем объект Сотрудник по данным из БД
        Employee employee = new Employee("", "", 0, position); // Заглушка
        System.out.println("Get Employee by id: " + id);
        return employee;
    }

    @Override
    public void delete(Employee object) {
        System.out.println("Delete employee");
        /*
        Удаляем сотрудника
         */
    }
}
