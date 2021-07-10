class Switch {
    static void main(String[] args) {
        def x = 16
        def result = ""

        //groovy的switch能兼容java代码，也支持更多类型
        switch (x){
            case "ok":
                result = "found ok"

            case [1,2,4, 'list']:
                result = "list"
                break

            case 10..19:
                result = "range"
                break

            case Integer:
                result = "integer"
                break

            default:
                result = "default"
        }
        assert result == "range"
    }
}
