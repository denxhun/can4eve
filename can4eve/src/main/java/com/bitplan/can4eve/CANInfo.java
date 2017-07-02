/**
 *
 * This file is part of the https://github.com/BITPlan/can4eve open source project
 *
 * Copyright 2017 BITPlan GmbH https://github.com/BITPlan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 *  You may obtain a copy of the License at
 *
 *  http:www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bitplan.can4eve;


/**
 * a unit of information on the CAN bus
 * @author wf
 *
 */
public class CANInfo {
  String name;
  String title;
  String description;
  String format;
  String unit;
  String type;

  int historyValuesPerMinute;
  int maxIndex;
  
  transient Pid pid;
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public Pid getPid() {
    return pid;
  }
  public void setPid(Pid pid) {
    this.pid = pid;
  }
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }
  public String getUnit() {
    return unit;
  }
  public void setUnit(String unit) {
    this.unit = unit;
  }
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }
  public int getHistoryValuesPerMinute() {
    return historyValuesPerMinute;
  }
  public void setHistoryValuesPerMinute(int historyValuesPerMinute) {
    this.historyValuesPerMinute = historyValuesPerMinute;
  }
  public int getMaxIndex() {
    return maxIndex;
  }
  public void setMaxIndex(int maxIndex) {
    this.maxIndex = maxIndex;
  }
 
}
