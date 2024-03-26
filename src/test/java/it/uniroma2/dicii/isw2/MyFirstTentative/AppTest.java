package it.uniroma2.dicii.isw2.MyFirstTentative;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	// An instance of the Class Under Test
    App cut;
    
    @Before
    public void configureApp(){
        this.cut = new App();
    }
    
    @Test
    public void assessInc()
    {
        int i = 10;
        int outcome = this.cut.inc(i);
        assertEquals(i+1,outcome);
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
