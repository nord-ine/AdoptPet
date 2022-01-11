import main.GodPerson;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GodPersonTest {
    private GodPerson god;

    @BeforeEach
    void setUp() {
        this.god = new GodPerson("zeus", "foudre");
    }

    @AfterEach
    void tearDown() {
        this.god = null;
    }

    @Test
    void getPerson() {
        assertNotNull(this.god.getPerson());
    }

    @Test
    void adoptPet() {
        this.god.getPerson().adoptPet();
        assertNotNull(this.god.getPerson().getPet());
    }

    @Test
    void giveNameToPet() {
        this.god.adoptPet();
        this.god.giveNameToPet("bird");
        assertEquals(this.god.getPerson().getPet().getName(), "bird");
    }

    @Test
    public void testToString() {
        assertPresentationGod();
    }

    public void assertPresentationGod() {
        assertTrue(this.god.toString().contains(this.god.getName()));
        assertTrue(this.god.toString().contains(this.god.getFeature()));
    }
}