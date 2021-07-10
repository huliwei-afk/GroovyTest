class NumType {
//变量，def关键字定义, 可以不指定变量类型， 默认修饰符为public
    static void main(def args){
        def a = 1;
        def int b = 1
        int d = 1
        def c = "hello world"

        println"NumType";

        add(1, 2)
        //方法也可以没括号
        minus 2,1
    }

    //可以使用def定义方法，可以接收任意数量的参数
    def add(int a, int b){
        println a + b
    }

    //参数也可以不申明类型，默认public
    def minus(a, b){
        println a - b
    }

    //指定返回值则可以不需要def关键字
    //如果不使用return， 方法返回值为最后一行代码返回结果
    int minus2(a, b){
        //return a - b
        a - b
    }
}

