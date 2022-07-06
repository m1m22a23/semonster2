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
    for (int i = 0; i <= 3;i++){
      this.monsters.add(new Monster(i, random.nextInt(5)));
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i=0; i<=monsters.size(); i++){
      m=m.append(this.monsters.get(i).toString());
    }
    return ;
  }
}
