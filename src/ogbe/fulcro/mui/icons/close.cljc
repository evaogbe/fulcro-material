(ns ogbe.fulcro.mui.icons.close
  #?(:cljs (:require
            ["@mui/icons-material/Close" :default Close]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-close
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Close)))