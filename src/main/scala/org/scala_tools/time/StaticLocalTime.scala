/**
 * Copyright 2009 Barry Kaplan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 *
 **/
package org.scala_tools.time

import org.joda.time._
import org.scala_tools.time.Implicits._

object StaticLocalTime extends StaticLocalTime

trait StaticLocalTime {
  def now        = new LocalTime

  def lastSecond = now - 1.second
  def lastMinute = now - 1.minute
  def lastHour   = now - 1.hour
  def lastDay    = now - 1.day
  def yesterday  = now - 1.day
  def lastWeek   = now - 1.week
  def lastMonth  = now - 1.month
  def lastYear   = now - 1.year
}