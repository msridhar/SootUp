package sootup.codepropertygraph.propertygraph.nodes;

import sootup.core.jimple.basic.Value;
import sootup.core.jimple.common.ref.Ref;

public class RefGraphNode extends PropertyGraphNode implements ValueGraphNode {
  private final Ref ref;

  public RefGraphNode(Ref ref) {
    this.ref = ref;
  }

  public Ref getRef() {
    return ref;
  }

  @Override
  public Value getValue() {
    return ref;
  }

  @Override
  public boolean equals(Object o) {
    return this == o;
  }

  @Override
  public int hashCode() {
    return System.identityHashCode(this);
  }

  @Override
  public String toString() {
    return ref.toString();
  }
}
