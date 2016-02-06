package trs.timereporting.domain;

/**
 * Created by williamzappasodi on 1/30/16.
 */


import com.trs.timereporting.domain.Project;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProjectTest {

    private Project project;

    @Before
    public void setUp() {

    }

    @Test
    public void check_that_the_client_id_is_an_integer() {

        project = new Project();
        // Arrange
        Integer myNewClientId =3;

        // Act
        project.setClientId(myNewClientId);

        // Assert
        Assert.assertEquals(Integer.valueOf(myNewClientId),project.getClientId());


    }
}
