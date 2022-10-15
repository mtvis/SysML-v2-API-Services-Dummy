package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.AllocationUsage;
import org.omg.sysml.metamodel.AnalysisCaseUsage;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Class;
import org.omg.sysml.metamodel.Classifier;
import org.omg.sysml.metamodel.ConcernUsage;
import org.omg.sysml.metamodel.ConnectorAsUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Differencing;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EnumerationUsage;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureChaining;
import org.omg.sysml.metamodel.FeatureDirectionKind;
import org.omg.sysml.metamodel.FeatureInverting;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.FlowConnectionUsage;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.Intersecting;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.MetadataUsage;
import org.omg.sysml.metamodel.OccurrenceUsage;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.PortionKind;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.TypeFeaturing;
import org.omg.sysml.metamodel.Unioning;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.UseCaseUsage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DecisionNodeImpl.class)
public abstract class DecisionNodeImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile ListAttribute<DecisionNodeImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile ListAttribute<DecisionNodeImpl, Usage> usage;
	public static volatile CollectionAttribute<DecisionNodeImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<DecisionNodeImpl, Type> type;
	public static volatile ListAttribute<DecisionNodeImpl, RequirementUsage> nestedRequirement;
	public static volatile ListAttribute<DecisionNodeImpl, Feature> output;
	public static volatile ListAttribute<DecisionNodeImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<DecisionNodeImpl, TransitionUsage> nestedTransition;
	public static volatile ListAttribute<DecisionNodeImpl, ConstraintUsage> nestedConstraint;
	public static volatile SingularAttribute<DecisionNodeImpl, Boolean> isSufficient;
	public static volatile ListAttribute<DecisionNodeImpl, Differencing> ownedDifferencing;
	public static volatile CollectionAttribute<DecisionNodeImpl, Redefinition> ownedRedefinition;
	public static volatile ListAttribute<DecisionNodeImpl, TextualRepresentation> textualRepresentation;
	public static volatile SingularAttribute<DecisionNodeImpl, Boolean> isLibraryElement;
	public static volatile ListAttribute<DecisionNodeImpl, AttributeUsage> nestedAttribute;
	public static volatile ListAttribute<DecisionNodeImpl, EnumerationUsage> nestedEnumeration;
	public static volatile ListAttribute<DecisionNodeImpl, Feature> ownedFeature;
	public static volatile ListAttribute<DecisionNodeImpl, Documentation> documentation;
	public static volatile ListAttribute<DecisionNodeImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile ListAttribute<DecisionNodeImpl, Behavior> actionDefinition;
	public static volatile ListAttribute<DecisionNodeImpl, Feature> directedFeature;
	public static volatile ListAttribute<DecisionNodeImpl, Feature> input;
	public static volatile ListAttribute<DecisionNodeImpl, CalculationUsage> nestedCalculation;
	public static volatile ListAttribute<DecisionNodeImpl, ViewUsage> nestedView;
	public static volatile SingularAttribute<DecisionNodeImpl, String> shortName;
	public static volatile ListAttribute<DecisionNodeImpl, Element> ownedMember;
	public static volatile ListAttribute<DecisionNodeImpl, OccurrenceUsage> nestedOccurrence;
	public static volatile ListAttribute<DecisionNodeImpl, AllocationUsage> nestedAllocation;
	public static volatile SingularAttribute<DecisionNodeImpl, Boolean> isPortion;
	public static volatile ListAttribute<DecisionNodeImpl, ReferenceUsage> nestedReference;
	public static volatile SingularAttribute<DecisionNodeImpl, Boolean> isReadOnly;
	public static volatile SingularAttribute<DecisionNodeImpl, Boolean> isVariation;
	public static volatile ListAttribute<DecisionNodeImpl, Feature> feature;
	public static volatile ListAttribute<DecisionNodeImpl, Element> member;
	public static volatile SingularAttribute<DecisionNodeImpl, Boolean> isReference;
	public static volatile ListAttribute<DecisionNodeImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<DecisionNodeImpl, Behavior> behavior;
	public static volatile SingularAttribute<DecisionNodeImpl, String> effectiveName;
	public static volatile ListAttribute<DecisionNodeImpl, Membership> importedMembership;
	public static volatile ListAttribute<DecisionNodeImpl, Element> ownedElement;
	public static volatile ListAttribute<DecisionNodeImpl, String> aliasIds;
	public static volatile ListAttribute<DecisionNodeImpl, FeatureMembership> featureMembership;
	public static volatile SingularAttribute<DecisionNodeImpl, PortionKind> portionKind;
	public static volatile SingularAttribute<DecisionNodeImpl, Boolean> isAbstract;
	public static volatile ListAttribute<DecisionNodeImpl, MetadataUsage> nestedMetadata;
	public static volatile ListAttribute<DecisionNodeImpl, RenderingUsage> nestedRendering;
	public static volatile ListAttribute<DecisionNodeImpl, ConnectorAsUsage> nestedConnection;
	public static volatile ListAttribute<DecisionNodeImpl, Type> unioningType;
	public static volatile ListAttribute<DecisionNodeImpl, InterfaceUsage> nestedInterface;
	public static volatile ListAttribute<DecisionNodeImpl, Specialization> ownedSpecialization;
	public static volatile ListAttribute<DecisionNodeImpl, ViewpointUsage> nestedViewpoint;
	public static volatile CollectionAttribute<DecisionNodeImpl, FeatureInverting> ownedFeatureInverting;
	public static volatile ListAttribute<DecisionNodeImpl, Usage> directedUsage;
	public static volatile ListAttribute<DecisionNodeImpl, PartUsage> nestedPart;
	public static volatile ListAttribute<DecisionNodeImpl, Feature> chainingFeature;
	public static volatile SingularAttribute<DecisionNodeImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<DecisionNodeImpl, Boolean> isUnique;
	public static volatile ListAttribute<DecisionNodeImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<DecisionNodeImpl, Usage> variant;
	public static volatile ListAttribute<DecisionNodeImpl, StateUsage> nestedState;
	public static volatile SingularAttribute<DecisionNodeImpl, Boolean> isOrdered;
	public static volatile SingularAttribute<DecisionNodeImpl, UUID> elementId;
	public static volatile SingularAttribute<DecisionNodeImpl, Boolean> isDerived;
	public static volatile ListAttribute<DecisionNodeImpl, Annotation> ownedAnnotation;
	public static volatile SingularAttribute<DecisionNodeImpl, String> qualifiedName;
	public static volatile ListAttribute<DecisionNodeImpl, Type> intersectingType;
	public static volatile ListAttribute<DecisionNodeImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile ListAttribute<DecisionNodeImpl, Feature> endFeature;
	public static volatile SingularAttribute<DecisionNodeImpl, Boolean> isEnd;
	public static volatile ListAttribute<DecisionNodeImpl, ItemUsage> nestedItem;
	public static volatile ListAttribute<DecisionNodeImpl, Type> featuringType;
	public static volatile SingularAttribute<DecisionNodeImpl, Boolean> isComposite;
	public static volatile SingularAttribute<DecisionNodeImpl, String> name;
	public static volatile ListAttribute<DecisionNodeImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<DecisionNodeImpl, FlowConnectionUsage> nestedFlow;
	public static volatile ListAttribute<DecisionNodeImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<DecisionNodeImpl, Disjoining> ownedDisjoining;
	public static volatile SingularAttribute<DecisionNodeImpl, Boolean> isIndividual;
	public static volatile ListAttribute<DecisionNodeImpl, Membership> membership;
	public static volatile SingularAttribute<DecisionNodeImpl, Boolean> isImpliedIncluded;
	public static volatile SingularAttribute<DecisionNodeImpl, Boolean> isNonunique;
	public static volatile ListAttribute<DecisionNodeImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile ListAttribute<DecisionNodeImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<DecisionNodeImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<DecisionNodeImpl, Feature> parameter;
	public static volatile ListAttribute<DecisionNodeImpl, Class> occurrenceDefinition;
	public static volatile ListAttribute<DecisionNodeImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<DecisionNodeImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<DecisionNodeImpl, Classifier> definition;
	public static volatile ListAttribute<DecisionNodeImpl, UseCaseUsage> nestedUseCase;
	public static volatile SingularAttribute<DecisionNodeImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<DecisionNodeImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<DecisionNodeImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<DecisionNodeImpl, ConcernUsage> nestedConcern;
	public static volatile ListAttribute<DecisionNodeImpl, Import> ownedImport;
	public static volatile ListAttribute<DecisionNodeImpl, Type> differencingType;
	public static volatile CollectionAttribute<DecisionNodeImpl, VariantMembership> variantMembership;
	public static volatile ListAttribute<DecisionNodeImpl, Unioning> ownedUnioning;
	public static volatile ListAttribute<DecisionNodeImpl, Intersecting> ownedIntersecting;

	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String USAGE = "usage";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String NESTED_REQUIREMENT = "nestedRequirement";
	public static final String OUTPUT = "output";
	public static final String NESTED_PORT = "nestedPort";
	public static final String NESTED_TRANSITION = "nestedTransition";
	public static final String NESTED_CONSTRAINT = "nestedConstraint";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String OWNED_DIFFERENCING = "ownedDifferencing";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String TEXTUAL_REPRESENTATION = "textualRepresentation";
	public static final String IS_LIBRARY_ELEMENT = "isLibraryElement";
	public static final String NESTED_ATTRIBUTE = "nestedAttribute";
	public static final String NESTED_ENUMERATION = "nestedEnumeration";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String DOCUMENTATION = "documentation";
	public static final String NESTED_ANALYSIS_CASE = "nestedAnalysisCase";
	public static final String ACTION_DEFINITION = "actionDefinition";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String INPUT = "input";
	public static final String NESTED_CALCULATION = "nestedCalculation";
	public static final String NESTED_VIEW = "nestedView";
	public static final String SHORT_NAME = "shortName";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String NESTED_OCCURRENCE = "nestedOccurrence";
	public static final String NESTED_ALLOCATION = "nestedAllocation";
	public static final String IS_PORTION = "isPortion";
	public static final String NESTED_REFERENCE = "nestedReference";
	public static final String IS_READ_ONLY = "isReadOnly";
	public static final String IS_VARIATION = "isVariation";
	public static final String FEATURE = "feature";
	public static final String MEMBER = "member";
	public static final String IS_REFERENCE = "isReference";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String BEHAVIOR = "behavior";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String ALIAS_IDS = "aliasIds";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String PORTION_KIND = "portionKind";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String NESTED_METADATA = "nestedMetadata";
	public static final String NESTED_RENDERING = "nestedRendering";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String UNIONING_TYPE = "unioningType";
	public static final String NESTED_INTERFACE = "nestedInterface";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String NESTED_VIEWPOINT = "nestedViewpoint";
	public static final String OWNED_FEATURE_INVERTING = "ownedFeatureInverting";
	public static final String DIRECTED_USAGE = "directedUsage";
	public static final String NESTED_PART = "nestedPart";
	public static final String CHAINING_FEATURE = "chainingFeature";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String IS_UNIQUE = "isUnique";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String VARIANT = "variant";
	public static final String NESTED_STATE = "nestedState";
	public static final String IS_ORDERED = "isOrdered";
	public static final String ELEMENT_ID = "elementId";
	public static final String IS_DERIVED = "isDerived";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String INTERSECTING_TYPE = "intersectingType";
	public static final String NESTED_VERIFICATION_CASE = "nestedVerificationCase";
	public static final String END_FEATURE = "endFeature";
	public static final String IS_END = "isEnd";
	public static final String NESTED_ITEM = "nestedItem";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String NAME = "name";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String NESTED_FLOW = "nestedFlow";
	public static final String NESTED_CASE = "nestedCase";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String IS_INDIVIDUAL = "isIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_IMPLIED_INCLUDED = "isImpliedIncluded";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String OWNED_FEATURE_CHAINING = "ownedFeatureChaining";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String OCCURRENCE_DEFINITION = "occurrenceDefinition";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String DEFINITION = "definition";
	public static final String NESTED_USE_CASE = "nestedUseCase";
	public static final String DIRECTION = "direction";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String NESTED_CONCERN = "nestedConcern";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String DIFFERENCING_TYPE = "differencingType";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String OWNED_UNIONING = "ownedUnioning";
	public static final String OWNED_INTERSECTING = "ownedIntersecting";

}

