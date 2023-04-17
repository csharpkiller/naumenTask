package ru.oop;

public interface Transport extends Positioned{

    /*
    * доехать до места
    * */
    void moveTo(Position position);

    Position getActualPersonPosition();
}
