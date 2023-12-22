package com.example.service;

import com.example.model.MailBox;

public interface IMailBoxService {
    MailBox selectMailBox();
    MailBox updateMailBox(MailBox newMailBox);
}
