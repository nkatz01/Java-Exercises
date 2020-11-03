<?php



function merge(  $array){
	
	 
	
if (count($array)==1){
 	
	return  $array;
}
 
 
 
  else{
	 
	 
	 
			$leftArr=array_slice($array, 0, ((count($array)/2)));
			$rightArr=array_slice($array, ((count($array)/2)));
		 
			
			
			
			 if ($leftArr[count($leftArr)-1]>$rightArr[0]){
			$temp=$leftArr[count($leftArr)-1];
			$leftArr[count($leftArr)-1]=$rightArr[0] ;
			$rightArr[0]=$temp;
			 }
			 
			return array_merge(merge(      $leftArr  ), merge(   $rightArr   ) ); 
			
		 
		   
		  
		
		

		
	 }
	  
}
 
 

 function mergeSort($length, $array){
	  
	if($length==1){
		return merge($array);  
	}
$array= mergeSort(--$length,$array);
	 
	$array= merge($array);
	 return $array;
	
	
	 
	
}




  $array = mergeSort(4 ,array(13 ,47 ,200, 53 ,0, 100 ,33, 8 ,31, 75, 123 ,47 ,99 ));//1 8 4 13 99 23 17 7 25 ||   13 99 47 0 23 13 86 || 13 47 200 53 0 100 33 8 31 75 123 47 99 || 1 ,8 ,4, 13, 99, 23, 17, 7 ,25
  print_r( $array).'<br>';
 
 