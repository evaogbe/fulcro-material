(ns ogbe.fulcro.mui.icons.commute
  #?(:cljs (:require
            ["@mui/icons-material/Commute" :default Commute]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-commute
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Commute)))