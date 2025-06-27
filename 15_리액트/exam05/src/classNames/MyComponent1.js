import styles from './MyComponent1.module.scss';
import { useState } from 'react';
import classNames from 'classnames/bind';

const cx = classNames.bind(styles);

const MyComponent1 = () => {
  const [visible, setVisible] = useState(false);

  const onToggle = () => setVisible(!visible);

  return (
    <>
      <button type="button" onClick={onToggle}>
        얍
      </button>
      <h1 className={cx('one', 'two', { [styles.hidden]: !visible })}>
        안보이지롱
      </h1>
    </>
  );
};

export default MyComponent1;
