package com.demo.coding.common;

public class TreeNode<T extends Comparable<?>> {
    public Integer val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(Integer x) {
        val = x;
        left = null;
        right = null;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((val == null) ? 0 : val.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TreeNode other = (TreeNode) obj;
        if (val == null) {
            if (other.val != null)
                return false;
        } else if (!val.equals(other.val))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "TreeNode [val=" + val + "]";
    }
}
