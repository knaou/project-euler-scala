package solve

object Problem19 extends App {
  var day = 1
  var count = 0

  var mdays = Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
  var mdays_u = Array(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
  Range(1901, 2000 + 1).foreach { x =>
    val days = if (x % 4 == 0 && !(x % 400 != 0 && x % 100 == 0)) { mdays_u } else { mdays }
    days.foldLeft(day) { (x, y) =>
      if ((x + y + 1) % 7 == 0) count += 1
      x + y
    }
    day += days.sum
  }
  println(count)
}