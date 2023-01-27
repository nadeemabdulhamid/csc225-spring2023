class ReverseCard extends ColorCard {
  public Player applyTo(Player p) {
    /* 
     * in a full implementation, this method would
     * do stuff related to the actual card.
     * 
     * for this assignment, we just care about getting
     * the order of play working...
     */
    return p.reversePlay();
  }
}