package com.ira.service;

import com.ira.domain.AddressBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Iryna on 2/5/15.
 */
@Service
public class AddressBookManager {

    @Autowired
    protected AddressBookRepository addressBookRepository;

    public List<AddressBook> loadAddressBook() {
        return addressBookRepository.getAddressBook();

    }
}