import kotlin.random.Random

fun main(args: Array<String>)
{
     //Task_1__________________________________________________________________________________________________
    val myAge = 18;
    val isTeenager = myAge >= 13 && myAge <= 19;
    println(isTeenager);

    //Task_2__________________________________________________________________________________________________
    val theirAge = 30;
    val bothTeenagers = (theirAge >= 13 && theirAge <= 19) && isTeenager;
    println(bothTeenagers);

    //Task_3__________________________________________________________________________________________________
    val reader = "Lilia";
    val author = "Richard Lucas";

    val authorsReader = reader == author;
    println(authorsReader);

    //Task_4__________________________________________________________________________________________________
    val readerBeforeAuthor = reader < author;
    println(readerBeforeAuthor);

    //Task_5__________________________________________________________________________________________________
    val myAge2 = 18;
    if (myAge2 >= 13 && myAge2 <= 19)
    {
        println("Подросток");
    }


    //Task_6__________________________________________________________________________________________________
    val answer = if (myAge2 >= 13 && myAge2 <= 19)
    {
        "Подросток";

    }else
      {
          "Взрослый";

      }
    println(answer);

    //Task_7__________________________________________________________________________________________________
    var counter = 0;
    while (counter < 10)
    {
        counter += 1;
        println("Вывод :$counter");
    }//вывод .. который равен x

    //Task_8__________________________________________________________________________________________________
   run {
         var counter = 0;
       var roll = 0;
       do {
           //roll = Random().nextInt(6)//выбор случайного числа между 0 и 5
           counter += 1;
           println("После $counter бросков, roll = $roll");
          } while ( roll != 0)


       }
    //Task_9__________________________________________________________________________________________________
    val range = 1 .. 10;
    for (i in  range){
        val square = i * i;
        println("Вывод $i: $square");
    }

    //Task_10__________________________________________________________________________________________________
    run {
        val range = 1 .. 10;
    for (i in  range) {
        val square = Math.sqrt(i.toDouble());
        println("Вывод $i: $square");
    }
    }
    //Task_11__________________________________________________________________________________________________
    var sum = 0;

     for (row in 1 until 8 step 2)
         {
         for (column in 0 until 8)
         {
             sum += row * column;
         }
     }
    println("Вывод: $sum");


}