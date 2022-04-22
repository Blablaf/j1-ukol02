package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    public void main(String[] args) {
        Turtle leo;
        leo = new Turtle();
        leo.setPenColor(Color.green);
        leo.setSpeed(50);

        leo.setLocation(100, 250);
        nakresliZmrzlinu(leo);

        leo.setLocation(500, 595);
        nakresliSnehulaka(leo);

        leo.setLocation(1450, 450);
        leo.turnRight(270.0);
        nakresliVlak(leo);

    }

    private void nakresliZmrzlinu(Turtle leo) {
        leo.turnRight(90.0);
        nakresliTrojuhelnik(leo, 170.0);
        leo.turnRight(270.0);
        leo.setLocation(100, 240);
        nakresliKolo(leo, 23.0);
    }


    private void nakresliTrojuhelnik(Turtle leo, double delkaStrany) {
        for (int i = 0; i < 3; i++) {
            leo.move(delkaStrany);
            leo.turnRight(120.0);
        }
    }

    private void nakresliTrojuhelnik1(Turtle leo, double delkaStrany) {
        for (int i = 0; i < 3; i++) {
            leo.move(delkaStrany);
           leo.turnRight(240.0);
        }
    }


    private void nakresliObdelnik(Turtle leo, double velikostStranyA, double velikostStranyB) {
        for (int i = 0; i < 2; i++) {
            leo.move(velikostStranyA);
           leo.turnLeft(90.0);
            leo.move(velikostStranyB);
            leo.turnLeft(90.0);
        }
    }

    private void nakresliKolo(Turtle leo, double delkaStrany) {
        for (int i = 0; i < 24; i++) {
            leo.move(delkaStrany);
            leo.turnRight(15.0);
        }
    }

    private void nakresliKoloVlak(Turtle leo, double delkaStrany) {
        for (int i = 0; i < 24; i++) {
            leo.move(delkaStrany);
            leo.turnLeft(15.0);
        }
    }

    private void nakresliKoloVlak1(Turtle leo, double delkaStrany) {
        for (int i = 0; i < 24; i++) {
            leo.move(delkaStrany);
            leo.turnLeft(15.0);
        }
    }

    private void nakresliKoloSnehulak1(Turtle leo, double delkaStrany) {
        for (int i = 0; i < 24; i++) {
            leo.move(delkaStrany);
            leo.turnRight(15.0);
        }
    }

    private void nakresliKoloSnehulak2(Turtle leo, double delkaStrany) {
        for (int i = 0; i < 24; i++) {
            leo.move(delkaStrany);
            leo.turnLeft(15.0);
        }
    }

    private void nakresliKoloSnehulak3(Turtle leo, double delkaStrany) {
        for (int i = 0; i < 24; i++) {
            leo.move(delkaStrany);
            leo.turnLeft(15.0);
        }
    }

    private void nakresliKoloSnehulakRuce(Turtle leo, double delkaStrany) {
        for (int i = 0; i < 24; i++) {
            leo.move(delkaStrany);
            leo.turnLeft(15.0);
        }
    }

    private void nakresliSnehulaka(Turtle leo) {
        nakresliKoloSnehulak1(leo, 28.0);

        leo.penUp();
        leo.setLocation(595, 465);

        leo.turnRight(90.0);
        leo.penDown();
        nakresliKoloSnehulak2(leo, 19.0);

        leo.penUp();
        leo.setLocation(685, 390);
        leo.turnRight(90.0);
        leo.penDown();
        nakresliKoloSnehulakRuce(leo, 10);

        leo.penUp();
        leo.setLocation(534, 399);
        leo.turnRight(180.0);
        leo.penDown();
        nakresliKoloSnehulakRuce(leo, 10.0);

        leo.penUp();
        leo.setLocation(605, 313.084);
        leo.turnRight(90.0);
        leo.penDown();
        nakresliKoloSnehulak3(leo, 15.0);
    }

    private void nakresliVlak(Turtle leo) {
        nakresliObdelnik(leo, 230, 155);
        nakresliKoloVlak(leo, 21.0);
        leo.penUp();
        leo.turnLeft(90.0);
        leo.move(150.0);
        leo.turnRight(90.0);
        leo.move(155.0);
        leo.turnLeft(90.0);
        leo.penDown();
        nakresliObdelnik(leo, 250, 150);

        leo.penUp();
        leo.turnLeft(90.0);
        leo.move(150.0);
        leo.turnRight(90.0);
        leo.move(62.5);
        leo.penDown();

        nakresliKoloVlak1(leo, 10.0);

        leo.penUp();
        leo.move(125.0);
        leo.penDown();

        nakresliKoloVlak1(leo, 10.0);

        leo.penUp();
        leo.move(62.5);
        leo.turnRight(90.0);
        leo.move(120.0);
        leo.turnLeft(120.0);
        leo.penDown();

        nakresliTrojuhelnik1(leo, 170.0);

    }

}
