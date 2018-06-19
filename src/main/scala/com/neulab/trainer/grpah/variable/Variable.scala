package com.neulab.trainer.grpah.variable

import com.neulab.trainer.grpah.graph.Graph

trait Variable[T] {

  def name(): String

  def eval(): T
}

