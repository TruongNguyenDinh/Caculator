/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caculator;
/**
 *
 * @author truon
 */
import com.sun.jna.Library;
import com.sun.jna.Native;

public class Caculator {
    public interface AddAction extends Library {
        AddAction INSTANCE = (AddAction) Native.load("add", AddAction.class);
        int add(int a, int b);
    }
    public interface SubAction extends Library {
        SubAction INSTANCE =  (SubAction) Native.load("sub",SubAction.class);
        double sub(double a,double b);
    }
    public interface DivAction extends Library{
        DivAction INSTANCE = (DivAction) Native.load("div",DivAction.class);
        double divi(double a,double b);
    }
    public interface MulAction extends Library{
        MulAction INSTANCE = (MulAction) Native.load("mult",MulAction.class);
        double mul(double a,double b);
    }

    public static void main(String[] args) {
        System.setProperty("jna.library.path", "D:\\JavaProject\\Caculator\\src\\caculator");
        int result = AddAction.INSTANCE.add(5, 3);
        double resultSub = SubAction.INSTANCE.sub(5, 3);
        double resultDiv = DivAction.INSTANCE.divi(5, 3);
        double resultMul = MulAction.INSTANCE.mul(5, 3);
        System.out.println("Result: " + result);
        System.out.println("Result: " + resultSub);
        System.out.println("Result: " + resultDiv);
        System.out.println("Result: " + resultMul);
    }
}
