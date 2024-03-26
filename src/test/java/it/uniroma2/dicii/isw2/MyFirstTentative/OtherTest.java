package it.uniroma2.dicii.isw2.MyFirstTentative;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class OtherTest {
	// An instance of the Class Under Test
    App cut;
    
    @Before
    public void configureApp(){
        this.cut = new App();
    }
    @Test
    public void assessChk()
    {
        assertTrue( this.cut.chk() );
    }
	
    @Test
    public void assessChkz()
    {
        assertTrue( this.cut.chk() );
    }

}
