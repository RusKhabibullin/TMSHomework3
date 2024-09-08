package Homework10.User;

import java.util.Objects;

public class User implements Cloneable {
    private int id;
    private String name;
    private String email;

    // Конструктор
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }

    // Переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }

    // Переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(email, user.email);
    }

    // Поверхностное клонирование
    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    // Глубокое клонирование
    public User deepClone() {
        // Для глубокого клонирования, нужно копировать все изменяемые поля
        return new User(this.id, this.name, this.email);
    }
}