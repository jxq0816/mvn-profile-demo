import com.weeking.share.config.Global;
import org.junit.Test;

public class TestProfile {
    @Test
    public void profile(){
        String username= Global.getConfig("jdbc.username");
        System.out.println(username);
    }
}
