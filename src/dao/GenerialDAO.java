/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;
import java.util.List;

// ABSTRACTION - ini interface general yg mendefinisikan CRUD
// POLYMORPHISM - semua DAO wajib mengimplementasikan operasi ini
// intinya semua class DAO diwajibkan punya dasar CURD

public interface GenerialDAO<T> {
    void insert(T obj);
    void update(T obj);
    void delete(int id);
    T findById(int id);
    List<T> findAll();
    
}
