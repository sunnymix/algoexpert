package linked_lists;

/**
 * (hard)
 */

/*
init: (S = Slow, F = Fast)
 S|F
  1 -> 2 -> 3 -> 4 -> 5 -> 6
            ^______________|
move:
       S    F
  1 -> 2 -> 3 -> 4 -> 5 -> 6
            ^______________|
move:
            S         F
  1 -> 2 -> 3 -> 4 -> 5 -> 6
            ^______________|
move:
            F    S
  1 -> 2 -> 3 -> 4 -> 5 -> 6
            ^______________|
move:
  T--------------------------\
  D-------->P-------->R-----\ \
                     S|F     \ \
  1 -> 2 -> 3 -> 4 -> 5 -> 6 | |
            ^______________| | |
             \_______________| |
              \________________|
formula:
  S(dis) = D + P
  F(dis) = 2S = 2D + 2P
  F(dis) = T + P
  => T + P = 2D + 2P
  => T = 2D + P
  => R = T - D - P = (2D + P) - D - P = D
  => [R]SlowP -> LoopPoint = [D]HeadP -> LoopPoint
  => SlowP and HeadP will meet after R/D steps forward,
  so we find the LoopPoint when it meet the HeadPoint,
  and the exact value of R/D is not import at all.
 */

public class FindLoop {
    public static LinkedList findLoop(LinkedList head) {
        LinkedList fastP = head.next.next, slowP = head.next;
        while (fastP != slowP) {
            fastP = fastP.next.next;
            slowP = slowP.next;
        }
        LinkedList headP = head;
        while (headP != slowP) {
            headP = headP.next;
            slowP = slowP.next;
        }
        return headP;
    }
}
