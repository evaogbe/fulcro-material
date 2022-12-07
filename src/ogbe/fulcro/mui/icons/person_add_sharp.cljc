(ns ogbe.fulcro.mui.icons.person-add-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PersonAddSharp" :default PersonAddSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-add-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonAddSharp)))