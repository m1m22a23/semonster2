/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertEqual("こんにちは SEMonster", classUnderTest.getGreeting());
    }
}