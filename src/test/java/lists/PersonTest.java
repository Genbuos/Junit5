package lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void setName() {
        var p1 = new Person();
        var name = "Jordy";
        p1.setName(name);

        assertEquals(name, p1.getName());
    }

    @Test
    void setAge() {
        var p1 = new Person();
        var age = 30;
        p1.setAge(age);
        assertEquals(age, p1.getAge());
    }

    @Test
    void getName() {
        var p1 = new Person("Jordy");
        assertEquals("Jordy", p1.getName());
    }

    @Test
    void getAge() {
        var p1 = new Person("Julio", 55);
        assertEquals(55, p1.getAge());
    }

    @Test
    void addName() {
        var p1 = new Person("Tanzir");
        p1.addName(p1.getName());

       assertTrue(p1.getListOfNames().contains(p1.getName()));
    }

    @Test
    void removeName() {
        var p1 = new Person("Tanzir");
        p1.addName(p1.getName());
        p1.removeName(p1.getName());

        assertTrue(p1.getListOfNames().isEmpty());

    }

    @Test
    void getSizeOfList() {
        var p1 = new Person("Tanzir");
        p1.addName(p1.getName());

        assertTrue(p1.getSizeOfList() == 1);

    }
}