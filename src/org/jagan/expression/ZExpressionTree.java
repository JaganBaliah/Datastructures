package org.jagan.expression;

import java.util.Scanner;

public class ZExpressionTree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("- + - 3 2 - 5 4 1");
        ExpTree expTree = new ExpTree(scanner);
        System.out.println("Evaluate value : " + expTree.evaluate());
        System.out.println("");
        System.out.println("Prefix traverse....");
        expTree.traversePrefix();
        System.out.println("");
        System.out.println("");
        System.out.println("Postfix traverse....");
        expTree.traversePostfix();
        System.out.println("");
        System.out.println("");
        System.out.println("Infix traverse....");
        expTree.traverseInfix();
        System.out.println("");

    }

    static class ExpTree {
        Node root;

        public ExpTree(Scanner scanner) {
            this.root = build(scanner);
        }


        private Node build(Scanner scanner) {
            if(scanner.hasNextInt()) {
                return new Node(true, "" + scanner.nextInt());
            } else {
                Node node = new Node(false, scanner.next());
                node.left = build(scanner);
                node.right = build(scanner);
                return node;
            }
        }

        public int evaluate() {
            return this.evaluate(root);
        }

        public int evaluate(Node node) {
            if (node.leaf) {
                return Integer.parseInt(node.val);
            } else {
                String op = node.val;
                int leftVal = evaluate(node.left);
                int rightVal = evaluate(node.right);
                int rtnVal = 0;
                switch (op) {
                    case "+" : rtnVal = leftVal + rightVal; break;
                    case "-" : rtnVal = leftVal - rightVal; break;
                    case "*" : rtnVal = leftVal * rightVal; break;
                    case "/" : rtnVal = leftVal / rightVal; break;
                }
                return rtnVal;
            }
        }

        public void traversePrefix() {
            prefix(this.root);
        }

        private void prefix(Node node) {
            if (node.leaf) {
                System.out.print(" " + node.val + " ");
            } else {
                System.out.print(" " + node.val + " ");
                prefix(node.left);
                prefix(node.right);
            }
        }

        public void traversePostfix() {
            postfix(this.root);
        }

        private void postfix(Node node) {
            if (node.leaf) {
                System.out.print(" " + node.val + " ");
            } else {
                postfix(node.left);
                postfix(node.right);
                System.out.print(" " + node.val + " ");
            }
        }

        public void traverseInfix() {
            infix(this.root);
        }

        private void infix(Node node) {
            if (node.leaf) {
                System.out.print(" " + node.val + " ");
            } else {
                System.out.print("(");
                infix(node.left);
                System.out.print(" " + node.val + " ");
                infix(node.right);
                System.out.print(")");
            }
        }

        class Node {
            boolean leaf;
            String val;
            Node left;
            Node right;

            public Node(boolean leaf, String val) {
                this.leaf = leaf;
                this.val = val;
            }

        }
    }


}
