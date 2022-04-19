package scgroup;

import com.google.j2cl.junit.apt.J2clTestInput;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@J2clTestInput(scmoduleTest.class)
public class scmoduleTest {

    @Test
    public void someSimpleTest() {
        assertEquals(scmodule.HELLO_WORLD, new scmodule().helloWorldString());
    }
}
