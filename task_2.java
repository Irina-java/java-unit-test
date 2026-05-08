@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
}
@Test
public void checkIsAdultWhenAgeIsLessThan18False() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(17);
    assertEquals("Ошибка: возвраст 17 не является совершеннолетним", false, isAdult);
}
@Test
public void checkIsAdultWhenAgeIs18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(18);
    assertEquals("Ошибка: возвраст 18 должен считаться совершеннолетним", true,  isAdult);
}
// Напиши код здесьf
