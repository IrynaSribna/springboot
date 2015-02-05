package com.ira.web;

import com.ira.service.AddressBookManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Iryna on 2/5/15.
 */
@Controller
public class AddressBookController implements ErrorController {

    @Autowired
    protected AddressBookManager manager;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String loadAddressBook(@ModelAttribute("model") ModelMap model) {
        model.addAttribute("addressBook", manager.loadAddressBook());

        return "addressBook";
    }

    @Override
    public String getErrorPath() {
        return "/";
    }
}