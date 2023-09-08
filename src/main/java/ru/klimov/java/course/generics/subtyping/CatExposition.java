package ru.klimov.java.course.generics.subtyping;

import ru.klimov.java.course.generics.subtyping.logic.Exposition;
import ru.klimov.java.course.generics.subtyping.modal.*;

public class CatExposition {

    public static void main(String[] args) {
        Angora mursik = new Angora("Mursik");
        Bengal pushok = new Bengal("Pushok");
        Persian king = new Persian("King");
        Sphynx bee = new Sphynx("Bee");

        Exposition<Persian> expositionCat = new Exposition<>();
        //Exposition<Bengal> expositionCat2 = new Exposition<>();//Bengal не имплементит интерфейсы Run и Say
        //expositionCat.addCat(mursik);
        //expositionCat.addCat(pushok);
        expositionCat.addCat(king);
        //expositionCat.addCat(bee);
    }
}
