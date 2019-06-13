package com.scut.service;

import com.scut.entity.BookImage;

public interface BookImageService {

    BookImage getByBookId(int bid);

    void add(BookImage bookImage);

    void update(BookImage bookImage);

    void deleteByBookId(int bid);
}
