package com.example.repository;

import com.example.model.MailBox;

public interface IMailBoxRepository {
    MailBox selectMailBox();
    MailBox updateMailBox(MailBox newMailBox);
}
