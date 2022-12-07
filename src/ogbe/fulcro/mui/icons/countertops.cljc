(ns ogbe.fulcro.mui.icons.countertops
  #?(:cljs (:require
            ["@mui/icons-material/Countertops" :default Countertops]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-countertops
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Countertops)))