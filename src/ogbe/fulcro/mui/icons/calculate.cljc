(ns ogbe.fulcro.mui.icons.calculate
  #?(:cljs (:require
            ["@mui/icons-material/Calculate" :default Calculate]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-calculate
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Calculate)))