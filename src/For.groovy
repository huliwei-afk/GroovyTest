class For {
    static void main(String[] args) {
        def x = 0
        for(i in 0..3){
            x += i
        }

        //也支持普通for和增强for
        for(int i = 0; i < 3; i++){
            x += i
        }

        //遍历列表
        def y = 0
        for(i in [0,1,2,3]){
            y += i
        }

        //遍历map
        def map = ['a':1, 'b':2, 'c':3]
        int z = 0;
        for(i in map.values()){
            z += i
        }
    }
}
