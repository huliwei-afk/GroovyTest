class Else {
    static void main(String[] args) {
        //asType数据类型转换
        String a = '23'
        int b = a as int
        def c = a.asType(Integer)
        assert c instanceof java.lang.Integer

        //判断是否为真
        String name = 'ww'
        if(name != null && name.length > 0){}
        //可以被替换为
        if(name){}

        // ?.安全取值
        //println school?.student?.name

        //with操作符
        /*
            Person p = new Person()
            p.with{
                name = "wwe"
                age = 19
                sex = "男"
            }

         */


    }
}
