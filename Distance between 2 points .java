class Solution
{
    public int distance(int x1, int y1, int x2, int y2)
    {
        // Code here
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return (int)Math.round(dist);
    }
}
