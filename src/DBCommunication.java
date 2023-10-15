import java.util.List;

public interface DBCommunication<T> {
    T update(T object);
    T add (T object);
    List<T> select(String where);
    T getById(int id);
    void  delete (T object);
}
