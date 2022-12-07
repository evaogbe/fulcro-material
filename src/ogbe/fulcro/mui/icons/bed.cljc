(ns ogbe.fulcro.mui.icons.bed
  #?(:cljs (:require
            ["@mui/icons-material/Bed" :default Bed]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bed
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Bed)))