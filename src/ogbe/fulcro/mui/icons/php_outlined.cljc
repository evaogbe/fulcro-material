(ns ogbe.fulcro.mui.icons.php-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PhpOutlined" :default PhpOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-php-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhpOutlined)))