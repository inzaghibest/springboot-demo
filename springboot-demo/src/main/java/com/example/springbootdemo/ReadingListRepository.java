package com.example.springbootdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * @Description
 * @Date 2021/1/11 14:53
 * Created by zhangxp.
 */
// Spring Data提供了神奇的魔法，只需要定义仓库接口，在应用程序启动后，该接口在运行时会自动实现。
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
