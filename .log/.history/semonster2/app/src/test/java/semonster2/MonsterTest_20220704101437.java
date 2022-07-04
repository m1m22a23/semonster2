package semonster2;

public class MonsterTest {
  @Test
  public void appHasAGreeting() {
    App classUnderTest = new App();
    assertEquals("こんにちは SEMonster", classUnderTest.getGreeting());
  }
}
