package com.group.libraryapp.domain.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserLoanHistory {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long userId;
    private String bookName;
    private boolean isReturn;

    public UserLoanHistory(long userId, String bookName) {
        this.userId = userId;
        this.bookName = bookName;
        this.isReturn = false;  // 처음엔 무조건 대출중이지 않은상태이기 때문에 false
    }

    protected UserLoanHistory() {

    }

    public void doReturn() {
        isReturn = true;
    }
}
