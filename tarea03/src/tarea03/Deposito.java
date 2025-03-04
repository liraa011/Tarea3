package tarea03;

import java.util.ArrayList;

import javax.swing.JPanel;

class Deposito {

    //Arraylist que se encargan de añadir o quitar elementos tipo moneda o bebida segun corresponda
    private ArrayList b;
    private ArrayList m;

    public Deposito() {
        b = new ArrayList();
        m = new ArrayList();
    }

    public void addBebida(Bebida num) {
        b.add(num);
    }

    public Bebida getBebida(int x) {
        if (b.size() <= 0) {
            return null;
        } else {
            Bebida a = (Bebida) b.get(x);
            b.get(x);
            b.remove(x);
            return a;
        }
    }

    public void rellenadoC(int x, JPanel panel) {
        while (b.size() < 6) {
            addBebida(new CocaCola(x - 69 * b.size(), panel, CocaCola.contador));
        }
    }

    public void rellenadoS(int x, JPanel panel) {
        while (b.size() < 6) {
            addBebida(new Sprite(x - 69 * b.size(), panel, Sprite.contador));
        }
    }

    public void rellenadoF(int x, JPanel panel) {
        while (b.size() < 6) {
            addBebida(new Fanta(x - 69 * b.size(), panel, Fanta.contador));
        }
    }

    public void actualizarC() {
        for (int i = 0; i < b.size(); i++) {
            ((CocaCola) b.get(i)).updatelabel(i);
        }
    }

    public void actualizarS() {
        for (int i = 0; i < b.size(); i++) {
            ((Sprite) b.get(i)).updatelabel(i);
        }
    }

    public void actualizarF() {
        for (int i = 0; i < b.size(); i++) {
            ((Fanta) b.get(i)).updatelabel(i);
        }
    }

    public void addMoneda(Moneda x) {
        m.add(x);
    }

    public Moneda getMoneda() {
        if (m.size() <= 0) {
            return null;
        } else {
            Moneda a = (Moneda) m.remove(0);
            return a;
        }
    }
}
