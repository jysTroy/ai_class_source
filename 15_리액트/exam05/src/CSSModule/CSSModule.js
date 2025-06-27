import styles from './CSSModule.module.scss';
console.log('styles', styles);

const CSSModule = () => {
  return (
    <div className={`${styles.wrapper}`}>
      가고싶어요 저는 <span className="something">집!</span>
    </div>
  );
};

export default CSSModule;
