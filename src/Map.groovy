class Map {
    static void main(String[] args) {
        //默认实现LinkedHashMap
        def name = [one: '魏无羡', two: '杨英风', three: '张无忌']
        assert name ['one'] == '魏无羡'
        assert name.two == '杨英风'

        def key = 'name'
        //此处键值是key这个字符串，而不是key变量的值
        def person = [key: '魏无羡']
        assert person.containsKey('key')

        //此处键值是key变量
        person = [(key): '魏无羡']
        assert person.containsKey('name')
    }
}
