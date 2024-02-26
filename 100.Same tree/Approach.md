# Intuition
I considered recursion because a tree is composed of nodes, so we will always be dealing with nodes inside the tree, with the same object recurring over and again. This recursive nature of trees makes recursion a natural choice for traversing and comparing binary trees.

# Approach
1.  If both `p` and `q` are `nullptr`, return `true` because two empty trees are considered the same.
2.  If either `p` or `q` is `nullptr` (but not both), return `false`.
3.  If the values of `p` and `q` are not equal, return `false` because the trees cannot be the same if their root values are different.
4.  Recursively  the left subtree of `p` & the left subtree of `q` as well as the right subtree of `p`& the right subtree of `q`.

  >  If all conditions hold true, return `true`.
