package com.pelaghisoftware.com.debug.service.builder;

import com.pelaghisoftware.com.debug.response.Thing;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Builder {

    public Thing buildThing(Optional<Thing> thing) {
        //TODO: Remove after debugging complete.
        System.out.println("Entering Builder.buildThing");

        Thing temp = thing.orElse(new Thing());

        //TODO: Remove after debugging complete.
        System.out.println("temp assigned with: " + temp.toString());

        String name = Optional.ofNullable(temp.getName()).orElse("new name");

        //TODO: Remove after debugging complete.
        System.out.println("name assigned with: " + name);

        int id = temp.getId();

        //TODO: Remove after debugging complete.
        System.out.println("id assigned with: " + id);

        String description = Optional.ofNullable(temp.getDescription()).orElse("new description");

        //TODO: Remove after debugging complete.
        System.out.println("description assigned with: " + description);

        return new Thing(name, id, description);
    }
}
