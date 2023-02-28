fun main(){
  var student1=Human("Regina",32,45)
student1.increment(1)
    println(student1.age)
    var myPerson= Person("Eunice","Chege","chegeunice@gmail.com","0794362077","eunice254")
    println(myPerson.email)
    println(myPerson.LastName)
    student1.speak("hello world")
    var foodWeight=6
   println("i am eating $foodWeight kgs of food")


}
class Human(var name:String,var age:Int,var weight:Int){
    fun speak(speech:String){
        println(speech)
    }
    fun eat(foodWeight:Int){
        weight+=foodWeight



    }
    fun increment(incremetion:Int) :Int{
        age+= incremetion
        return age
    }
    }


data class Person(var FirstName:String,var LastName:String,var email:String,var phonenumber:String, var password: String)

