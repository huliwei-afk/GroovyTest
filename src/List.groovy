class List {
    static void main(String[] args) {
        //默认为ArrayList
        def number = [1,2,3]
        assert number instanceof List

        //显示指定
        def linkedList = [1,2,3] as LinkedList
        assert linkedList instanceof java.util.LinkedList

        def num = [1,2,3,4]
        assert num [1] == 2
        //-1指的是末尾第一个元素
        assert num [-1] == 4

        //<<运算符末尾追加一个元素
        num << 5
        assert num[4] == 5
        assert num[-1] == 5

        num >> 0
        assert num[0] == 0

    }
}
