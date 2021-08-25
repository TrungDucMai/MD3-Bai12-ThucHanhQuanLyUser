package dao;

import model.User;



import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    //bo sung bai tap bai 12:
    public List<User> findByCountry (String country) throws SQLException;
    public List<User> softByName();


    //Bo sung thuc hanh bai 13:
    User getUserById(int id);
    void insertUserStore(User user) throws SQLException;
    void addUserTransaction(User user, int[] permision);
}