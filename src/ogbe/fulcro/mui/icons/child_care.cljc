(ns ogbe.fulcro.mui.icons.child-care
  #?(:cljs (:require
            ["@mui/icons-material/ChildCare" :default ChildCare]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-child-care
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChildCare)))