package com.neulab.trainer.grpah.node.function

import com.neulab.trainer.grpah.variable.Variable

trait BinaryFunctionNode[T] extends FunctionNode[T] {

  def fn: (T, T) => T
}
