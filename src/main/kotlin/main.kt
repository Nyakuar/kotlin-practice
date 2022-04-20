//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc     (2 points)
//
//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height    (2 points)
//
//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age   (2 points)
//
//4.  Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)
//
//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.      (3 points)


fun main() {
    var a =
        findEven(listOf("Nyakuar", "Gatwech", "Lona", "Rehal", "sab", "Nadien", "Cecilia", "Luciana", "Phiona", "Wanda"))
    println(a)
    var total = heightInmeters(listOf(5, 6, 2, 5))
    println(total)

    var Nyakuar=Person("Nyakuar",23,1.5,70)
    var Gatwech=Person("Gatwech",20,1.4,60)
    var Mollen=Person("Mollen",19,1.3,50)
    var Beryl=Person("Berly",18,1.2,40)

    var namesOfpeople= listOf(Nyakuar,)
    var descending=namesOfpeople.sortedByDescending {Person ->  Person.age}
    println(descending)

    var w=Person("Mommy",56,1.0,50)
    var q=Person("Mommy",56,7.2,60)
    var newList= mutableListOf(w,q)
    println (newList.plus(namesOfpeople))

    var subaru=Cars("KCB107L",22)
    var prado=Cars("KDC108O",23)
    var jeep=Cars("KBC198K",21)
    var range=Cars("KCA345G",20)
    var dreamcars= listOf(subaru,prado,jeep,range)
    println(car(dreamcars))

}
//1.Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc     (2 points)
fun findEven(num:List<String>):List<String>{
    var y= mutableListOf<String>()
    num.forEachIndexed { index, i ->
        if(index %2 ==0){
            y.add(i)
        }

    }
    return y
}
//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun heightInmeters(height:List<Int>):String{
    var f=height.sum()
    var g=height.average()
    var total ="$f,$g"
    return total

}
//.  Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun addPeople(twopeopl:List<Any>):List<Any>{
    return listOf()
}

//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
fun car(gari:List<Cars>):Int {
    var magari = 0
    gari.forEach { b -> b.mileage
        magari+=b.mileage
    }
    var total=magari/gari.count()
    return total
}
//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var name:String, var age:Int,var height:Double,var weight:Int)






//QUIZ 5.
data class Cars(var registration:String,var mileage:Int)