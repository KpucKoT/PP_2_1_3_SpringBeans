package app.model;

import org.springframework.stereotype.Component;

@Component
 class Dog extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}

