import kotlin.math.pow
import kotlin.math.round
fun main(){
    /*var num=readln()!!.toDouble()
    when{
        (num>2) -> println((1/(num.pow(2)+4*num+5)))
        (num<=2) -> println(num.pow(2)+4*num+5)
    }*/
    var num=readln()!!.toDouble()
    when{
        (num>=0)&&(num<=2) -> println("младенец")
        (num>2)&&(num<=7) -> println("ребенок")
        (num>7)&&(num<=14) -> println("что-то между")
        (num>14)&&(num<=18) -> println("подросток")
        (num>18)&&(num<=30) -> println("в расцвете сил")
        (num>30)&&(num<=65) -> println("взрослый")
        (num>65) -> println("пенсионер")
        else -> println("нет")
    }



}