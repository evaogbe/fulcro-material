(ns ogbe.fulcro.mui.icons.spoke-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SpokeSharp" :default SpokeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-spoke-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpokeSharp)))