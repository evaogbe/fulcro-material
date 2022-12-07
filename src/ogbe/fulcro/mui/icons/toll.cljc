(ns ogbe.fulcro.mui.icons.toll
  #?(:cljs (:require
            ["@mui/icons-material/Toll" :default Toll]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toll
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Toll)))