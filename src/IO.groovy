class IO {
    static void main(String[] args) {
        //文件读取
        def filePath = "D:/Android/name.txt"
        def file = new File(filePath)
        file.eachLine {
            println it
        }

        //也可以更简洁
        println file.txt

        //文件写入
        file.withPrintWriter {
            it.println("123")
            it.println("345")
        }

    }
}
