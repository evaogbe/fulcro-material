(ns ogbe.fulcro.mui.icons.person-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PersonSharp" :default PersonSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonSharp)))