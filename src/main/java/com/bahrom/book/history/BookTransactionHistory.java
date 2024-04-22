package com.bahrom.book.history;

import com.bahrom.book.book.Book;
import com.bahrom.book.common.BaseEntity;
import com.bahrom.book.user.User;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class  BookTransactionHistory extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "user id")
     private User user;

    @ManyToOne
    @JoinColumn(name = "book id")
     private Book book;


    private boolean returned;
    private boolean returnedApproved;

}
