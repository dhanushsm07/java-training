package com.training.serializationAndDeserialization.externalizable;

import java.io.*;

// Externalizable class with versioning + transient field
class Employee implements Externalizable {

    // Version ID for serialization compatibility
    private static final long serialVersionUID = 10L;

    String name;
    int id;

    // This field should NOT be serialized
    transient String password;

    // Required no-arg constructor
    public Employee() {}

    public Employee(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeInt(id);

        // We are intentionally NOT writing password
        // (transient + not written by design)
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        id = in.readInt();

        // password was never written → stays null
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", password='" + password + "'}";
    }
}
