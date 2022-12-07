(ns ogbe.fulcro.mui.icons.php
  #?(:cljs (:require
            ["@mui/icons-material/Php" :default Php]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-php
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Php)))