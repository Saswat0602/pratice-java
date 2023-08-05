package pratice;

public class Saswat {
    public static void main(String[] args ) {
        StringBuffer sb=new StringBuffer("Hello ");
        System.out.println(sb.charAt(4));
        System.out.println(sb);
        sb.setCharAt(2,'z');
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append(" saswat ");
        System.out.println(sb.delete(2,5));
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append(" welcome to our world ");
//        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
        sb.setLength(5);
        System.out.println(sb);
    }
}