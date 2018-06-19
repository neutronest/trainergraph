package com.neulab.trainer.grpah

import com.neulab.trainer.grpah.variable.ScalarVariable

object Main extends App {

  val x = ScalarVariable("x", 10.0)
  val y = ScalarVariable("y", 20.0)
  val z = x + y
  val result = z.eval()
  print(result)



}
