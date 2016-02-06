package trs.timereporting.domain;

import com.trs.timereporting.domain.Client;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by williamzappasodi on 1/31/16.
 */
public class ClientTest {


    private Client client;

    @Before
    public void setUp() {
    }

    @Test
    public void check_that_the_name_field_is_not_empty_and_is_a_string() {

        client = new Client();
        // Arrange
        String testName = "Steven";
        client.setName(testName);
        // act

        // assert

        Assert.assertEquals(String.valueOf(testName),client.getName());


    }

}
