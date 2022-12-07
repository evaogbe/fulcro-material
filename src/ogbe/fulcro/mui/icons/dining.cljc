(ns ogbe.fulcro.mui.icons.dining
  #?(:cljs (:require
            ["@mui/icons-material/Dining" :default Dining]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dining
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Dining)))