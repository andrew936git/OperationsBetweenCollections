//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("=====================1======================")
    val list = listOf("one", "two", "three")
    val newList: MutableList<String> = mutableListOf()
    for (i in list){
        newList.add(i.reversed())
    }
    println(newList)
    println("=====================2======================")
    val array: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val newArray: MutableList<Int> = mutableListOf()
    for (i in array){
        if (i <= 3) newArray.add(i*i)
    }
    println(newArray)
    println("=====================3======================")
    val colorEng: List<String> = listOf("red", "blue", "white")
    val colorRus: List<String> = listOf("красный", "синий", "белый")
    val translateColor: MutableList<Pair<String,String>> = mutableListOf()
    for (i in colorEng.indices){
        translateColor.add("Значение: ${colorEng[i]}" to "перевод: ${colorRus[i]}")
    }
    println(translateColor)
    println("=====================4======================")
    val month: Array<String> = arrayOf("Jan", "Feb", "Mar", "Apr", "May")
    var count = 0
    for (i in month){
        count += i.length
    }
    println(month.contentToString())
    println("Количество символов = $count")
}