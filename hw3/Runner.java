class Runner {
  public static void main(String[] args) {
    
    Basket basket = new Basket();

    Apple a1 = new Apple();
    Apple a2 = new Apple();
    a2.setYear(2020);
    Apple a3 = new Apple(1890, false);
    Apple a4 = new Apple(2000, false);
    Apple a5 = new Apple(1995, true);

    basket.addApple(a1);
    basket.addApple(a2);
    basket.addApple(a3);
    basket.addApple(a4);
    basket.addApple(a5);

    basket.removeAllApples();

    basket.printAll();

  }
}
