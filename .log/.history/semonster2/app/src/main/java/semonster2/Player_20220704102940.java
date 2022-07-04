package semonster2;

import java.util.List;

public class Player {
  public List<Monster> monsters;
  public String name;


  Player(String name) {
    this.name = name;
    this.monsters=new List<Monster> ();

  }
}
