package com.neulab.trainer.grpah.graph

import com.neulab.trainer.grpah.node.function.{FunctionNode, UnaryFunctionNode}


class UnarySubGraph[T](var op: UnaryFunctionNode[T],
                       var graph: Graph[T]) {

  def compute(): T = {
    op.fn(graph.compute())
  }

}
