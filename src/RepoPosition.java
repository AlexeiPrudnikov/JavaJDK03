import java.util.ArrayList;
import java.util.List;

public class RepoPosition implements DBCommunication<Position>{
    @Override
    public Position update(Position object) {
        System.out.println("Update position");
        return object;
    }

    @Override
    public Position add(Position object) {
        /*
        Добавляем должность
        Получаем id
        object.setId(id);
         */
        System.out.println("Add position");
        return object;
    }

    @Override
    public List<Position> select(String where) {
        List<Position> positions = new ArrayList<>();
        System.out.println("Get positions " + where);
        /*
        Получаем список должностей из БД
         */
        return positions;
    }

    @Override
    public Position getById(int id) {
        Position position = new Position(""); //Заглушка
        /*
        Получаем должность по ключу
         */
        System.out.println("Get position by ID: " + id);
        return position;
    }

    @Override
    public void delete(Position object) {
        /*
        Удаляем должность по ключу
         */
        System.out.println("Delete position");
    }
}
