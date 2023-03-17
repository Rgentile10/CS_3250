package Assignment2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class primeNumbers_Test {


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	// Here we will be testing what happens when we don'yt execute the fault!
	// input, int n = 
	@Test
	void ZeroInput_Test() {
		
		int n = 0;
		
		// Create new class PrimeNumbers Object to access its methods
		PrimeNumbers pn = new PrimeNumbers();
		
		// run the public method ComputePrimes
		pn.computePrimes(n);
		
		// Get Iterator (public) in order to access the private ArrayList_of_primes
        Iterator<Integer> PrimeNumbersIterator = pn.iterator();
        
      
        // Traverse prime elements computed by computePrimes() using iterator
        List<Integer> actual_list = new ArrayList<Integer>();
        
        while(PrimeNumbersIterator.hasNext()){
        	actual_list.add(PrimeNumbersIterator.next());        
         } 
        
        // manually input the expected data
        
        ArrayList<Integer> expected_list = new ArrayList<Integer>(n);
        //expected_list.add(NOTHING!!); want it to be null
        
        //TEST ORACLE: A = E = [2]... checking the compute primes function and the public PrimeNumber helper methods to access pn.primes! 
        assertEquals(actual_list, expected_list);
        assertEquals(actual_list.toString(),pn.toString());
		
	}
	
	@Test
	void OneNumberToAvoidingFault_Test() {
		
		int n = 1;
		
		// Create new class PrimeNumbers Object to access its methods
		PrimeNumbers pn = new PrimeNumbers();
		
		// run the public method ComputePrimes
		pn.computePrimes(n);
		
		// Get Iterator (public) in order to access the private ArrayList_of_primes
        Iterator<Integer> PrimeNumbersIterator = pn.iterator();
        
      
        // Traverse prime elements computed by computePrimes() using iterator
        List<Integer> actual_list = new ArrayList<Integer>();
        
        while(PrimeNumbersIterator.hasNext()){
        	actual_list.add(PrimeNumbersIterator.next());        
         } 
        
        // manually input the expected data
        
        ArrayList<Integer> expected_list = new ArrayList<Integer>(n);
        expected_list.add(2);
        
        //TEST ORACLE: A = E = [2]... checking the compute primes function and the public PrimeNumber helper methods to access pn.primes! 
        assertEquals(actual_list, expected_list);
        assertEquals(actual_list.toString(),pn.toString());
		
	}
	
	@Test
	void FirstFivePrimeNumbers_Test() {
		
		int n = 5;
		
		// Create new class PrimeNumbers Object to access its methods
		PrimeNumbers pn = new PrimeNumbers();
		
		// run the public method ComputePrimes
		pn.computePrimes(n);
		
		// Get Iterator (public) in order to access the private ArrayList_of_primes
        Iterator<Integer> PrimeNumbersIterator = pn.iterator();
        
      
        // Traverse prime elements computed by computePrimes() using iterator
        List<Integer> actual_list = new ArrayList<Integer>();
        
        while(PrimeNumbersIterator.hasNext()){
        	actual_list.add(PrimeNumbersIterator.next());        
         } 
        
        // manually input the expected data
        
        ArrayList<Integer> expected_list = new ArrayList<Integer>(n);
        expected_list.add(2);
        expected_list.add(3);
        expected_list.add(5);
        expected_list.add(7);
        expected_list.add(11);
        
        
        //TEST ORACLE: A = E = [2]... checking the compute primes function and the public PrimeNumber helper methods to access pn.primes! 
        assertEquals(actual_list, expected_list);
        assertEquals(actual_list.toString(),pn.toString());
		
	}
	
	@Test
	void FirstSixPrimeNumbers_Test() {
		
		int n = 6;
		
		// Create new class PrimeNumbers Object to access its methods
		PrimeNumbers pn = new PrimeNumbers();
		
		// run the public method ComputePrimes
		pn.computePrimes(n);
		
		// Get Iterator (public) in order to access the private ArrayList_of_primes
        Iterator<Integer> PrimeNumbersIterator = pn.iterator();
        
      
        // Traverse prime elements computed by computePrimes() using iterator
        List<Integer> actual_list = new ArrayList<Integer>();
        
        while(PrimeNumbersIterator.hasNext()){
        	actual_list.add(PrimeNumbersIterator.next());        
         } 
        
        // manually input the expected data
        
        ArrayList<Integer> expected_list = new ArrayList<Integer>(n);
        expected_list.add(2);
        expected_list.add(3);
        expected_list.add(5);
        expected_list.add(7);
        expected_list.add(11);
        expected_list.add(13);
        
        
        //TEST ORACLE: A = E = [2]... checking the compute primes function and the public PrimeNumber helper methods to access pn.primes! 
        assertEquals(actual_list, expected_list);
        assertEquals(actual_list.toString(),pn.toString());
		
	}
	
	@Test
	void First8PrimeNumbers_Test() {
		
		int n = 8;
		
		// Create new class PrimeNumbers Object to access its methods
		PrimeNumbers pn = new PrimeNumbers();
		
		// run the public method ComputePrimes
		pn.computePrimes(n);
		
		// Get Iterator (public) in order to access the private ArrayList_of_primes
        Iterator<Integer> PrimeNumbersIterator = pn.iterator();
        
      
        // Traverse prime elements computed by computePrimes() using iterator
        List<Integer> actual_list = new ArrayList<Integer>();
        
        while(PrimeNumbersIterator.hasNext()){
        	actual_list.add(PrimeNumbersIterator.next());        
         } 
        
        // manually input the expected data
        
        ArrayList<Integer> expected_list = new ArrayList<Integer>(n);
        expected_list.add(2);
        expected_list.add(3);
        expected_list.add(5);
        expected_list.add(7);
        expected_list.add(11);
        expected_list.add(13);
        expected_list.add(17);
        expected_list.add(19);
        
        
        //TEST ORACLE: A = E = [2]... checking the compute primes function and the public PrimeNumber helper methods to access pn.primes! 
        assertEquals(actual_list, expected_list);
        assertEquals(actual_list.toString(),pn.toString());
		
	}

}
