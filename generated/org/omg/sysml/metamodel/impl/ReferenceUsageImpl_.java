package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.AnalysisCaseUsage;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Classifier;
import org.omg.sysml.metamodel.ConnectionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.IndividualUsage;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.VariantMembership;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ReferenceUsageImpl.class)
public abstract class ReferenceUsageImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<ReferenceUsageImpl, Generalization> ownedGeneralization;
	public static volatile CollectionAttribute<ReferenceUsageImpl, PartUsage> nestedPart;
	public static volatile SingularAttribute<ReferenceUsageImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Usage> usage;
	public static volatile SingularAttribute<ReferenceUsageImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Subsetting> ownedSubsetting;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Type> type;
	public static volatile CollectionAttribute<ReferenceUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Feature> output;
	public static volatile CollectionAttribute<ReferenceUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<ReferenceUsageImpl, TransitionUsage> nestedTransition;
	public static volatile CollectionAttribute<ReferenceUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Usage> variant;
	public static volatile SingularAttribute<ReferenceUsageImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<ReferenceUsageImpl, StateUsage> nestedState;
	public static volatile SingularAttribute<ReferenceUsageImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Redefinition> ownedRedefinition;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Usage> flow;
	public static volatile SingularAttribute<ReferenceUsageImpl, UUID> identifier;
	public static volatile CollectionAttribute<ReferenceUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<ReferenceUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Feature> endFeature;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Type> referencedType;
	public static volatile SingularAttribute<ReferenceUsageImpl, Boolean> isEnd;
	public static volatile CollectionAttribute<ReferenceUsageImpl, ItemUsage> nestedItem;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Feature> input;
	public static volatile CollectionAttribute<ReferenceUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile SingularAttribute<ReferenceUsageImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Type> ownedType;
	public static volatile SingularAttribute<ReferenceUsageImpl, String> name;
	public static volatile CollectionAttribute<ReferenceUsageImpl, FeatureTyping> typing;
	public static volatile ListAttribute<ReferenceUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<ReferenceUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<ReferenceUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Classifier> referenceType;
	public static volatile CollectionAttribute<ReferenceUsageImpl, IndividualUsage> nestedIndividual;
	public static volatile ListAttribute<ReferenceUsageImpl, Membership> membership;
	public static volatile SingularAttribute<ReferenceUsageImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<ReferenceUsageImpl, ReferenceUsage> nestedReference;
	public static volatile SingularAttribute<ReferenceUsageImpl, Boolean> isVariation;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Feature> feature;
	public static volatile ListAttribute<ReferenceUsageImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<ReferenceUsageImpl, Element> member;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<ReferenceUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<ReferenceUsageImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Element> ownedElement;
	public static volatile CollectionAttribute<ReferenceUsageImpl, ActionUsage> nestedAction;
	public static volatile CollectionAttribute<ReferenceUsageImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<ReferenceUsageImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<ReferenceUsageImpl, Import> ownedImport;
	public static volatile SingularAttribute<ReferenceUsageImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<ReferenceUsageImpl, VariantMembership> variantMembership;
	public static volatile CollectionAttribute<ReferenceUsageImpl, ConnectionUsage> nestedConnection;
	public static volatile CollectionAttribute<ReferenceUsageImpl, InterfaceUsage> nestedInterface;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String NESTED_PART = "nestedPart";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String USAGE = "usage";
	public static final String IS_UNIQUE = "isUnique";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String NESTED_REQUIREMENT = "nestedRequirement";
	public static final String OUTPUT = "output";
	public static final String NESTED_PORT = "nestedPort";
	public static final String NESTED_TRANSITION = "nestedTransition";
	public static final String NESTED_CONSTRAINT = "nestedConstraint";
	public static final String VARIANT = "variant";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String NESTED_STATE = "nestedState";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String FLOW = "flow";
	public static final String IDENTIFIER = "identifier";
	public static final String NESTED_ATTRIBUTE = "nestedAttribute";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String NESTED_ANALYSIS_CASE = "nestedAnalysisCase";
	public static final String END_FEATURE = "endFeature";
	public static final String REFERENCED_TYPE = "referencedType";
	public static final String IS_END = "isEnd";
	public static final String NESTED_ITEM = "nestedItem";
	public static final String INPUT = "input";
	public static final String NESTED_CALCULATION = "nestedCalculation";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String OWNED_TYPE = "ownedType";
	public static final String NAME = "name";
	public static final String TYPING = "typing";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String NESTED_CASE = "nestedCase";
	public static final String REFERENCE_TYPE = "referenceType";
	public static final String NESTED_INDIVIDUAL = "nestedIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String NESTED_REFERENCE = "nestedReference";
	public static final String IS_VARIATION = "isVariation";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String NESTED_INTERFACE = "nestedInterface";

}

