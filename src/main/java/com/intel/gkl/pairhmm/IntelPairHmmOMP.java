package com.intel.gkl.pairhmm;

/**
 * Created by pnvaidya on 11/2/16.
 */
public class IntelPairHmmOMP extends IntelPairHmm  {


    static {
        setLibFileName("gkl_pairhmm_omp");
        setIsLoaded(false);
    }
}
