package cn.com.agree.abs.design.create;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Iterm> iterms = new ArrayList<>();

    public void addIterm(Iterm iterm){
        iterms.add(iterm);
    }

    public float getCost(){
        float cost=0.0f;
        for (Iterm iterm : iterms) {
            cost+=iterm.price();
        }
        return cost;
    }

    public void showIterms(){
        for (Iterm iterm : iterms) {
            System.out.println("Iterm:"+iterm.name()+",");
            System.out.println("Packing:"+iterm.packing().pack()+",");
            System.out.println("Price:"+iterm.price()+".");
        }
    }
}
