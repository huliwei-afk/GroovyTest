//默认类修饰符为public
class Person {
    String name
    Integer age = 10
    //没有可见性字段会自动生成对应的setter和getter方法
    def increaseAge(Integer years){
        this.age += years
    }

    static void main(String[] args) {
        def p = new Person()
        p.increaseAge 5
        print p.age
    }
}
