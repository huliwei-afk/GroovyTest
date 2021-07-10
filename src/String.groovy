class String {
    //字符串分为普通字符串String和插值字符串GString
    //普通字符串分三种如下
    static void main(String[] args) {
        //单引号和双引号都可以定义一个字符串常量
        //但是单引号字符串不支持插值
        def x = 'Android 进阶揭秘'
        println x

        //双引号字符串支持插值
        def name = 'Android'
        println "hello ${name}"
        println "hello $name"

        //三引号字符串可以保留文本的换行和缩进格式
        //不支持插值
        def y = '''Android进阶之光
                Android进阶揭秘
        Android进阶？'''
        println y

        //GString可变，即使GString与String有相同的字面量，但是他们的hashcode也可能不一样
        //因此要避免GString作为map的key
        //当双引号字符串中包含插值时，字符串类型为GString，因此为true
        assert "one: ${1}".hashCode() != "one: 1".hashCode()
    }
}
