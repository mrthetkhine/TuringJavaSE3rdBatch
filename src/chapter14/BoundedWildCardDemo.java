/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14;

/**
 *
 * @author thetkhine
 */
class TwoD
{
    int x,y;
    TwoD(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
}
class ThreeD extends TwoD
{
    int z;
    ThreeD(int x, int y, int z)
    {
        super(x,y);
        this.z = z;
    }
}
class FourD extends ThreeD
{
    int t;
    FourD(int x,int y,int z , int t)
    {
        super(x,y,z);
        this.t = t;
    }
}
class Coord<T extends TwoD>
{
    T coord;
    Coord(T coord)
    {
        this.coord = coord;
    }
    
}
public class BoundedWildCardDemo {
    static public void show(Coord<?> c)
    {
        System.out.println("X "+ c.coord.x);
        System.out.println("Y "+c.coord.y);
    }
    static public void showXYZ(Coord<? extends ThreeD> c)
    {
        System.out.println("X "+ c.coord.x);
        System.out.println("Y "+c.coord.y);
        System.out.println("Z "+c.coord.z);
    }
    public static void main(String[] args) {
        TwoD twoD = new TwoD(1,2);
        ThreeD threeD = new ThreeD(1,2,3);
        
        Coord<TwoD> corTwoD = new Coord<TwoD>(twoD);
        show(corTwoD);
        
        Coord<ThreeD> corThreeD = new Coord<ThreeD>(threeD);
        showXYZ(corThreeD);
    }
}
