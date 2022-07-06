package semonster2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
  public List<Monster> monsters;
  public String name;

  Player(String name) {
    this.name = name;
    this.monsters = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i <= 3; i++) {
      this.monsters.add(new Monster(i, random.nextInt(5)));
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Deck:" + this.name + "\n");
    for (Monster m : this.monsterDeck) {
      sb.append(m);
    }
    return sb.toString();
  }
}
