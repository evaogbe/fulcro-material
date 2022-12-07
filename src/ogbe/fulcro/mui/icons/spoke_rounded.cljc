(ns ogbe.fulcro.mui.icons.spoke-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SpokeRounded" :default SpokeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-spoke-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpokeRounded)))