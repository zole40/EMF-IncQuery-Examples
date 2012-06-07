/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package system.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.viatra2.emf.incquery.runtime.derived.IncqueryFeatureHandler;
import org.eclipse.viatra2.emf.incquery.runtime.derived.IncqueryFeatureHandler.FeatureKind;
import org.eclipse.viatra2.emf.incquery.runtime.derived.IncqueryFeatureHelper;

import system.Data;
import system.SystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link system.impl.DataImpl#getReadingTaskIds <em>Reading Task Ids</em>}</li>
 *   <li>{@link system.impl.DataImpl#getWritingTaskIds <em>Writing Task Ids</em>}</li>
 *   <li>{@link system.impl.DataImpl#getWritingTask <em>Writing Task</em>}</li>
 *   <li>{@link system.impl.DataImpl#getReadingTask <em>Reading Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataImpl extends ResourceElementImpl implements Data {
	/**
	 * The cached value of the '{@link #getReadingTaskIds() <em>Reading Task Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingTaskIds()
	 * @generated
	 * @ordered
	 */
	protected EList readingTaskIds;

	/**
	 * The cached value of the '{@link #getWritingTaskIds() <em>Writing Task Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWritingTaskIds()
	 * @generated
	 * @ordered
	 */
	protected EList writingTaskIds;

	private IncqueryFeatureHandler writingTasksHandler;
	private IncqueryFeatureHandler readingTasksHandler;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected DataImpl() {
		super();
		
		/*IMatcherFactory wmf = MatcherFactoryRegistry.getMatcherFactory("system.queries.DataTaskWriteCorrespondence");
		IMatcherFactory rmf = MatcherFactoryRegistry.getMatcherFactory("system.queries.DataTaskReadCorrespondence");
		if (wmf != null) {
			writingTasksHandler = IncqueryFeatureHelper.createHandler(this,
					SystemPackage.Literals.DATA__WRITING_TASK, wmf, "Data", "Task",
					FeatureKind.MANY_REFERENCE);
		}
		if (rmf != null) {
			readingTasksHandler = IncqueryFeatureHelper.createHandler(this,
					SystemPackage.Literals.DATA__READING_TASK, rmf, "Data", "Task",
					FeatureKind.MANY_REFERENCE);
		}*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SystemPackage.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReadingTaskIds() {
		if (readingTaskIds == null) {
			readingTaskIds = new EDataTypeUniqueEList(String.class, this, SystemPackage.DATA__READING_TASK_IDS);
		}
		return readingTaskIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWritingTaskIds() {
		if (writingTaskIds == null) {
			writingTaskIds = new EDataTypeUniqueEList(String.class, this, SystemPackage.DATA__WRITING_TASK_IDS);
		}
		return writingTaskIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList getWritingTask() {
		if (writingTasksHandler == null) {
			writingTasksHandler = IncqueryFeatureHelper.createHandler(this, SystemPackage.Literals.DATA__WRITING_TASK,
					"system.queries.DataTaskWriteCorrespondence", "Data", "Task", FeatureKind.MANY_REFERENCE);
		}
		return IncqueryFeatureHelper.getManyReferenceValueForHandler(writingTasksHandler, this, SystemPackage.Literals.DATA__WRITING_TASK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList getReadingTask() {
		if (readingTasksHandler == null) {
			readingTasksHandler = IncqueryFeatureHelper.createHandler(this,
					SystemPackage.Literals.DATA__READING_TASK, "system.queries.DataTaskReadCorrespondence", "Data", "Task",
					FeatureKind.MANY_REFERENCE);
		}
		return IncqueryFeatureHelper.getManyReferenceValueForHandler(readingTasksHandler, this, SystemPackage.Literals.DATA__READING_TASK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SystemPackage.DATA__READING_TASK_IDS:
				return getReadingTaskIds();
			case SystemPackage.DATA__WRITING_TASK_IDS:
				return getWritingTaskIds();
			case SystemPackage.DATA__WRITING_TASK:
				return getWritingTask();
			case SystemPackage.DATA__READING_TASK:
				return getReadingTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SystemPackage.DATA__READING_TASK_IDS:
				getReadingTaskIds().clear();
				getReadingTaskIds().addAll((Collection)newValue);
				return;
			case SystemPackage.DATA__WRITING_TASK_IDS:
				getWritingTaskIds().clear();
				getWritingTaskIds().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SystemPackage.DATA__READING_TASK_IDS:
				getReadingTaskIds().clear();
				return;
			case SystemPackage.DATA__WRITING_TASK_IDS:
				getWritingTaskIds().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SystemPackage.DATA__READING_TASK_IDS:
				return readingTaskIds != null && !readingTaskIds.isEmpty();
			case SystemPackage.DATA__WRITING_TASK_IDS:
				return writingTaskIds != null && !writingTaskIds.isEmpty();
			case SystemPackage.DATA__WRITING_TASK:
				return !getWritingTask().isEmpty();
			case SystemPackage.DATA__READING_TASK:
				return !getReadingTask().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (readingTaskIds: ");
		result.append(readingTaskIds);
		result.append(", writingTaskIds: ");
		result.append(writingTaskIds);
		result.append(')');
		return result.toString();
	}

} //DataImpl