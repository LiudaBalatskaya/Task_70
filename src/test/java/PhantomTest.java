import base.TestBasePhantomJS;
import org.junit.Test;

/**
 * Created by LiudaBalatskaya on 8/4/2017.
 */
public class PhantomTest extends TestBasePhantomJS {
    @Test
    public void gotoRMSYS() {
        verifyRMSYS();
    }
}
