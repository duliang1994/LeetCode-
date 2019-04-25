class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not strs: return ''
        l = 0
        
        for cg in zip(*strs):
            
            if len(set(cg)) > 1:
                return strs[0][:l]
            l += 1
        return strs[0][:l]
class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not strs: return ''
        strs.sort()
        n = min(len(strs[0]), len(strs[-1]))
        i = 0
        
        while i < n and strs[0][i] == strs[-1][i]:
            i += 1
            
        return strs[0][:i]
