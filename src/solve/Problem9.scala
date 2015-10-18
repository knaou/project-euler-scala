package solve

object Problem9 extends App {
  for (
    a <- 1 until 333;
    b <- a + 1 until 500;
    c = 1000 - a - b if a * a + b * b == c * c
  ) println(a * b * c)
}