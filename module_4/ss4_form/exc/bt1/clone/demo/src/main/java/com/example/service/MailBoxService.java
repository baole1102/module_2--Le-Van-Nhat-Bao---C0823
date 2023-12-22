package com.example.service;

import com.example.model.MailBox;
import com.example.repository.IMailBoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailBoxService implements IMailBoxService{
    @Autowired
    IMailBoxRepository mailBoxRepository;

    @Override
    public MailBox selectMailBox() {
        return mailBoxRepository.selectMailBox();
    }

    @Override
    public MailBox updateMailBox(MailBox newMailBox) {
        return mailBoxRepository.updateMailBox(newMailBox);
    }
}