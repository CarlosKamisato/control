package com.kibernumacademy.miapp;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

  @Test
  void testCalculateSum() {
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      assertEquals(60, App.calculateSum(numbers));
  }
  
  @Test
  void testConvertToUpperCase() {
      List<String> strings = Arrays.asList("hola", "mundo", "java", "8");
      assertEquals(Arrays.asList("HOLA", "MUNDO", "JAVA", "8"), App.convertToUpperCase(strings));
  }
  
}
