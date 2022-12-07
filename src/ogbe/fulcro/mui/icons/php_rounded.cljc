(ns ogbe.fulcro.mui.icons.php-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PhpRounded" :default PhpRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-php-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhpRounded)))