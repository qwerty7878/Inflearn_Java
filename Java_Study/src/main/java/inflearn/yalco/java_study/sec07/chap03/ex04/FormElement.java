package inflearn.yalco.java_study.sec07.chap03.ex04;

public abstract class FormElement {
    public enum MODE { LIGHT, DARK }

    private static MODE mode = MODE.LIGHT;

    public void printMode () {
        System.out.println(mode);
    }

    abstract void func ();
}
