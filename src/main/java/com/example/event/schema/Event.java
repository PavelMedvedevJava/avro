/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.event.schema;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Event extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1045607790723745704L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Event\",\"namespace\":\"com.example.event.schema\",\"fields\":[{\"name\":\"eventId\",\"type\":\"int\",\"default\":1},{\"name\":\"title\",\"type\":\"string\",\"default\":\"all team meeting\"},{\"name\":\"place\",\"type\":\"string\",\"default\":\"MS teams\"},{\"name\":\"speaker\",\"type\":[\"null\",\"string\"]},{\"name\":\"eventType\",\"type\":\"string\",\"default\":\"daily\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Event> ENCODER =
      new BinaryMessageEncoder<Event>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Event> DECODER =
      new BinaryMessageDecoder<Event>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Event> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Event> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Event>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Event to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Event from a ByteBuffer. */
  public static Event fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int eventId;
  @Deprecated public java.lang.CharSequence title;
  @Deprecated public java.lang.CharSequence place;
  @Deprecated public java.lang.CharSequence speaker;
  @Deprecated public java.lang.CharSequence eventType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Event() {}

  /**
   * All-args constructor.
   * @param eventId The new value for eventId
   * @param title The new value for title
   * @param place The new value for place
   * @param speaker The new value for speaker
   * @param eventType The new value for eventType
   */
  public Event(java.lang.Integer eventId, java.lang.CharSequence title, java.lang.CharSequence place, java.lang.CharSequence speaker, java.lang.CharSequence eventType) {
    this.eventId = eventId;
    this.title = title;
    this.place = place;
    this.speaker = speaker;
    this.eventType = eventType;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return eventId;
    case 1: return title;
    case 2: return place;
    case 3: return speaker;
    case 4: return eventType;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: eventId = (java.lang.Integer)value$; break;
    case 1: title = (java.lang.CharSequence)value$; break;
    case 2: place = (java.lang.CharSequence)value$; break;
    case 3: speaker = (java.lang.CharSequence)value$; break;
    case 4: eventType = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'eventId' field.
   * @return The value of the 'eventId' field.
   */
  public java.lang.Integer getEventId() {
    return eventId;
  }

  /**
   * Sets the value of the 'eventId' field.
   * @param value the value to set.
   */
  public void setEventId(java.lang.Integer value) {
    this.eventId = value;
  }

  /**
   * Gets the value of the 'title' field.
   * @return The value of the 'title' field.
   */
  public java.lang.CharSequence getTitle() {
    return title;
  }

  /**
   * Sets the value of the 'title' field.
   * @param value the value to set.
   */
  public void setTitle(java.lang.CharSequence value) {
    this.title = value;
  }

  /**
   * Gets the value of the 'place' field.
   * @return The value of the 'place' field.
   */
  public java.lang.CharSequence getPlace() {
    return place;
  }

  /**
   * Sets the value of the 'place' field.
   * @param value the value to set.
   */
  public void setPlace(java.lang.CharSequence value) {
    this.place = value;
  }

  /**
   * Gets the value of the 'speaker' field.
   * @return The value of the 'speaker' field.
   */
  public java.lang.CharSequence getSpeaker() {
    return speaker;
  }

  /**
   * Sets the value of the 'speaker' field.
   * @param value the value to set.
   */
  public void setSpeaker(java.lang.CharSequence value) {
    this.speaker = value;
  }

  /**
   * Gets the value of the 'eventType' field.
   * @return The value of the 'eventType' field.
   */
  public java.lang.CharSequence getEventType() {
    return eventType;
  }

  /**
   * Sets the value of the 'eventType' field.
   * @param value the value to set.
   */
  public void setEventType(java.lang.CharSequence value) {
    this.eventType = value;
  }

  /**
   * Creates a new Event RecordBuilder.
   * @return A new Event RecordBuilder
   */
  public static com.example.event.schema.Event.Builder newBuilder() {
    return new com.example.event.schema.Event.Builder();
  }

  /**
   * Creates a new Event RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Event RecordBuilder
   */
  public static com.example.event.schema.Event.Builder newBuilder(com.example.event.schema.Event.Builder other) {
    return new com.example.event.schema.Event.Builder(other);
  }

  /**
   * Creates a new Event RecordBuilder by copying an existing Event instance.
   * @param other The existing instance to copy.
   * @return A new Event RecordBuilder
   */
  public static com.example.event.schema.Event.Builder newBuilder(com.example.event.schema.Event other) {
    return new com.example.event.schema.Event.Builder(other);
  }

  /**
   * RecordBuilder for Event instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Event>
    implements org.apache.avro.data.RecordBuilder<Event> {

    private int eventId;
    private java.lang.CharSequence title;
    private java.lang.CharSequence place;
    private java.lang.CharSequence speaker;
    private java.lang.CharSequence eventType;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.event.schema.Event.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.eventId)) {
        this.eventId = data().deepCopy(fields()[0].schema(), other.eventId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.title)) {
        this.title = data().deepCopy(fields()[1].schema(), other.title);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.place)) {
        this.place = data().deepCopy(fields()[2].schema(), other.place);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.speaker)) {
        this.speaker = data().deepCopy(fields()[3].schema(), other.speaker);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.eventType)) {
        this.eventType = data().deepCopy(fields()[4].schema(), other.eventType);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Event instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.event.schema.Event other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.eventId)) {
        this.eventId = data().deepCopy(fields()[0].schema(), other.eventId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.title)) {
        this.title = data().deepCopy(fields()[1].schema(), other.title);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.place)) {
        this.place = data().deepCopy(fields()[2].schema(), other.place);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.speaker)) {
        this.speaker = data().deepCopy(fields()[3].schema(), other.speaker);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.eventType)) {
        this.eventType = data().deepCopy(fields()[4].schema(), other.eventType);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'eventId' field.
      * @return The value.
      */
    public java.lang.Integer getEventId() {
      return eventId;
    }

    /**
      * Sets the value of the 'eventId' field.
      * @param value The value of 'eventId'.
      * @return This builder.
      */
    public com.example.event.schema.Event.Builder setEventId(int value) {
      validate(fields()[0], value);
      this.eventId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'eventId' field has been set.
      * @return True if the 'eventId' field has been set, false otherwise.
      */
    public boolean hasEventId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'eventId' field.
      * @return This builder.
      */
    public com.example.event.schema.Event.Builder clearEventId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'title' field.
      * @return The value.
      */
    public java.lang.CharSequence getTitle() {
      return title;
    }

    /**
      * Sets the value of the 'title' field.
      * @param value The value of 'title'.
      * @return This builder.
      */
    public com.example.event.schema.Event.Builder setTitle(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.title = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'title' field has been set.
      * @return True if the 'title' field has been set, false otherwise.
      */
    public boolean hasTitle() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'title' field.
      * @return This builder.
      */
    public com.example.event.schema.Event.Builder clearTitle() {
      title = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'place' field.
      * @return The value.
      */
    public java.lang.CharSequence getPlace() {
      return place;
    }

    /**
      * Sets the value of the 'place' field.
      * @param value The value of 'place'.
      * @return This builder.
      */
    public com.example.event.schema.Event.Builder setPlace(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.place = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'place' field has been set.
      * @return True if the 'place' field has been set, false otherwise.
      */
    public boolean hasPlace() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'place' field.
      * @return This builder.
      */
    public com.example.event.schema.Event.Builder clearPlace() {
      place = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'speaker' field.
      * @return The value.
      */
    public java.lang.CharSequence getSpeaker() {
      return speaker;
    }

    /**
      * Sets the value of the 'speaker' field.
      * @param value The value of 'speaker'.
      * @return This builder.
      */
    public com.example.event.schema.Event.Builder setSpeaker(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.speaker = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'speaker' field has been set.
      * @return True if the 'speaker' field has been set, false otherwise.
      */
    public boolean hasSpeaker() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'speaker' field.
      * @return This builder.
      */
    public com.example.event.schema.Event.Builder clearSpeaker() {
      speaker = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventType' field.
      * @return The value.
      */
    public java.lang.CharSequence getEventType() {
      return eventType;
    }

    /**
      * Sets the value of the 'eventType' field.
      * @param value The value of 'eventType'.
      * @return This builder.
      */
    public com.example.event.schema.Event.Builder setEventType(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.eventType = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'eventType' field has been set.
      * @return True if the 'eventType' field has been set, false otherwise.
      */
    public boolean hasEventType() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'eventType' field.
      * @return This builder.
      */
    public com.example.event.schema.Event.Builder clearEventType() {
      eventType = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Event build() {
      try {
        Event record = new Event();
        record.eventId = fieldSetFlags()[0] ? this.eventId : (java.lang.Integer) defaultValue(fields()[0]);
        record.title = fieldSetFlags()[1] ? this.title : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.place = fieldSetFlags()[2] ? this.place : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.speaker = fieldSetFlags()[3] ? this.speaker : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.eventType = fieldSetFlags()[4] ? this.eventType : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Event>
    WRITER$ = (org.apache.avro.io.DatumWriter<Event>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Event>
    READER$ = (org.apache.avro.io.DatumReader<Event>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
