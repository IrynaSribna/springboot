package com.ira.service;

import com.ira.domain.AddressBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Iryna on 2/5/15.
 */
@Repository
public class AddressBookRepository {

    @Autowired
    protected JdbcTemplate jdbc;

    public List<AddressBook> getAddressBook() {
        return jdbc.query("SELECT * FROM addressbook.addressbook", addressBook);
    }


    private static final RowMapper<AddressBook> addressBook = new RowMapper<AddressBook>() {
        public AddressBook mapRow(ResultSet rs, int rowNum) throws SQLException {
            AddressBook adr = new AddressBook();
            adr.setId(rs.getInt("id"));
            adr.setFirstName(rs.getString("firstname"));
            adr.setLastName(rs.getString("lastname"));

            return adr;
        }
    };


}
