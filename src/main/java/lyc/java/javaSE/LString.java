package lyc.java.javaSE;

class LString {
    void testString() {
        String str = "my name is David";
        System.out.println(str.indexOf("David"));
        System.out.println(str.lastIndexOf("is"));
        System.out.println("Hello "+ str.substring(str.indexOf("David"), str.indexOf("David")+5));
    }
    void testStringBuilder() {
        // StringBuffer str = new StringBuffer("my name is:");
        StringBuilder str = new StringBuilder("my name is:");
        System.out.println(str.append("David"));
        System.out.println(str.insert(str.indexOf("name")-1, " family"));
        System.out.println(str.replace(str.indexOf(":"), str.indexOf(":")+1, " "));
        System.out.println(str.delete(str.indexOf("family"), str.indexOf("family")+7));
        System.out.println(str.reverse());
    }
}
