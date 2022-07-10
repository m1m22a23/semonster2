package semonster2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MonsterTest {
  @Test
  public void monsterToString() {
    Monster monster = new Monster(0, 0);
    assertEquals("スライム:レア度[0]", monster.toString());
  }

  @Test
  public void evolMonsterToString() {
    Monster monster = new Monster(0, 3);
    assertEquals("キングスライム:レア度[3]", monster.toString());
  }
}
