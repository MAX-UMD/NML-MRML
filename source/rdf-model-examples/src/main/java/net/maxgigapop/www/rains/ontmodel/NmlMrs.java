/* CVS $Id: $ */
package net.maxgigapop.www.rains.ontmodel; 
import com.hp.hpl.jena.rdf.model.*;
 
/**
 * Vocabulary definitions from /Users/xyang/Work/RAINS/nml-mrs-model/rains-owl-model/src/main/resources/nml-mrs-ext.owl 
 * @author Auto-generated by schemagen on 31 Mar 2014 15:54 
 */
public class NmlMrs {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://schemas.ogf.org/mrs/2013/12/topology#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    public static final Property average_iops_4kb_read = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#average_iops_4kb_read" );
    
    public static final Property average_iops_4kb_write = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#average_iops_4kb_write" );
    
    public static final Property average_rate_kbps = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#average_rate_kbps" );
    
    public static final Property burst_size_byte = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#burst_size_byte" );
    
    public static final Property capability = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#capability" );
    
    public static final Property capacity = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#capacity" );
    
    public static final Property disk_gb = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#disk_gb" );
    
    public static final Property hasBenchmark = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#hasBenchmark" );
    
    public static final Property latency_usec = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#latency_usec" );
    
    public static final Property line_rate_kbps = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#line_rate_kbps" );
    
    public static final Property localAddress = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#localAddress" );
    
    public static final Property maximum_iops_4kb_read = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#maximum_iops_4kb_read" );
    
    public static final Property maximum_iops_4kb_write = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#maximum_iops_4kb_write" );
    
    public static final Property maximum_object_size = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#maximum_object_size" );
    
    public static final Property memory_mb = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#memory_mb" );
    
    public static final Property nextHop = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#nextHop" );
    
    public static final Property num_core = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#num_core" );
    
    public static final Property peak_rate_kbps = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#peak_rate_kbps" );
    
    public static final Property prefix = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#prefix" );
    
    public static final Property providedByService = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#providedByService" );
    
    public static final Property providesBenchmark = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#providesBenchmark" );
    
    public static final Property providesBucket = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#providesBucket" );
    
    public static final Property providesRoute = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#providesRoute" );
    
    public static final Property providesVM = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#providesVM" );
    
    public static final Property providesVNic = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#providesVNic" );
    
    public static final Property providesVolume = m_model.createProperty( "http://schemas.ogf.org/mrs/2013/12/topology#providesVolume" );
    
    public static final Resource Address = m_model.createResource( "http://schemas.ogf.org/mrs/2013/12/topology#Address" );
    
    public static final Resource BlockStorageService = m_model.createResource( "http://schemas.ogf.org/mrs/2013/12/topology#BlockStorageService" );
    
    public static final Resource Bucket = m_model.createResource( "http://schemas.ogf.org/mrs/2013/12/topology#Bucket" );
    
    public static final Resource ClusterNetworkService = m_model.createResource( "http://schemas.ogf.org/mrs/2013/12/topology#ClusterNetworkService" );
    
    public static final Resource GenericCapabilityService = m_model.createResource( "http://schemas.ogf.org/mrs/2013/12/topology#GenericCapabilityService" );
    
    public static final Resource HypervisorBypassInterfaceService = m_model.createResource( "http://schemas.ogf.org/mrs/2013/12/topology#HypervisorBypassInterfaceService" );
    
    public static final Resource HypervisorService = m_model.createResource( "http://schemas.ogf.org/mrs/2013/12/topology#HypervisorService" );
    
    public static final Resource IOPerformanceMeasurementService = m_model.createResource( "http://schemas.ogf.org/mrs/2013/12/topology#IOPerformanceMeasurementService" );
    
    public static final Resource ObjectStorageService = m_model.createResource( "http://schemas.ogf.org/mrs/2013/12/topology#ObjectStorageService" );
    
    public static final Resource POSIX_IOBenchmark = m_model.createResource( "http://schemas.ogf.org/mrs/2013/12/topology#POSIX_IOBenchmark" );
    
    public static final Resource Route = m_model.createResource( "http://schemas.ogf.org/mrs/2013/12/topology#Route" );
    
    public static final Resource RoutingService = m_model.createResource( "http://schemas.ogf.org/mrs/2013/12/topology#RoutingService" );
    
    public static final Resource S3_IOBenchmark = m_model.createResource( "http://schemas.ogf.org/mrs/2013/12/topology#S3_IOBenchmark" );
    
    public static final Resource StorageService = m_model.createResource( "http://schemas.ogf.org/mrs/2013/12/topology#StorageService" );
    
    public static final Resource VirtualSwitchService = m_model.createResource( "http://schemas.ogf.org/mrs/2013/12/topology#VirtualSwitchService" );
    
    public static final Resource Volume = m_model.createResource( "http://schemas.ogf.org/mrs/2013/12/topology#Volume" );
    
}
