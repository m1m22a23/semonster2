package semonster2;

public class Monster {
  public String Name;
  public int Rare;

  Monster(int nameNum, int RareNum) {
    this.Name = this.summonMonster(nameNum, RareNum);
    this.Rare = RareNum;
  }

  String summonMonster(int mNumber, int RareNum) {
    String monsters[] = { "スライム", "ゴーレム", "ドラゴンボール", "イガキング" };
    String evol_monsters[] = {"キングスライム", "", "神龍", "イガキング"}
    return monsters[mNumber];
  }

  @Override
  public String toString() {
    return this.Name + ":レア度[" + this.Rare + "]¥n";
  }
}
