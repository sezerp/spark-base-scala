package com.pawelzabczynski

object Main {

  def main(args: Array[String]): Unit = {

    val mainModule = new MainModule {}

    mainModule.logConfig()

    import mainModule.sparkSession.implicits._

    val ds = Seq("a", "b", "c").toDS()

    ds.show()

  }


}
