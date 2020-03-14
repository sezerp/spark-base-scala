package com.pawelzabczynski

import com.pawelzabczynski.config.ConfigModule
import com.pawelzabczynski.spark.SparkModule

trait MainModule
  extends ConfigModule
    with SparkModule