(ns ogbe.fulcro.mui.icons.ac-unit
  #?(:cljs (:require
            ["@mui/icons-material/AcUnit" :default AcUnit]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-ac-unit
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AcUnit)))