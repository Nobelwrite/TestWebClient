package com.webclienttesting.rest;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.apache.catalina.User;

@Route("")
public class UserList extends VerticalLayout {
    public UserList(UserService userService) {
        var grid = new Grid<User>(User.class);
        grid.setItems(userService.getUser());
        grid.setColumns("name", "phone", "website", "company.name");

        add(grid);
    }
}
