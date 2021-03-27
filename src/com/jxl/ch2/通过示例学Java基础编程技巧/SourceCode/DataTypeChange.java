public class DataTypeChange {
    public static void main(String[] args) {
        int intValue = 100;
        long longValue = intValue;
        //两个数值大小还一样吗？
        System.out.println(intValue == longValue);//true

        double doubleValue = 1234567890987654321d;
        float floatValue = (float) doubleValue;
        //floatValue能表达的数值范围有限，并不能精确地容纳
        //各种double类型的数值
        System.out.println(floatValue);//1.23456794E18
        //两个数值大小还一样吗？
        System.out.println(doubleValue == floatValue);//false

        double someDoubleValue = 156.5d;
        //创建double对应的包装类型
        Double doubleObj = Double.valueOf(someDoubleValue);
        //Double包装类型提供了很多种方法转换为其他类型的数值
        byte myByteValue = doubleObj.byteValue();
        int myIntValue = doubleObj.intValue();
        float myFloatValue = doubleObj.floatValue();
        String myString = doubleObj.toString();
    }
}
