import java.util.*;

/**
 * 2018.7.5 软件实验室培训 练习
 * 创建者：施政
 * 是认真、潇洒的徐宇泽学长上课（。＾▽＾）
 */
public class Prc_7_5 {

    public static void main(String[] args) {
        // prcScanner();
        // prcList();
        // prcMap();
        // prcSet();
        // prcDate();
        // prcCalendar();
    }


    /**
     * prc 表示练习，以下为对Scanner类的练习
     */
    public static void prcScanner(){
        System.out.print("请输入整数：" + "\n");
        Scanner scan = new Scanner(System.in);
        if(scan.hasNext()){
            int number = scan.nextInt();
            System.out.printf("输入的值为: \n%d",number);
        }
        scan.close();
    }

    /**
     * 以下是对 List 的练习
     */
    public static void prcList(){
        ArrayList<String> listString = new ArrayList<>();
        // ArrarList 的底层数据结构是数组结构 ，特点是查快，增删较慢，线程不同步
        // 区别 LinkList 和 Vector
        System.out.print("请输入字符到列表，空格分隔" + "\n");
        Scanner scan = new Scanner(System.in);
        if(scan.hasNext()){
            String[] args = scan.nextLine().split(" ");
            for (String arg : args) {
                listString.add(arg);
            }
        }
        scan.close();
        System.out.print("List内容为：" + listString.toString() + "\n");
        // 返回List对象的内容
        for(int i = 0; i < listString.size(); i++){
            System.out.print("逐个获取List中的对象： ");
            System.out.print(listString.get(i));
        }
        System.out.println("\n");
        System.out.print("用set方法，修改 List 的第一个元素为 Java使我快乐" + "\n");
        listString.set(0,"Java使我快乐");
        System.out.println(listString.get(0));
        System.out.print("修改后为： " + listString.toString());

    }

    /**
     * 以下是对 Map 的练习
     * 键值的映射
     * 类似于Python里的字典
     */
    public static void prcMap(){
        HashMap<Integer,String> mapIntStr= new HashMap<>();
        String str = "我很快乐";
        String[] strArgs = str.split("");
        for(int i = 0; i < 4; i++ ){
            mapIntStr.put(i,strArgs[i]);
        }
        for(int i = 0; i < mapIntStr.size(); i++){
            System.out.printf("%s ",mapIntStr.get(i));
        }
    }

    /**
     * 以下是对 Set 的练习
     * 特点：无序性、互异性、确定性
     */
    public static void prcSet(){
        HashSet<String> strSet = new HashSet<>();
        String str = "我很快乐乐";
        String[] strArgs = str.split("");
        for(int i = 0; i < strArgs.length; i++){
            strSet.add(strArgs[i]);
        }
        for(String s : strSet){
            System.out.print(s + " ");
        }
    }

    /**
     * 以下是对 Date 类的练习
     * 日期 即具体时间到秒；Calendar 是日历，即年月日
     */
    public static void prcDate(){
        long time = System.currentTimeMillis();
        Date date = new Date(time);
//      System.out.println(date.getTime());
//      格式不对
        System.out.println(date);

    }

    /**
     * 以下是对Calendar的练习
     */
    public static void prcCalendar(){
        Calendar calendar = Calendar.getInstance();
        //注意：Calendar 被 abstract 修饰，为抽象类，不能被实例化
        //故提供 .getInstance() 方法返回一个 Calendar 对象（子类对象），已被当前时间初始化
        System.out.println(calendar.get(Calendar.YEAR) + " " +
                (calendar.get(Calendar.MONTH )+1)  +" " + calendar.get(Calendar.DATE));
        //注意： .get(Calendar.MONTH ) 返回的月份 从 0 - 11，故需+1
    }

}
