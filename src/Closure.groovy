class Closure {
    static void main(String[] args) {
        //闭包遵循以下语法

        /*
        闭包分为两部分，参数列表parameter和语句statements
        { [closureParameters -> ] statements }

        参数列表是可选的，如果闭包只有一个参数，则参数名可选，groovy隐式指定it作为参数名
        如 {print it}

        当需要指定参数列表时，需要用 -> 将参数列表和闭包体相分离
        { it -> println it }
        {String a, String b -> println "${a} is ${b}}

        闭包是java.lang.Cloush类的一个实例，可以赋值给变量或字段
        def println = {it -> println it}
        assert println instanceof Closure

        闭包可以赋值给Closure类型
        Closure do = {println 'do!'}


         */
    }
}
