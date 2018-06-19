package com.neulab.trainer.grpah.node.function

trait UnaryFunctionNode[T] extends FunctionNode[T] {

  def fn: T => T
}
