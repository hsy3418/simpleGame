
 fun main(){
    var game = Game(Player("",0,mapOf(0 to 1),0,0),Player("",0,mapOf(0 to 1),0,0))
    game.startGame()

}    
class Player(var name:String,var score:Int,
var titles: Map<Int,Int>,var lastTileKey:Int,var roundsWon: Int){}

class Game(var humanPlayer:Player,var computerPlayer:Player){


   
//verifyName check if name's length is between 3 and 10
    fun verifyName(nameInput:String): Boolean{
        return checkStringLength(nameInput,3,10)
    }

    fun checkStringLength(input:String,legalminLengh:Int,legalMaxLength:Int) : Boolean{
        if (input.length < legalminLengh || input.length > legalMaxLength){
            return false;
        }
        return true;
    
    }


    fun playGame(){

    }

    fun displayMenu() = 
        println(
        ("""
        1. Register a player
        2. Start a game
        3. Help Menu
        4. Exit
        """).trimIndent())


    fun startGame() {

        var flag = false //if flag is false, the menu will be keep displaying
        while (!flag){
        //displayMenu
        displayMenu()
        //wait for user input
        var option= readLine()
        //case 1,2,3,4 and default
        when(option?.toInt()){
            1 ->  registerPlayer() 
            2 ->  playGame()
            3 ->  helpMenu()
            4 ->  exit()
            else -> println("Wrong input")
        }
    }
    }    

    fun registerPlayer(){
        println("Please enter your name")
        var input = readLine()
        if(verifyName(input!!)) {
            println("Right Name")
            humanPlayer.name = input
        }
        else{
            println("The name should have a length of 3 to 10")
        }
    }

fun helpMenu() = 
"""
"""

fun exit(){

}
}