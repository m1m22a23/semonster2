
public class PlayerTest {
  @Test
  public void appHasAGreeting() {
    Monster monster = new Monster(0, 0);
    assertEquals("スライム:レア度[0]¥n", monster.toString());
  }
}
