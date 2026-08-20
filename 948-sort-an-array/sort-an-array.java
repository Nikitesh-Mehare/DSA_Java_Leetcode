class Solution {
    public int[] sortArray(int[] nums) {

        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    static void mergeSort(int arr[], int left, int right)
	{
		//check if array has more than one element
		if(left < right)
		{
			//find middle element
			int mid = (left + right) / 2;
			//sort the left half recursively
			mergeSort(arr, left, mid); // recursion
			//sort the right half recursively
			mergeSort(arr, mid+1, right); // 
			//merger both sorted half
			merge(arr, left, mid, right);
		}
	}
    
    //function to merge two sorted arrays
	static void merge(int arr[], int left, int mid, int right)
	{
		//size of the left array 
		int n1 = mid - left + 1;
		//size of the right array
		int n2 = right - mid;
		
		//two temporary arrays 
		int L[] = new int[n1];
		int R[] = new int [n2];
		
		//copy the data into the temporary left array
		for(int i=0; i<n1; i++)
		{
			L[i] = arr[left+i];
		}
		//copy the data into the new temporary right array
		for(int j=0; j<n2; j++)
		{
			R[j] = arr[mid+1+j];
		}
		//initial indices
		int i = 0;
		int j = 0;
		int k = left;
		
		//compare and merge
		while(i < n1 && j < n2)
		{
			if(L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
		   k++;
		}
		//copy the remaining elements of the left array
		while(i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}
		//copy the remaining elements of the right array
		while(j < n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}