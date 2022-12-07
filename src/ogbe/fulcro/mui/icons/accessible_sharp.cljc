(ns ogbe.fulcro.mui.icons.accessible-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AccessibleSharp" :default AccessibleSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-accessible-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccessibleSharp)))