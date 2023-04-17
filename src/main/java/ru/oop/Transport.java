package ru.oop;

public interface Transport extends Positioned{
    /*
    * Проехать до места
    * */
    void moveTo(Position position);

    /*
    * Показать куда доехал человек
    * */
    Position getActualPersonPosition();
}
