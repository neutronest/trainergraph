/*
 * Copyright (c) 2018.
 */

package com.neulab.trainer.grpah.node.function

import com.neulab.trainer.grpah.variable.Variable

class AddNode[T: Numeric](var _name: String) extends BinaryFunctionNode[T] {

  override def fn: (T, T) => T = (t1, t2) =>
    (implicitly[Numeric[T]].toDouble(t1) + implicitly[Numeric[T]].toDouble(t2)).asInstanceOf[T]
}
