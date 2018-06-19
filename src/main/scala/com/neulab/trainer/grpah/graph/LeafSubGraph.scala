package com.neulab.trainer.grpah.graph

import com.neulab.trainer.grpah.variable.Variable

class LeafSubGraph[T](var dataVariable: Variable[T]) extends Graph[T] {

  def compute() : T = {
    this.dataVariable.eval()
  }
}
