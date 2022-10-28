package com.dominos.test;

/*
Given: A string named keyword
When: We call count character method
Then: I count how many times this character appears in the keyword
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterCounterTest {

  private CharacterCounter characterCounter = new CharacterCounter();

  @Test
  @DisplayName("it counts m character")
  void shouldCountLastCharacter() {
    String keyword = "Dominos";
    assertEquals(2, characterCounter.count(keyword, '0'));
  }

  @Test
  @DisplayName("it counts three times target character")
  void shouldCountThreeCharacters() {
    String keyword = "Alabama";
    assertEquals(3, characterCounter.count(keyword, 'a'));
  }
}
