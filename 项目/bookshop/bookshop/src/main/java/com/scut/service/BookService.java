package com.scut.service;

import com.scut.entity.Book;
import com.scut.entity.Category;

import java.util.List;
import java.util.Map;

public interface BookService {

    Book get(int id);

    int getUserId(int id);

    void add(Book book);

    int count();

    void delete(int id);

    List<Book> list();

    /**
     * 用于myBookshelf页面，展示当前用户的图书
     *
     * @param uid      用户Id
     * @param bookType 书的类型（图书信息1/求书信息0）
     * @return 图书List
     */
    List<Book> listByUserId(int uid, int bookType);

    /**
     * 用于展示具体某类图书
     *
     * @param bookType 书的类型（图书信息1/求书信息0）
     * @param cid      CategoryId
     * @return 图书List
     */
    List<Book> listByCategoryId(int bookType, int cid);

    List<Book> listByBookType(int bookType);

    /**
     * @return 获取一个Key为Category，Value为对应当前Category的存放Book的List
     */
    Map<Category, List<Book>> listByCategory();

    void update(Book book);

    List<Category> listCategory();

    Category getCategory(int id);

    void update(Category category);

    //获取一个Key为CategoryId，Value为CategoryName的Map
    Map<Integer, String> listByMap();

    List<Book> getByKeyword(String keyword);

}
