package com.neulab.trainer.grpah.graph

import com.neulab.trainer.grpah.node.function.BinaryFunctionNode

class BinarySubGraph[T](var op: BinaryFunctionNode[T],
                        var graphLeft: Graph[T],
                        var graphRight: Graph[T]) extends Graph[T] {

  def compute() : T = {
    op.fn(graphLeft.compute(), graphRight.compute())
  }

}
