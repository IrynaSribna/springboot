package com.ira;

import com.ira.domain.AddressBook;
import com.ira.service.AddressBookManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application
{
    public static void main( String[] args )
    {
        ApplicationContext context = SpringApplication.run(Application.class);
        AddressBookManager manager = (AddressBookManager) context.getBean(AddressBookManager.class);
        List<AddressBook> addressBooks = manager.loadAddressBook();

        System.out.println(addressBooks.toString());
    }
}
