package singleton;


public class M01 {
    private static volatile M01 INSTANCE;

    public static M01 getINSTANCE(){

        if (INSTANCE == null){
            synchronized (M01.class){
                if(INSTANCE == null){
                    INSTANCE = new M01();
                }
            }
        }
        return INSTANCE;
    }

}
