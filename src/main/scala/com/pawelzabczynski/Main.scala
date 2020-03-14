package com.pawelzabczynski

object Main extends MainModule {

  def main(args: Array[String]): Unit = {
    logConfig()
    import sparkSession.implicits._

    val ds = Seq("a", "b", "c").toDS()

    ds.show()
  }
}
