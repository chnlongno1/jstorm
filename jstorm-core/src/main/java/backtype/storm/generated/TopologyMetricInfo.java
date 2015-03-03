/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package backtype.storm.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TopologyMetricInfo implements org.apache.thrift7.TBase<TopologyMetricInfo, TopologyMetricInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift7.protocol.TStruct STRUCT_DESC = new org.apache.thrift7.protocol.TStruct("TopologyMetricInfo");

  private static final org.apache.thrift7.protocol.TField TOPOLOGY_ID_FIELD_DESC = new org.apache.thrift7.protocol.TField("topology_id", org.apache.thrift7.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift7.protocol.TField TASK_METRIC_LIST_FIELD_DESC = new org.apache.thrift7.protocol.TField("task_metric_list", org.apache.thrift7.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift7.protocol.TField WORKER_METRIC_LIST_FIELD_DESC = new org.apache.thrift7.protocol.TField("worker_metric_list", org.apache.thrift7.protocol.TType.LIST, (short)3);

  private String topology_id; // required
  private List<TaskMetricData> task_metric_list; // required
  private List<WorkerMetricData> worker_metric_list; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift7.TFieldIdEnum {
    TOPOLOGY_ID((short)1, "topology_id"),
    TASK_METRIC_LIST((short)2, "task_metric_list"),
    WORKER_METRIC_LIST((short)3, "worker_metric_list");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TOPOLOGY_ID
          return TOPOLOGY_ID;
        case 2: // TASK_METRIC_LIST
          return TASK_METRIC_LIST;
        case 3: // WORKER_METRIC_LIST
          return WORKER_METRIC_LIST;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift7.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPOLOGY_ID, new org.apache.thrift7.meta_data.FieldMetaData("topology_id", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING)));
    tmpMap.put(_Fields.TASK_METRIC_LIST, new org.apache.thrift7.meta_data.FieldMetaData("task_metric_list", org.apache.thrift7.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift7.meta_data.ListMetaData(org.apache.thrift7.protocol.TType.LIST, 
            new org.apache.thrift7.meta_data.StructMetaData(org.apache.thrift7.protocol.TType.STRUCT, TaskMetricData.class))));
    tmpMap.put(_Fields.WORKER_METRIC_LIST, new org.apache.thrift7.meta_data.FieldMetaData("worker_metric_list", org.apache.thrift7.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift7.meta_data.ListMetaData(org.apache.thrift7.protocol.TType.LIST, 
            new org.apache.thrift7.meta_data.StructMetaData(org.apache.thrift7.protocol.TType.STRUCT, WorkerMetricData.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift7.meta_data.FieldMetaData.addStructMetaDataMap(TopologyMetricInfo.class, metaDataMap);
  }

  public TopologyMetricInfo() {
  }

  public TopologyMetricInfo(
    String topology_id)
  {
    this();
    this.topology_id = topology_id;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TopologyMetricInfo(TopologyMetricInfo other) {
    if (other.is_set_topology_id()) {
      this.topology_id = other.topology_id;
    }
    if (other.is_set_task_metric_list()) {
      List<TaskMetricData> __this__task_metric_list = new ArrayList<TaskMetricData>();
      for (TaskMetricData other_element : other.task_metric_list) {
        __this__task_metric_list.add(new TaskMetricData(other_element));
      }
      this.task_metric_list = __this__task_metric_list;
    }
    if (other.is_set_worker_metric_list()) {
      List<WorkerMetricData> __this__worker_metric_list = new ArrayList<WorkerMetricData>();
      for (WorkerMetricData other_element : other.worker_metric_list) {
        __this__worker_metric_list.add(new WorkerMetricData(other_element));
      }
      this.worker_metric_list = __this__worker_metric_list;
    }
  }

  public TopologyMetricInfo deepCopy() {
    return new TopologyMetricInfo(this);
  }

  @Override
  public void clear() {
    this.topology_id = null;
    this.task_metric_list = null;
    this.worker_metric_list = null;
  }

  public String get_topology_id() {
    return this.topology_id;
  }

  public void set_topology_id(String topology_id) {
    this.topology_id = topology_id;
  }

  public void unset_topology_id() {
    this.topology_id = null;
  }

  /** Returns true if field topology_id is set (has been assigned a value) and false otherwise */
  public boolean is_set_topology_id() {
    return this.topology_id != null;
  }

  public void set_topology_id_isSet(boolean value) {
    if (!value) {
      this.topology_id = null;
    }
  }

  public int get_task_metric_list_size() {
    return (this.task_metric_list == null) ? 0 : this.task_metric_list.size();
  }

  public java.util.Iterator<TaskMetricData> get_task_metric_list_iterator() {
    return (this.task_metric_list == null) ? null : this.task_metric_list.iterator();
  }

  public void add_to_task_metric_list(TaskMetricData elem) {
    if (this.task_metric_list == null) {
      this.task_metric_list = new ArrayList<TaskMetricData>();
    }
    this.task_metric_list.add(elem);
  }

  public List<TaskMetricData> get_task_metric_list() {
    return this.task_metric_list;
  }

  public void set_task_metric_list(List<TaskMetricData> task_metric_list) {
    this.task_metric_list = task_metric_list;
  }

  public void unset_task_metric_list() {
    this.task_metric_list = null;
  }

  /** Returns true if field task_metric_list is set (has been assigned a value) and false otherwise */
  public boolean is_set_task_metric_list() {
    return this.task_metric_list != null;
  }

  public void set_task_metric_list_isSet(boolean value) {
    if (!value) {
      this.task_metric_list = null;
    }
  }

  public int get_worker_metric_list_size() {
    return (this.worker_metric_list == null) ? 0 : this.worker_metric_list.size();
  }

  public java.util.Iterator<WorkerMetricData> get_worker_metric_list_iterator() {
    return (this.worker_metric_list == null) ? null : this.worker_metric_list.iterator();
  }

  public void add_to_worker_metric_list(WorkerMetricData elem) {
    if (this.worker_metric_list == null) {
      this.worker_metric_list = new ArrayList<WorkerMetricData>();
    }
    this.worker_metric_list.add(elem);
  }

  public List<WorkerMetricData> get_worker_metric_list() {
    return this.worker_metric_list;
  }

  public void set_worker_metric_list(List<WorkerMetricData> worker_metric_list) {
    this.worker_metric_list = worker_metric_list;
  }

  public void unset_worker_metric_list() {
    this.worker_metric_list = null;
  }

  /** Returns true if field worker_metric_list is set (has been assigned a value) and false otherwise */
  public boolean is_set_worker_metric_list() {
    return this.worker_metric_list != null;
  }

  public void set_worker_metric_list_isSet(boolean value) {
    if (!value) {
      this.worker_metric_list = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPOLOGY_ID:
      if (value == null) {
        unset_topology_id();
      } else {
        set_topology_id((String)value);
      }
      break;

    case TASK_METRIC_LIST:
      if (value == null) {
        unset_task_metric_list();
      } else {
        set_task_metric_list((List<TaskMetricData>)value);
      }
      break;

    case WORKER_METRIC_LIST:
      if (value == null) {
        unset_worker_metric_list();
      } else {
        set_worker_metric_list((List<WorkerMetricData>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPOLOGY_ID:
      return get_topology_id();

    case TASK_METRIC_LIST:
      return get_task_metric_list();

    case WORKER_METRIC_LIST:
      return get_worker_metric_list();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPOLOGY_ID:
      return is_set_topology_id();
    case TASK_METRIC_LIST:
      return is_set_task_metric_list();
    case WORKER_METRIC_LIST:
      return is_set_worker_metric_list();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TopologyMetricInfo)
      return this.equals((TopologyMetricInfo)that);
    return false;
  }

  public boolean equals(TopologyMetricInfo that) {
    if (that == null)
      return false;

    boolean this_present_topology_id = true && this.is_set_topology_id();
    boolean that_present_topology_id = true && that.is_set_topology_id();
    if (this_present_topology_id || that_present_topology_id) {
      if (!(this_present_topology_id && that_present_topology_id))
        return false;
      if (!this.topology_id.equals(that.topology_id))
        return false;
    }

    boolean this_present_task_metric_list = true && this.is_set_task_metric_list();
    boolean that_present_task_metric_list = true && that.is_set_task_metric_list();
    if (this_present_task_metric_list || that_present_task_metric_list) {
      if (!(this_present_task_metric_list && that_present_task_metric_list))
        return false;
      if (!this.task_metric_list.equals(that.task_metric_list))
        return false;
    }

    boolean this_present_worker_metric_list = true && this.is_set_worker_metric_list();
    boolean that_present_worker_metric_list = true && that.is_set_worker_metric_list();
    if (this_present_worker_metric_list || that_present_worker_metric_list) {
      if (!(this_present_worker_metric_list && that_present_worker_metric_list))
        return false;
      if (!this.worker_metric_list.equals(that.worker_metric_list))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_topology_id = true && (is_set_topology_id());
    builder.append(present_topology_id);
    if (present_topology_id)
      builder.append(topology_id);

    boolean present_task_metric_list = true && (is_set_task_metric_list());
    builder.append(present_task_metric_list);
    if (present_task_metric_list)
      builder.append(task_metric_list);

    boolean present_worker_metric_list = true && (is_set_worker_metric_list());
    builder.append(present_worker_metric_list);
    if (present_worker_metric_list)
      builder.append(worker_metric_list);

    return builder.toHashCode();
  }

  public int compareTo(TopologyMetricInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TopologyMetricInfo typedOther = (TopologyMetricInfo)other;

    lastComparison = Boolean.valueOf(is_set_topology_id()).compareTo(typedOther.is_set_topology_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_topology_id()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.topology_id, typedOther.topology_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_task_metric_list()).compareTo(typedOther.is_set_task_metric_list());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_task_metric_list()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.task_metric_list, typedOther.task_metric_list);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_worker_metric_list()).compareTo(typedOther.is_set_worker_metric_list());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_worker_metric_list()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.worker_metric_list, typedOther.worker_metric_list);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift7.protocol.TProtocol iprot) throws org.apache.thrift7.TException {
    org.apache.thrift7.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift7.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // TOPOLOGY_ID
          if (field.type == org.apache.thrift7.protocol.TType.STRING) {
            this.topology_id = iprot.readString();
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // TASK_METRIC_LIST
          if (field.type == org.apache.thrift7.protocol.TType.LIST) {
            {
              org.apache.thrift7.protocol.TList _list259 = iprot.readListBegin();
              this.task_metric_list = new ArrayList<TaskMetricData>(_list259.size);
              for (int _i260 = 0; _i260 < _list259.size; ++_i260)
              {
                TaskMetricData _elem261; // required
                _elem261 = new TaskMetricData();
                _elem261.read(iprot);
                this.task_metric_list.add(_elem261);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // WORKER_METRIC_LIST
          if (field.type == org.apache.thrift7.protocol.TType.LIST) {
            {
              org.apache.thrift7.protocol.TList _list262 = iprot.readListBegin();
              this.worker_metric_list = new ArrayList<WorkerMetricData>(_list262.size);
              for (int _i263 = 0; _i263 < _list262.size; ++_i263)
              {
                WorkerMetricData _elem264; // required
                _elem264 = new WorkerMetricData();
                _elem264.read(iprot);
                this.worker_metric_list.add(_elem264);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift7.protocol.TProtocol oprot) throws org.apache.thrift7.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.topology_id != null) {
      oprot.writeFieldBegin(TOPOLOGY_ID_FIELD_DESC);
      oprot.writeString(this.topology_id);
      oprot.writeFieldEnd();
    }
    if (this.task_metric_list != null) {
      if (is_set_task_metric_list()) {
        oprot.writeFieldBegin(TASK_METRIC_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift7.protocol.TList(org.apache.thrift7.protocol.TType.STRUCT, this.task_metric_list.size()));
          for (TaskMetricData _iter265 : this.task_metric_list)
          {
            _iter265.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.worker_metric_list != null) {
      if (is_set_worker_metric_list()) {
        oprot.writeFieldBegin(WORKER_METRIC_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift7.protocol.TList(org.apache.thrift7.protocol.TType.STRUCT, this.worker_metric_list.size()));
          for (WorkerMetricData _iter266 : this.worker_metric_list)
          {
            _iter266.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TopologyMetricInfo(");
    boolean first = true;

    sb.append("topology_id:");
    if (this.topology_id == null) {
      sb.append("null");
    } else {
      sb.append(this.topology_id);
    }
    first = false;
    if (is_set_task_metric_list()) {
      if (!first) sb.append(", ");
      sb.append("task_metric_list:");
      if (this.task_metric_list == null) {
        sb.append("null");
      } else {
        sb.append(this.task_metric_list);
      }
      first = false;
    }
    if (is_set_worker_metric_list()) {
      if (!first) sb.append(", ");
      sb.append("worker_metric_list:");
      if (this.worker_metric_list == null) {
        sb.append("null");
      } else {
        sb.append(this.worker_metric_list);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift7.TException {
    // check for required fields
    if (!is_set_topology_id()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'topology_id' is unset! Struct:" + toString());
    }

  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

